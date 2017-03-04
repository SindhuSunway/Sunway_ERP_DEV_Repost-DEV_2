package erp.view;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;

import java.util.HashMap;
import java.util.Map;

import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.binding.BindingContainer;

public class NewItemCreationClass
{
  public NewItemCreationClass()
  {
  }


    public String create()
  {System.out.println("Item Creation Action");
   
      try{
              Class.forName("oracle.jdbc.driver.OracleDriver");  
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@95.85.23.11:1521:xe","Sunway_1","Sunway@2015");  
              
              Statement stmt=con.createStatement(); 
                      FacesContext facesContext = FacesContext.getCurrentInstance();
              UIViewRoot root = facesContext.getViewRoot();
              RichInputText invoice = (RichInputText)root.findComponent("it14");
              RichInputText itemCode = (RichInputText)root.findComponent("it3");
              RichInputText productName = (RichInputText)root.findComponent("it5");
              RichInputText unitPr = (RichInputText)root.findComponent("it26");
              System.out.println(invoice.getValue());
              System.out.println(itemCode.getValue());
              System.out.println(productName.getValue());
              System.out.println(unitPr.getValue());
              RichInputText qua = (RichInputText)root.findComponent("it34");
              RichInputText dis = (RichInputText)root.findComponent("it35");
              System.out.println(qua.getValue());
              System.out.println(dis.getValue());
              String query="insert into INV_SALE_ITEMS(ITEM_CODE,ORDER_NO,PRODUCT_NAME,QAUNTITY,DISCOUNT,UNIT_PRICE) values('"+itemCode.getValue()+"','"+invoice.getValue()+"','"+productName.getValue()+"','"+qua.getValue()+"','"+dis.getValue()+"',"+unitPr.getValue()+")";
              System.out.println(query);
              stmt.executeUpdate(query);
              Statement stmt1=con.createStatement(); 
              ResultSet rs=stmt1.executeQuery("select * from INV_SALE_ITEMS WHERE ORDER_NO='"+invoice.getValue()+"' AND ITEM_CODE='"+itemCode.getValue()+"'");  
              System.out.println(" Query select * from INV_SALE_ITEMS WHERE ORDER_NO='"+invoice.getValue()+"' AND ITEM_CODE='"+itemCode.getValue()+"'");
              while(rs.next())  {
              int quan = Integer.parseInt(rs.getString(4));
              int dist = Integer.parseInt(rs.getString(5));
              int unitprice=Integer.parseInt(rs.getString(6));
                  
              int tot=((quan*unitprice)-dist);
              System.out.println(" Tot  "+tot);
              String queryupdate="UPDATE INV_SALE_ITEMS SET TOTAL='"+tot+"' WHERE ORDER_NO='"+invoice.getValue()+"' AND ITEM_CODE='"+itemCode.getValue()+"'";
              Statement stmt2=con.createStatement();
              stmt2.executeUpdate(queryupdate);
                  System.out.println(" Executed Sussesfully");    
                  
              
              
              }   Statement stmt3=con.createStatement();
              ResultSet rs1=stmt3.executeQuery("select * from INV_SALE_ITEMS WHERE ORDER_NO='"+invoice.getValue()+"'");  
              System.out.println("select * from INV_SALE_ITEMS WHERE ORDER_NO='"+invoice.getValue()+"'");  
              int totalDue=0;
              while((rs1.next()))  {
                  System.out.println(rs1.getString(7));
                  totalDue=totalDue+Integer.parseInt(rs1.getString(7));
              }
              String queryUpdate="UPDATE INV_SALE_ITEMS SET TOTLA_DUE='"+totalDue+"' WHERE  ORDER_NO='"+invoice.getValue()+"'";
              Statement stmt4=con.createStatement();
              stmt4.executeUpdate(queryUpdate);
              con.close(); 
                          
          }
      catch(Exception e){ System.out.println(e);} 
   
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
