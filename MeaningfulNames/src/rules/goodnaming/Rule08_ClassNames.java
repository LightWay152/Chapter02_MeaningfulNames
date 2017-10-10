package rules.goodnaming;

class Manager{
	private Integer code;
	private String name;
	private String email;
	private String mobile;
	
	public Manager() {
		super();
	}
	public Manager(String name) {
		super();
		this.name = name;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}

public class Rule08_ClassNames {
	public static void main(String[] args) {
		Manager manager = new Manager("Dao Nguyen");
		System.out.println("Team leader in this software project is: "+manager.getName().toString());
	}
}
