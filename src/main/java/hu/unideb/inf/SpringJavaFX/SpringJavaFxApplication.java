package hu.unideb.inf.SpringJavaFX;

import hu.unideb.inf.SpringJavaFX.model.Person;
import hu.unideb.inf.SpringJavaFX.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringJavaFxApplication implements CommandLineRunner {

	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJavaFxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person p = Person.builder()
				.name("Thomas Smith")
				.dateOfBirth(LocalDate.of(1998,12,11))
				.build();
		System.out.println(p);
		personRepository.save(p);
		System.out.println( "db -> " + personRepository.findByName("Thomas Smith"));
	}
}
