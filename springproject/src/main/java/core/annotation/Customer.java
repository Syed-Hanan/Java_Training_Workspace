package core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import springproject.AddressOfEmployee;

@Component (value="cust")
public class Customer {
	@Value("4546")
	private int code;
	@Value("hanan")
	private String cusName;
	
	@Autowired
	private AddressOfEmployee address;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public AddressOfEmployee getAddress() {
		return address;
	}
	public void setAddress(AddressOfEmployee address) {
		this.address = address;
	}
	

}
