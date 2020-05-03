package webapp.todo;

public class Todo 
{
	private String task, catagory;

	public Todo(String task,String catagory)
	{
		this.task = task;
		this.catagory=catagory;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public String getTask() 
	{
		return task;
	}
	public void setTask(String task)
	{
		this.task = task;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((task == null) ? 0 : task.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (task == null) {
			if (other.task != null)
				return false;
		} else if (!task.equals(other.task))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Todo [task=" + task + ", catagory=" + catagory + "]";
	}
	
	
}
