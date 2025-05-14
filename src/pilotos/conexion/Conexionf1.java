package tema4.pilotos.conexion;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexionf1 {
    public static Connection conexionf1() throws SQLException, IOException {
        Properties propiedades = new Properties();
        FileInputStream input = new FileInputStream("pilotos/resources/conexion.properties");
        propiedades.load(input);

        String url = propiedades.getProperty("db.url1");
        String user = propiedades.getProperty("db.user1");
        String password = propiedades.getProperty("db.password1");

        return DriverManager.getConnection(url, user, password);
    }
}
