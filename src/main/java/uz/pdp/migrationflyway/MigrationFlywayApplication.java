package uz.pdp.migrationflyway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.sql.Connection;

@SpringBootApplication
public class MigrationFlywayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MigrationFlywayApplication.class, args);
    }

}

