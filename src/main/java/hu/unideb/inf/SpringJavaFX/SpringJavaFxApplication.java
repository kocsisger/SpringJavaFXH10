package hu.unideb.inf.SpringJavaFX;

import hu.unideb.inf.SpringJavaFX.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringJavaFxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJavaFxApplication.class, args);
		Person p = Person.builder()
				.name("Thomas Smith")
				.dateOfBirth(LocalDate.of(1998,12,11))
				.build();
		System.out.println(p);
	}

}
