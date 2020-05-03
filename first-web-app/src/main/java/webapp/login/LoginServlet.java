package webapp.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.todo.todoService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest  request,HttpServletResponse response) throws IOException, ServletException
	{
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);		
	}
	protected void doPost(HttpServletRequest  request,HttpServletResponse response) throws IOException, ServletException
	{
		String name= request.getParameter("name");
		String password=request.getParameter("password");
		
		LoginService iuv=new LoginService();
		boolean isUserValid=iuv.isValidUser(name, password);
		
		if(isUserValid)
		{
			request.getSession().setAttribute("name",name);
			response.sendRedirect("/list-todo.do");			
		}
		else
		{
			request.setAttribute("errorMessage", "Invalid Crendtials!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}
}