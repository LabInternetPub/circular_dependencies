package cat.tecnocampus;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CircularDependenciesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircularDependenciesApplication.class, args);
	}

	@Bean
	CommandLineRunner runner (ClassA_NeedsB classA_needsB, ClassB_NeedsA classB_needsA) {
		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
				classA_needsB.action();

				classB_needsA.action();
			}
		};
	}


}
