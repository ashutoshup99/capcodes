package day5;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class User {
	String email;
	String password;
	String confirmPassword;
	 public static boolean isValid(String email) 
	    { 
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
	                            "[a-zA-Z0-9_+&*-]+)*@" + 
	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
	                            "A-Z]{2,7}$"; 
	                              
	        Pattern pat = Pattern.compile(emailRegex); 
	        if (email == null) 
	            return false; 
	        return pat.matcher(email).matches(); 
	    } 
	
	static final String country = "India";
	

//	constructor
	
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public User(String email, String password, String confirmPassword) {
//		super();
//		this.email = email;
//		this.password = password;
		this(email, password);
		this.confirmPassword = confirmPassword;
	}
	
	//methods
	public void register() {
		System.out.println("user registeration...");
		System.out.println("user email:  " + this.email);
		
		if(this.email.contains("@") && this.password.length() >=6 && this.password.equals(this.confirmPassword)) {
			System.out.println("user registered successfully!!");
			System.out.println(this);
		}
		else {
			System.out.println("user not registered!!");
		}
	}
	
	public void login() {
		System.out.println("user login...");
		boolean res=isValid(this.email);
		if (res) {
		if(this.email.equals(this.password)) {
			System.out.println("user logged in successfully!!");
			System.out.println(this);
		}
		else {
			System.out.println("user login failed!!");
		}
		
	}
		else {
			System.out.println("user email wrong!");

		}
	}
	



	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User("test@test.com", "testtest", "testtest");
		user.register();
//		user.country = "Australia";
		System.out.println(user.country);
		
		System.out.println(User.country);
		
		User loginUser = new User("test@....test.com","test@test.com");
		loginUser.login();
		System.out.println(loginUser.country);
	}

}
