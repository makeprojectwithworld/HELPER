package mpww.hw;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan(basePackages = "mpww.hw.board.model.dao")
public class UserRestApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserRestApiApplication.class,args);
    }
}
