package info.trackwarrant.rail.equipment;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


import info.trackwarrant.rail.equipment.carrier.Carrier;
import info.trackwarrant.rail.equipment.carrier.repository.CarrierRepository;

@SpringBootApplication
// @EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // @Bean
    // public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    //     return args -> {

    //         System.out.println("Let's inspect the beans provided by Spring Boot:");

    //         String[] beanNames = ctx.getBeanDefinitionNames();
    //         Arrays.sort(beanNames);
    //         for (String beanName : beanNames) {
    //             System.out.println(beanName);
    //         }

    //     };
    // }




    @Bean
    public CommandLineRunner demo(CarrierRepository repository) {
        return (args) -> {
            // save a couple of customers
            // repository.save(new Carrier("Jack", "Bauer"));
            // repository.save(new Carrier("Chloe", "O'Brian"));
            // repository.save(new Carrier("Kim", "Bauer"));
            // repository.save(new Carrier("David", "Palmer"));
            // repository.save(new Carrier("Michelle", "Dessler"));
            repository.save(new Carrier("SOU", "Southern"));

            // fetch all Carriers
            log.info("Carriers found with findAll():");
            log.info("-------------------------------");
            for (Carrier carrier : repository.findAll()) {
                log.info(carrier.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            // repository.findById("EL")
            //     .ifPresent(carrier -> {
            //         log.info("Carrier found with findById('EL'):");
            //         log.info("--------------------------------");
            //         log.info(carrier.toString());
            //         log.info("");
            //     });

            // // fetch customers by last name
            // log.info("Carrier found with findByName('Erie Lackawanna'):");
            // log.info("--------------------------------------------");
            // repository.findByName("Erie Lackawanna").forEach(bauer -> {
            //     log.info(bauer.toString());
            // });
            // for (Carrier bauer : repository.findByLastName("Bauer")) {
            //  log.info(bauer.toString());
            // }
            log.info("");
        };
    }


}
