import java.util.Scanner;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.Statement;

class WelcomeUser extends HttpServlet {
    String UserName;

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) {
        try {
            res.setContentType("text/html");
            UserName = req.getParameter("UserName");
            PrintWriter out = res.getWriter();
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

          out.println("</body></html>");
                    } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Connection ConnectToMysql() {
    //     String UserName = "root";
    //     String Userpassword = "2431923r";
    //     String jdbcUrl = "jdbc:mysql://localhost:3306/htmljdbc";
    //     String MysqlClassPth = "com.mysql.jdbc.Driver";
    //     Class.forName(MysqlClassPth);
    //     Connection con = DriverManager.getConnection(jdbcUrl, UserName, Userpassword);
    //     return con;
    // }
    // // Statement CreateTable(){
    // // handeltheForm AcessAll = new handeltheForm();
    // // Connection con = AcessAll.ConnectToMysql();
    // // String UserInfo = "CREATE TABLE UserInfo (
    // // id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    // // Name VARCHAR(30) NOT NULL,
    // // Email VARCHAR(50) NOT NULL,
    // // Password VARCHAR(30),
    // // reg_date TIMESTAMP)";
    // // Statement creatst = con.createStatement();
    // // creatst.executexecuteUpdate(UserInfo);
    // // return creatst;
    // // }

    // boolean InsertInto(Sting NameOfTable) {
    //     handeltheForm AcessAll = new handeltheForm();
    //     Connection con = AcessAll.ConnectToMysql();
    //     String userData = "INSERT INTO UserInfo(Name, Email, Email) VALUES (" + Name + ", " + Email + ", " + Password
    //             + ")";
    //     Statement creatst = con.createStatement();
    //     ResultSet set = st.executeQuery("SHOW TABLES");
    //     System.out.println(set);
    //     creatst.executexecuteUpdate(userData);
    // }
}
