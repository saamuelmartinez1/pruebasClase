package tema4.pilotos.conexion;


import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PilotosCrud {
    public static List<Piloto> pilotos = new ArrayList<>();

    public static void main(String[] args) throws SQLException, IOException {
        String sql = "SELECT driverid,code,forename, surname,dob,nationality, url FROM drivers";
        try (Connection conn = Conexionf1.conexionf1();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int driverId = rs.getInt("driverid");
                String code = rs.getString("code");
                String forename = rs.getString("forename");
                String surname = rs.getString("surname");
                String dob = rs.getString("dob");
                String nationality = rs.getString("nationality");
                String url = rs.getString("url");
                Piloto piloto = new Piloto(driverId, code, forename, surname, dob, nationality, url);
                pilotos.add(piloto);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        menu();
    }

    public static void menu() throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;


        do {
            System.out.println("1) create pilot");
            System.out.println("2) readpilot");
            System.out.println("3) readpilots");
            System.out.println("4) Updatepilots");
            System.out.println("5) deletepilot");
            System.out.println("6) showpilot classification");
            System.out.println("7) show builder classification ");

            System.out.println("elige una opcion:");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    CreatePilot();
                    break;
                case 2:
                    break;
                case 3:
                    readPilotos();
                    break;
                case 4:
                    updatePilots();
                    break;
                case 5:
                    deletePilot();
                    break;
                case 6:
                    ShowPilotClassification();
                    break;
                case 7:
                    ShowBuildersClassification();
                    break;
                case 0:
                    System.out.println("saliendo del programa");
                    break;
                default:
                    System.out.println("opcion introducida incorrecta");
            }
        } while (opcion != 0);
    }

    public static void CreatePilot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("añadir piloto");

        System.out.println("ingrese el nombre");
        String forename = scanner.nextLine();

        System.out.println("ingrese el apellido");
        String surname = scanner.nextLine();

        System.out.println("ingrese el id del piloto");
        int driverId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ingrese el codigo");
        String code = scanner.nextLine();
        System.out.println("ingrese fecha de nacimiento (yyyy-mm-dd)");
        String dob = scanner.nextLine();
        System.out.println("ingrese la nacionalidad");
        String nationality = scanner.nextLine();
        System.out.println("ingrese url");
        String url = scanner.nextLine();

        Piloto piloto1 = new Piloto(driverId, code, forename, surname, dob, nationality, url);

        pilotos.add(piloto1);

        String sql = "INSERT INTO drivers(driverid, code, forename, surname, dob, nationality, url) VALUES(?,?,?,?,?,?,?)";
        Date fecha;

        try {
            fecha = Date.valueOf(dob);
        } catch (IllegalArgumentException e) {
            System.out.println("fecha incorrecta");
            return;
        }
        try (Connection conn = Conexionf1.conexionf1();
             PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setInt(1, piloto1.getdriverid());
            stmt.setString(2, piloto1.getCode());
            stmt.setString(3, piloto1.getForename());
            stmt.setString(4, piloto1.getSurname());
            stmt.setDate(5, fecha);
            stmt.setString(6, piloto1.getNationality());
            stmt.setString(7, piloto1.getUrl());
            int filasAfectadas = stmt.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Piloto añadido correctamente.");
            } else {
                System.out.println("No se pudo añadir el piloto.");
            }

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void readPilot() {
        Scanner scanner = new Scanner(System.in);
        String sql = "SELECT driverid, code, forename, surname, dob, nationality, url FROM drivers WHERE driverid = ?";
        System.out.println("ingresa el id del piloto que quieres mostrar:");
        int driverid = scanner.nextInt();
        try (Connection conn = Conexionf1.conexionf1();
             PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setInt(1, driverid);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println("se encontro el piloto:");
                System.out.println("ID: " + rs.getString("driverid"));
                System.out.println("Código: " + rs.getString("code"));
                System.out.println("Nombre: " + rs.getString("forename"));
                System.out.println("Apellido: " + rs.getString("surname"));
                System.out.println("Fecha de nacimiento: " + rs.getString("dob"));
                System.out.println("Nacionalidad: " + rs.getString("nationality"));
                System.out.println("URL: " + rs.getString("url"));

            } else {
                System.out.println("piloto no encontrado");
            }


        } catch (SQLException e) {
            System.err.println("error de sql al buscar piloto" + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("error de ejecucion" + e.getMessage());
        }


    }


    public static void readPilotos() {
        System.out.println("Lista de pilotos: ");
        for (Piloto piloto : pilotos) {
            System.out.println(piloto);
        }
    }


    public static void updatePilots() {
        Scanner scanner = new Scanner(System.in);
        String sql = "SELECT driverid, code, forename, surname, dob, nationality, url FROM drivers WHERE driverid = ?";
        String updateSql = "UPDATE drivers SET code = ?, forename = ?, surname = ?, dob = ?, nationality = ?, url = ? WHERE driverid = ?";


        System.out.println("Ingresa el ID del piloto que quieres modificar:");
        int driverid = scanner.nextInt();
        scanner.nextLine(); // Consumimos el salto de línea pendiente


        try (Connection conn = Conexionf1.conexionf1();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, driverid);
            ResultSet rs = stmt.executeQuery();


            if (rs.next()) {
                System.out.println("Se encontró el piloto. Introduce los nuevos datos:");

                System.out.print("Código: ");
                String code = scanner.nextLine();

                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Apellido: ");
                String apellido = scanner.nextLine();

                System.out.print("Fecha de nacimiento (yyyy-mm-dd): ");
                String fecha = scanner.nextLine();

                System.out.print("Nacionalidad: ");
                String nacionalidad = scanner.nextLine();

                System.out.print("URL: ");
                String url = scanner.nextLine();

                // Validar la fecha
                Date dob;


                try {
                    dob = Date.valueOf(fecha);
                } catch (IllegalArgumentException e) {
                    System.err.println("Fecha inválida. No se puede actualizar.");
                    return;
                }


                // Ejecutar la actualización
                try (PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {
                    updateStmt.setString(1, code);
                    updateStmt.setString(2, nombre);
                    updateStmt.setString(3, apellido);
                    updateStmt.setDate(4, dob);
                    updateStmt.setString(5, nacionalidad);
                    updateStmt.setString(6, url);
                    updateStmt.setInt(7, driverid);

                    int filasActualizadas = updateStmt.executeUpdate();
                    if (filasActualizadas > 0) {
                        System.out.println("Piloto actualizado correctamente.");
                    } else {
                        System.out.println("No se pudo actualizar el piloto.");
                    }
                }

            } else {
                System.out.println("Piloto no encontrado.");
            }

        } catch (SQLException e) {
            System.err.println("Error de SQL al buscar o actualizar piloto: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("Error de ejecución: " + e.getMessage());
        }
    }

    public static void deletePilot() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el ID del piloto que quieres eliminar:");
        int driverid = scanner.nextInt();
        scanner.nextLine(); // Consumimos el salto de línea pendiente

        Piloto pilotoAEliminar = null;
        // Buscar el piloto en la lista
        for (Piloto p : pilotos) {
            if (p.getdriverid() == driverid) {
                pilotoAEliminar = p;
                break; // Piloto encontrado, salimos del ciclo
            }
        }

        if (pilotoAEliminar != null) {
            // Eliminar de la base de datos
            String sql = "DELETE FROM drivers WHERE driverid = ?";
            try (Connection conn = Conexionf1.conexionf1();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setInt(1, driverid); // Estableces el valor del parámetro driverid
                int rowsAffected = stmt.executeUpdate(); // Ejecutas la eliminación

                if (rowsAffected > 0) {
                    // Si la eliminación en la base de datos fue exitosa, eliminamos de la lista
                    pilotos.remove(pilotoAEliminar);
                    System.out.println("Piloto eliminado con éxito.");
                } else {
                    System.out.println("No se encontró el piloto con el ID especificado en la base de datos.");
                }
            } catch (SQLException | IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Piloto no encontrado en la lista.");
        }
    }
    public static void ShowPilotClassification() throws SQLException, IOException {
        String sql = "SELECT d.driverId, d.forename, d.surname, SUM(r.points) AS total_points " +
                "FROM drivers d " +
                "JOIN results r ON d.driverId = r.driverId " +
                "GROUP BY d.driverId, d.forename, d.surname " +
                "ORDER BY total_points DESC";

        try (Connection conn = Conexionf1.conexionf1();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("CLASIFICACION:");
            int posicion = 1;
            while (rs.next()) {
                String nombre = rs.getString("forename");
                String apellido = rs.getString("surname");
                double puntos = rs.getDouble("total_points");

                System.out.println(posicion + ". " + nombre + " " + apellido + " - " + puntos + " puntos");
                posicion++;

            }

        } catch (SQLException e) {
            System.err.println("Error al obtener la clasificación: " + e.getMessage());
        }
    }
    public static void ShowBuildersClassification() {
        String sql = "SELECT c.name AS constructor, SUM(r.points) AS points " +
                "FROM constructors c " +
                "JOIN results r ON c.constructorid = r.constructorid " +
                "GROUP BY c.name " +
                "ORDER BY points DESC";

        try (Connection conn = Conexionf1.conexionf1();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("CLASIFICACION:");
            int posicion = 1;

            while (rs.next()) {
                String constructor = rs.getString("constructor");
                double puntos = rs.getDouble("points");

                System.out.println(posicion + ". " + constructor + " - " + puntos + " puntos");
                posicion++;
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener la clasificación de constructores: " + e.getMessage());
            System.err.println("Consulta SQL fallida: " + sql);
        } catch (IOException e) {
            throw new RuntimeException("Error de conexión: " + e.getMessage());
        }
    }
}





