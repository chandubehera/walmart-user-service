package walmart.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class WalmartUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalmartUserServiceApplication.class, args);
	}

}
