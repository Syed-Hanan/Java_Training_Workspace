package core.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AccountMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Account acnt =ctx.getBean("getAccount",Account.class);
		System.out.println(acnt.getAcno()+" "+acnt.getCustName()+" "+acnt.getBalance());
				

	}

}
