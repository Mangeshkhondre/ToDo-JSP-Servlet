package webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/delete-todo.do")
public class deleteTodoServlet extends HttpServlet
{
	private todoService todoservice=new todoService();
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		String task=request.getParameter("todo");
		String cat=request.getParameter("cat");
		todoservice.deleteTodo(new Todo(task,cat));
		response.sendRedirect("/list-todo.do");
		
	}
	
}
