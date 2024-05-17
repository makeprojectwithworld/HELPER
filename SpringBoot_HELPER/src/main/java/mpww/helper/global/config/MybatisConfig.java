package mpww.helper.global.config;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@MapperScan({ "mpww.helper.domain.board.model.dao", "mpww.helper.domain.user.model.dao"})
@Configuration
public class MybatisConfig {

}
