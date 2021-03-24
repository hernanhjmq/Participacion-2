
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespJson", urlPatterns = {"/RespJson"})
public class RespJson extends HttpServlet
{


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
     response.setContentType("application/json");
       response.setHeader("Content-Disposition","attachment;filename=empleados.json");
        
       try (PrintWriter out = response.getWriter()) 
       {
         
            out.println("{'empleados':[");
            out.println("{'nombre':'bruno','apellidos':'Diaz'}");
            out.println("{'nombre':'Juan','apellidos':'Paredez'}");
            out.println("{'nombre':'Dolores','apellidos':'Fuertes'}");
            out.println("]}");
           

        }
    }
}
