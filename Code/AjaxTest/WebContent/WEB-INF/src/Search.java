package org.dcu;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.Enumeration;
import java.util.Vector;

@WebServlet("/Search")
public class Search extends HttpServlet {
    private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse res)
     throws ServletException, IOException {
         Vector<String> dVector = new Vector<String>();
         dVector = setupLecturerVector(dVector);

         res.setContentType("text/html");
         PrintWriter out = res.getWriter();

         String typed = request.getParameter("q").toLowerCase();
         String responsetext = new String("");
         
         for (Enumeration<String> e = dVector.elements() ; e.hasMoreElements() ;) {
             String name = ((String) e.nextElement()).toLowerCase();
             if (name.indexOf(typed)!=-1) {
                 responsetext = responsetext + name + "<br/>";
             }
          }
         out.println(responsetext);
         out.close();
       }     

     private Vector<String> setupLecturerVector(Vector<String> dVector) {
         dVector.addElement("David Molloy");
         dVector.addElement("Damien O Rourke");
         dVector.addElement("Derek Molloy");
         dVector.addElement("Jennifer Bruton");
         dVector.addElement("Jennifer McManus");
         dVector.addElement("Pascal Landais");
         dVector.addElement("Robert Sadleir");
         dVector.addElement("Paddy McNally");
         dVector.addElement("Liam Barry");
         dVector.addElement("Martin Collier");
         dVector.addElement("Gabriel Muntaen");
         dVector.addElement("Ovidiu Ghito");
         dVector.addElement("Noel Murphy");
         dVector.addElement("Noel O'Connor");
         dVector.addElement("Stephen Daniels");
         dVector.addElement("Ronan Scaife");
         dVector.addElement("Anthony Holohan");
         dVector.addElement("Marissa Condon");
         dVector.addElement("Conor Brennan");
         dVector.addElement("Paul Whelan");
         dVector.addElement("Lisa O Reilly");
         dVector.addElement("Sean Marlow");
         dVector.addElement("Xiaojun Wang");
         dVector.addElement("John Mallon");
         dVector.addElement("Jim Dowling");
         return dVector;
     }    
  }