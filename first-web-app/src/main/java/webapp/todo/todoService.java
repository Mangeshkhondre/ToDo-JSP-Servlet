package webapp.todo;

import java.util.ArrayList;
import java.util.List;

public class todoService 
{
	public static List<Todo> todos=new ArrayList<Todo>();
	
	static 
	{
		todos.add(new Todo("wake up","fun"));
		todos.add(new Todo("eat","fun"));
		todos.add(new Todo("code","study"));
		todos.add(new Todo("sleep","fun"));		
	}
	public List<Todo> retriveTodos()
	{
		return todos;
	}
	public void addTodo(Todo task)
	{
		todos.add(task);
	}
	public void deleteTodo(Todo task)
	{
		todos.remove(task);
	}
}
