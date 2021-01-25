package plusplus.WeatherForcast.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;

@Configuration
public class BeanConfig {
    private Connection connection;
    @Bean
    public Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("MySQL JDBC Driver not found !!");
                return null;
            }
            System.out.println("MySQL JDBC Driver Registersed!");
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weather?characterEncoding=utf8", "root", "1234");
                System.out.println("SQL Conection to database established!");
                return connection;
            } catch (Exception e) {
                System.out.println("Connection  Failed!Check output console" + e);
                return null;
            }
        }
        return connection;
    }
}
