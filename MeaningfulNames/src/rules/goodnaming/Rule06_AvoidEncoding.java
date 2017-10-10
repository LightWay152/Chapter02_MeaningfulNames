package rules.goodnaming;

class Customer{
	public int p_code;
	public String p_name;
	public String p_mobile;
	private String s_email;
	
	public Customer() {
		super();
	}
	
	public Customer(String p_name) {
		super();
		this.p_name = p_name;
	}

	public int getP_code() {
		return p_code;
	}
	public void setP_code(int p_code) {
		this.p_code = p_code;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_mobile() {
		return p_mobile;
	}
	public void setP_mobile(String p_mobile) {
		this.p_mobile = p_mobile;
	}
	public String getS_email() {
		return s_email;
	}
	public void setS_email(String s_email) {
		this.s_email = s_email;
	}

}

public class Rule06_AvoidEncoding {
	public static void main(String[] args) {
		Customer vipCustomer = new Customer("Nguyen Van Teo");
		System.out.print("Vip customer of store is: "+vipCustomer.getP_name());
	}
}
