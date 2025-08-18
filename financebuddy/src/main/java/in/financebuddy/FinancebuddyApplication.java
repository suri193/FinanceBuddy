package in.financebuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class FinancebuddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancebuddyApplication.class, args);
	}

}
