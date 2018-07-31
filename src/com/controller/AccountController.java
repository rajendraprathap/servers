package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Account;
import com.repositroy.AccountDao;
import com.repositroy.AccountDaoFactory;


@WebServlet("/AccountController")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AccountController() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("-------from controler doget() method---------");
		String action=request.getParameter("action");
		if(action==null)
		{
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			
			if(action.equalsIgnoreCase("logout"))
			{
				HttpSession session=request.getSession();
				session.removeAttribute("username");
				response.sendRedirect("AccountController");
			}
			
		}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("-------from controler dopost() method---------"); 
		
		String action=request.getParameter("action");
		AccountDao ad=AccountDaoFactory.getInstance();
		
		if(action.equalsIgnoreCase("login"))
		{
			Account acc=ad.login(request.getParameter("username"), request.getParameter("password"));
			if(acc==null)
			{
				request.setAttribute("message", "Account is Invalid");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else
			{
				HttpSession session=request.getSession();
				session.setAttribute("username", request.getAttribute("username"));
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
				
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
