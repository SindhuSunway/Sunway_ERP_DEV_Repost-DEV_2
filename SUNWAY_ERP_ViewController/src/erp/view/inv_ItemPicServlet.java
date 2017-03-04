package erp.view;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "inv_ItemPicServlet", urlPatterns = { "/inv_itempicservlet" })
public class inv_ItemPicServlet extends HttpServlet {
    @SuppressWarnings("compatibility:-1503199153766184181")
    private static final long serialVersionUID = 1L;

    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        
        response.setContentType(CONTENT_TYPE);

        String imageId = request.getParameter("id");

        OutputStream os = response.getOutputStream();

        Connection conn = null;

        try {

            Context ctx = new InitialContext();            

            conn = getOracleConnection();

            PreparedStatement statement =

            conn.prepareStatement("SELECT Item_Code, ITEM_PIC " +

                                  "FROM INV_INVENTORY " +

                                  "WHERE Item_Code = ?");
            
                        statement.setString(1, imageId);


            ResultSet rs = statement.executeQuery();

            if (rs.next()) {

                Blob blob = rs.getBlob("ITEM_PIC");                

                BufferedInputStream in = new BufferedInputStream(blob.getBinaryStream());

                int b;

                byte[] buffer = new byte[10240];

                while ((b = in.read(buffer, 0, 10240)) != -1) {

                    os.write(buffer, 0, b);

                }

                os.close();

            }

        } catch (Exception e) {

          
            System.out.println(e);
            

        } finally {

            try {

                if (conn != null) {

                    conn.close();

                }

            } catch (SQLException sqle) {

                System.out.println("SQLException error");

            }

        }

        }

        public static Connection getOracleConnection() throws Exception {

        String driver = "oracle.jdbc.driver.OracleDriver";

        String url = "jdbc:oracle:thin:@95.85.23.11:1521:XE";

        String username = "Sunway_1";

        String password = "Sunway@2015";

        

        Class.forName(driver); // load Oracle driver

        Connection conn = DriverManager.getConnection(url, username, password);

        return conn;

        }

        }

        
