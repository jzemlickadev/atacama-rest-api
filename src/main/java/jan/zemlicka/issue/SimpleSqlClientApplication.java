package jan.zemlicka.issue;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SimpleSqlClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleSqlClientApplication.class, args);
    }
}
