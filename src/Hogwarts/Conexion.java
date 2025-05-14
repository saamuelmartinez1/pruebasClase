package tema4.Hogwarts;



import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {
    public static Connection conexion() throws SQLException, IOException {
        Properties propiedades = new Properties();
        try (FileInputStream input = new FileInputStream("Hogwarts/resources/conexion.properties")) {
            propiedades.load(input);

            String url = propiedades.getProperty("db.url");
            String user = propiedades.getProperty("db.user");
            String password = propiedades.getProperty("db.password");

            // Establece la conexión real
            return DriverManager.getConnection(url, user, password);
        }
    }
}