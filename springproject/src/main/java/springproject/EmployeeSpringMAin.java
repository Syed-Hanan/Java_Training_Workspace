package springproject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployeeSpringMAin {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		Employee emp = (Employee) ctx.getBean("two");
		System.out.println(emp.getCode()+" "+emp.getEmpname()+emp.getSalary()+ " "+emp.getAddr().getCity());

	}

}
