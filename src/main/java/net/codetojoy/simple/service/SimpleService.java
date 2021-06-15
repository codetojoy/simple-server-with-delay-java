package net.codetojoy.simple.service;

import java.util.*;
import java.util.stream.IntStream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.codetojoy.simple.entity.Result;
import net.codetojoy.simple.entity.Person;

@RestController
@RequestMapping("/scooter")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SimpleService {

    @GetMapping("/players")
    public ResponseEntity<Result> selectCard( @RequestParam(name="delay_in_seconds", required=false) Integer delayInSeconds) {

        if (delayInSeconds != null) {
            try {
                System.out.println("TRACER pathological delay: " + delayInSeconds + " sec");
                Thread.sleep(delayInSeconds * 1000);
            } catch (Exception ex) {
            }
        }

        String now = new Date().toString();
        String prefix = "TRACER " + now + " ";
        System.out.println(prefix); 

        String message = now + " OK";

        List<Person> people = new ArrayList<>();

        people.add(new Person("Johann Sebastian Bach"));
        people.add(new Person("Ludwig van Beethoven"));
        people.add(new Person("Wolfgang Amadeus Mozart"));
        people.add(new Person("Franz Schubert"));
        people.add(new Person("Richard Wagner"));
        people.add(new Person("Antonio Vivaldi"));
        people.add(new Person("Johannes Brahms"));
        people.add(new Person("Giuseppe Verdi"));
        people.add(new Person("Robert Schumann"));
        people.add(new Person("Giacomo Puccini"));
        people.add(new Person("Antonín Dvorák"));
        people.add(new Person("George Handel"));
        people.add(new Person("Franz Liszt"));
        people.add(new Person("Joseph Haydn"));
        people.add(new Person("Frédéric Chopin"));
        people.add(new Person("Igor Stravinsky"));
        people.add(new Person("Gustav Mahler"));
        people.add(new Person("Richard Strauss"));
        people.add(new Person("Dmitri Shostakovich"));
        people.add(new Person("Hector Berlioz"));

        Result result = new Result();
        result.setMessage(message);
        result.setPeople(people);

        return new ResponseEntity<Result>(result, HttpStatus.OK);
    }
}
