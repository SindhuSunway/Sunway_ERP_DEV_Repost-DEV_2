package erp.view;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.context.ExternalContext;


import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import weblogic.security.SimpleCallbackHandler;
import weblogic.security.services.Authentication;

import weblogic.servlet.security.ServletAuthentication;

public class LoginBean {

    private String _username, _password;

    public void setUsername(String _username) {
        this._username = _username;
    }

    public String getUsername() {
        return _username;
    }

    public void setPassword(String _password) {
        this._password = _password;
    }

    public String getPassword() {
        return _password;
    }
    //method to sendforward
    private void sendForward(HttpServletRequest request, HttpServletResponse response, String forwardUrl) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException se) {
            reportUnexpectedLoginError("ServletException", se);
        } catch (IOException ie) {
            reportUnexpectedLoginError("IOException", ie);
        }
        ctx.responseComplete();
    }
    //method to report unexpected error
    private void reportUnexpectedLoginError(String errType, Exception e) {
        FacesMessage msg =
            new FacesMessage(FacesMessage.SEVERITY_ERROR, "Unexpected error during login",
                             "Unexpected error during login (" + errType + "), please consult logs for detail");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        e.printStackTrace();
    }
    private void reportNullLoginError(String errType, Exception e) {
        FacesMessage msg =
            new FacesMessage(FacesMessage.SEVERITY_ERROR, "Username and password null:",
                             "PLease enter username and password to proceed");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        //e.printStackTrace();
    }
    //methos to login
    public String doLogin() {
        
        Subject mySubject;
        String loginUrl;
        FacesContext ctx= null;
        HttpServletRequest request;
        FacesMessage msg;
            try {
        if (_username == null) {
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Username and password cannot be blank", "");
            ctx.addMessage(null, msg);
        } else {

        String un = _username;
        byte[] pw = _password.getBytes();
      
    

        ctx = FacesContext.getCurrentInstance();
        request = (HttpServletRequest) ctx.getExternalContext().getRequest();

       

            CallbackHandler handler = new SimpleCallbackHandler(un, pw);

          
                mySubject = Authentication.login(handler);
            
            //if (mySubject == null) {
               // msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Username and password cannot be blank", "");
              //  ctx.addMessage(null, msg);
            //} else {
                ServletAuthentication.runAs(mySubject, request);
                ServletAuthentication.generateNewSessionID(request);

                loginUrl = "/adfAuthentication?success_url=/faces/ERP_Main_Page.jspx";

                HttpServletResponse response = (HttpServletResponse) ctx.getExternalContext().getResponse();
                sendForward(request, response, loginUrl);
           }

        } catch (FailedLoginException fle) {
            msg =
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Incorrect Username or Password:",
                                 "Incorrect Username or Password: Please re-enter your Username and Password" );
            ctx.addMessage(null, msg);
        } catch (LoginException le) {
            reportUnexpectedLoginError("LoginException", le);
        } catch (Exception e) {
            System.out.println("Other login exception: " + e.getMessage());
           reportNullLoginError("IOException", e);
        }
        return null;
    }

    public String doLogout() {

        FacesContext fctx;
        ExternalContext ectx;
        String url;
        HttpSession session;
       
        fctx = FacesContext.getCurrentInstance();
        ectx = fctx.getExternalContext();
        url = ectx.getRequestContextPath() + "/adfAuthentication?logout=true&end_url=/faces/App_Main_Page.jspx";

       try {
            
            session = (HttpSession) ectx.getSession(false);
            session.invalidate();

            HttpServletRequest request = (HttpServletRequest) ectx.getRequest();
            ServletAuthentication.logout(request);
            ServletAuthentication.invalidateAll(request);
            ServletAuthentication.killCookie(request);

            ectx.redirect(url);

        } catch (Exception e) {
            
            e.printStackTrace();
        }
        fctx.responseComplete();

        return null;
    }

}
