package erp.view;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import javax.sql.DataSource;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.binding.BindingContainer;

import utils.system;

public class UpdateBeanClass {
     
    private RichOutputText update;

    public UpdateBeanClass() {
    }

    public void updateMethod() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        UIViewRoot root = facesContext.getViewRoot();
        RichInputText invoiceNo = (RichInputText)root.findComponent("it1");
        System.out.println("UPdateBeanClass  "+invoiceNo.getValue());
       // RichInputText itemCode = (RichInputText)root.findComponent("it1");
        
        try{
                Class.forName("oracle.jdbc.driver.OracleDriver");  
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@95.85.23.11:1521:xe","Sunway_1","Sunway@2015");  
                
                Statement stmt1=con.createStatement(); 
                ResultSet rs=stmt1.executeQuery("select * from INV_SALE_ITEMS WHERE ORDER_NO='"+invoiceNo.getValue()+"'");  
                System.out.println("UPdateBeanClass Query select * from INV_SALE_ITEMS WHERE ORDER_NO='"+invoiceNo.getValue()+"'");
                while(rs.next())  {
                int qua = Integer.parseInt(rs.getString(4));
                int dis = Integer.parseInt(rs.getString(5));
                int price=Integer.parseInt(rs.getString(6));
                    
                int tot=((qua*price)-dis);
                    System.out.println(" Quan  "+qua);
                System.out.println(" Dis  "+dis);
                System.out.println(" Unit Price  "+price);
                System.out.println(" Tot  "+tot);
                String query="UPDATE INV_SALE_ITEMS SET TOTAL='"+tot+"' WHERE ITEM_CODE='"+rs.getString(1)+"' and ORDER_NO='"+invoiceNo.getValue()+"'";
                Statement stmt2=con.createStatement();
                stmt2.executeUpdate(query);
                    
                
                
            }   Statement stmt3=con.createStatement();
                ResultSet rs1=stmt3.executeQuery("select * from INV_SALE_ITEMS WHERE ORDER_NO='"+invoiceNo.getValue()+"'");  
                int totalDue=0;
                while((rs1.next()))  {
                    
                    totalDue=totalDue+Integer.parseInt(rs1.getString(7));
                }
                String queryUpdate="UPDATE INV_SALE_ITEMS SET TOTLA_DUE='"+totalDue+"' WHERE  ORDER_NO='"+invoiceNo.getValue()+"'";
                Statement stmt4=con.createStatement();
                stmt4.executeUpdate(queryUpdate);
                con.close();   
                        
            }
        catch(Exception e){ System.out.println(e);} 
        
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
