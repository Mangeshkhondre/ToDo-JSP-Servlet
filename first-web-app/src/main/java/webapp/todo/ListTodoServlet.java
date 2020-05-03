package webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/list-todo.do")
public class ListTodoServlet extends HttpServlet
{
	private todoService todoservice=new todoService();
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		request.setAttribute("todos", todoservice.retriveTodos());
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
		
	}
}
