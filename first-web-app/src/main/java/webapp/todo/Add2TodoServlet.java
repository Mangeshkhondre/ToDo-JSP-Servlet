package webapp.todo;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add2-todo.do")
public class Add2TodoServlet extends HttpServlet
{
		
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		request.getRequestDispatcher("/WEB-INF/views/addTodo.jsp").forward(request, response);
	}
}
