package root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = { "controller", "service" })
@EntityScan(basePackages = { "entiry" })
@EnableJpaRepositories(basePackages = { "service" })
@SpringBootApplication
public class SpringrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}
}
