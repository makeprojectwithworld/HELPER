package mpww.helper.global.config;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("mpww.hw.model.dao")
public class MybatisConfig {

}
