package erp.view;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.sql.SQLException;

import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.input.RichInputFile;

import oracle.binding.BindingContainer;

import oracle.jbo.Row;
import oracle.jbo.domain.BlobDomain;

import org.apache.myfaces.trinidad.model.UploadedFile;


public class UploadImageClass {

    private RichInputFile uploadImage;
    
    public UploadImageClass() {
        super();
    }
 

    private UploadedFile _file = null;

 

    public UploadedFile getFile() {

        return _file;

    }

 

    public void setFile(UploadedFile file) {

        _file = file;

    }

 

    public String uploadImage() {

       
        try {
            
        
        UploadedFile myfile = (UploadedFile)this.getFile();

        

        BindingContext bindingctx = BindingContext.getCurrent();

        BindingContainer bindings = bindingctx.getCurrentBindingsEntry();

        DCBindingContainer bindingsImpl = (DCBindingContainer)bindings;

        DCIteratorBinding iter = bindingsImpl.findIteratorBinding("HrEmplInfoView1Iterator");

        

        Row row = iter.getCurrentRow();

        row.setAttribute("EmplPic", createBlobDomain(myfile));
        
        } catch (FacesException e) {
                 System.err.println("Root Cause: " + e.getCause());
        }
     return null;

    }

    private BlobDomain createBlobDomain(UploadedFile file) {


        InputStream in = null;

        BlobDomain blobDomain = null;

        OutputStream out = null;


        try {

            in = file.getInputStream();


            blobDomain = new BlobDomain();

            out = blobDomain.getBinaryOutputStream();

            byte[] buffer = new byte[8192];

            int bytesRead = 0;


            while ((bytesRead = in.read(buffer, 0, 8192)) != -1) {

                out.write(buffer, 0, bytesRead);

            }


            in.close();


        } catch (IOException e) {

            e.printStackTrace();

        } catch (SQLException e) {

            e.fillInStackTrace();

        }


        return blobDomain;

    }


    public void setUploadImage(RichInputFile uploadImage) {
        this.uploadImage = uploadImage;
    }

    public RichInputFile getUploadImage() {
        return uploadImage;
    }

    public void uploadImage(FacesContext facesContext, UIComponent uIComponent, Object object) {
        // Add event code here...

    }
}
