package core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customermain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("core.annotation.xml");
       
		Customer cust =ctx.getBean("cust",Customer.class);
		System.out.println(cust.getCode()+" "+ cust.getCusName()+" "+cust.getAddress());
	}

}
