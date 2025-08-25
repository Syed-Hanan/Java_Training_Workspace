package springproject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Studentmain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		Student hello = (Student) ctx.getBean("std");
		System.out.println(hello.getregno()+" "+hello.getStdname());

	}

}
