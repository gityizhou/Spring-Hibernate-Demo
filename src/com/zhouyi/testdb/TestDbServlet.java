package com.zhouyi.testdb;

import javax.servlet.ServletException;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;

@javax.servlet.annotation.WebServlet(name = "TestDbServlet", urlPatterns = "/testdb")
public class TestDbServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String user = "root";

        String password = "zxc47POI!";

        String url = "jdbc:mysql://localhost:3306/web_customer_tracker" +
                "?userSSL=false&serverTimezone=UTC";

        String driver = "com.mysql.cj.jdbc.Driver";

        try{
            PrintWriter out = response.getWriter();

            out.println("Connecting to database: " + url);

            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, user, password);

            out.println("Connection successful!");

            conn.close();

        }
        catch (Exception e){
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
}
