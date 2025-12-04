package example;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ProjectConfig {

    @Value("jdbc:postgresql://localhost:5432/spring_quickly")
    private String datasourceUrl;

    @Value("postgres")
    private String datasourceUsername;

    @Value("postgres")
    private String datasourcePassword;

    @Bean
    public DataSource dataSource() {
        HikariDataSource dataSource =
        new HikariDataSource();

        dataSource.setJdbcUrl(datasourceUrl);
        dataSource.setUsername(datasourceUsername);
        dataSource.setPassword(datasourcePassword);
        dataSource.setConnectionTimeout(1000);

        return dataSource;
    }
}