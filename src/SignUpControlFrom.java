import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class SignUpControlFrom implements Filter {
 String UserName,UserEmail,Userpassword,UserRepassword, UserMobileNumber, UserIdentity;
    FilterConfig arg0;
     @Override
    public void init(FilterConfig arg0) throws ServletException {
        this.arg0 = arg0;
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {

        PrintWriter out = res.getWriter();
        UserName = req.getParameter("Name");
        UserEmail = req.getParameter("Email");
        UserMobileNumber = req.getParameter("MoileNumber");
        UserIdentity = req.getParameter("UserName");
        Userpassword = req.getParameter("password");
        UserRepassword = req.getParameter("repassword");
        out.println("<!DOCTYPE html><html lang='en'><head><title>welcome "+ UserName +"</title><meta charset='utf-8'><meta name='viewport' content='width=device-width, initial-scale=1'><link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'><script src='https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js'></script><script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js'></script><script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js'></script>");
            
            out.println("</head><body>");
            out.println("<div class='container'>");
            out.println("<div class='row'>");
            
          out.println("<div class='col-sm-'>");
          out.println("<h3>Column 1</h3><p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p><p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p></div>");
          
          out.println("</div>");
          out.println("<div class='col-sm-4'>");
          out.println("<h3>Column 2</h3><p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p><p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>");
          out.println("</div>");
          out.println("<div class='col-sm-4'>");
          out.println("<h3>Column 3</h3><p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p><p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>");   
          out.println("</div>");
          out.println("</div>");
          out.println("</div>");

          
        
        out.print("</h1>Signup filter</h1>");

        chain.doFilter(req, res);// sends request to next resource

        out.print(" <br><h1>after commiing back</h1>");
    
    out.println("</body></html>");
    }

    public void destroy() {
    }
}

