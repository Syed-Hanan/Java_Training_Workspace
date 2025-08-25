package core.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BeanConfiguration {
	@Bean
	public Account getAccount() {
		Account acn=new Account();
		acn.setAcno(1234);
		
		acn.setCustName("hanan");
		acn.setBalance(454545);
		return acn;
	}

}
