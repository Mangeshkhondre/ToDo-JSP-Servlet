package webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet
{
	private todoService todoservice=new todoService();
		
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		String task=request.getParameter("todo");
		String cat=request.getParameter("cat");
		
		todoservice.addTodo(new Todo(task,cat));
		response.sendRedirect("/list-todo.do");
	}
}
