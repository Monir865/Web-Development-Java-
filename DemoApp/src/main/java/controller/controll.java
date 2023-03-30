package controller;



import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class controll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public controll() {
        
    }
    
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    	
    	int num1 =Integer.parseInt(req.getParameter("num1"));
    	int num2 = Integer.parseInt(req.getParameter("num2"));
    	
    	int result = num1+num2;
    	

    	System.out.println(result); 
    	
    	RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
    	rd.forward(req, res);
    	
    	
    	
    }
    
    
    


}
