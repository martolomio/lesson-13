package utils;

import org.apache.log4j.xml.DOMConfigurator;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static String USER_NAME ="root";
    private static String USER_PASSWORD ="root21";
    private static  String URL ="jdbc:mysql://localhost:3306/users?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false";


    public  static Connection openConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, NoSuchMethodException, InvocationTargetException {
        DOMConfigurator.configure("loggerConfig.xml");
        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        Connection connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
        return connection;
    }
}
