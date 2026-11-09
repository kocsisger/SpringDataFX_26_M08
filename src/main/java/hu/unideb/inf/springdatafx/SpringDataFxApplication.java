package hu.unideb.inf.springdatafx;

import hu.unideb.inf.springdatafx.model.Person;
import hu.unideb.inf.springdatafx.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataFxApplication implements CommandLineRunner {
    @Autowired
    PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataFxApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("HELLO!!!!!!!!!!!!!!!!!!!!!!!!!");

       /* Person person = new Person();
        person.setName("TestDB Smith");
        person.setDateOfBirth(LocalDate.of(2002,2,2));*/

        Person person = Person.builder()
                    .name("Tom Smith")
                    .dateOfBirth(LocalDate.of(2002,2,2))
                .build();

        personRepository.save(person);
    }
}
