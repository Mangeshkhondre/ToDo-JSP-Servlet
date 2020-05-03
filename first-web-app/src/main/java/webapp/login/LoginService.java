package webapp.login;

public class LoginService {

	public boolean isValidUser(String name,String pw)
	{
		if(name.equals("Mangesh")&&pw.equals("mk"))
		{
			return true;
		}
		return false;
	}

}
