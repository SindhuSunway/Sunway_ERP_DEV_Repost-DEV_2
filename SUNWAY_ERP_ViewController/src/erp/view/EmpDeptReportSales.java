package erp.view;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.type.WhenNoDataTypeEnum;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.binding.BindingContainer;

public class EmpDeptReportSales
{
  public EmpDeptReportSales()
  {
  }


    public String runReport()
  {System.out.println("Run Reort Action");
    //DCIteratorBinding eIter = (DCIteratorBinding) getBindings().get("HrEmplInfoView1Iterator");
    String dept = "Admin";
    Map m = new HashMap();
    m.put("dept", dept);
      
    try
    {
      runReport("NewEmpRepIT.jasper", m);
        System.out.println(" calling Jasper reports");
    }
    catch (Exception e)
    {System.out.println("Unable to call jasper reports"+e);
    }
    return null;
  }

    public BindingContainer getBindings()
  {
    return BindingContext.getCurrent().getCurrentBindingsEntry();
  }
 
  public Connection getDataSourceConnection(String dataSourceName)
      throws Exception
    {
      Context ctx = new InitialContext();
      DataSource ds = (DataSource)ctx.lookup(dataSourceName);
      return ds.getConnection();
    }
 
  private Connection getConnection() throws Exception
  {
    return getDataSourceConnection("java:comp/env/jdbc/sunway_erp_oracle_conDS");// datasource name should be defined in weblogic
  }
 
  public  ServletContext getContext()
    {
      return (ServletContext)getFacesContext().getExternalContext().getContext();
    }
  public  HttpServletResponse getResponse()
    {
      return (HttpServletResponse)getFacesContext().getExternalContext().getResponse();
    }
  public static FacesContext getFacesContext()
    {
      return FacesContext.getCurrentInstance();
    }
  public void runReport(String repPath, java.util.Map param) throws Exception
  {
    Connection conn = null;
    try
    {
      HttpServletResponse response = getResponse();
      ServletOutputStream out = response.getOutputStream();
      response.setHeader("Cache-Control", "max-age=0");
      response.setContentType("application/pdf");
      ServletContext context = getContext();
      InputStream fs = context.getResourceAsStream("/Reports/" + repPath);
        System.out.println("Path"+fs);
      JasperReport template = (JasperReport) JRLoader.loadObject(fs);
      template.setWhenNoDataType(WhenNoDataTypeEnum.ALL_SECTIONS_NO_DETAIL);
      conn = getConnection();
      JasperPrint print = JasperFillManager.fillReport(template, param, conn);
        String filepath = "C:/Reports/";  
        String reportname = "sample2.txt"; 
        OutputStream os = new FileOutputStream(new File(filepath + reportname));  
        JasperExportManager.exportReportToPdfStream(print, os);
        JasperViewer.viewReport(print, false);
        System.out.println("Output file created");
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      JasperExportManager.exportReportToPdfStream(print, baos);
      out.write(baos.toByteArray());
      out.flush();
      out.close();
      FacesContext.getCurrentInstance().responseComplete();
    }
    catch (Exception jex)
    {
      jex.printStackTrace();
    }
    finally
    {   
      close(conn);
    }
  }
 
  public void close(Connection con)
   {
     if (con != null)
     {
       try
       {
         con.close();
       }
       catch (Exception e)
       {
       }
     }
   }
}