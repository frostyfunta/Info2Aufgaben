package S22_b10;


import java.sql.*;
import java.time.LocalDate;

public class Aufgabe48 {
    public static void main(String[] args) {
        Connection c = null;
        try{
            c = DriverManager.getConnection("jdbc:mysql://educos-srv01.informatik.uni-augsburg.de:3306/theDatabase?useSSL=false","student","inFormatik2");
            try {
                LocalDate date = LocalDate.of(1950, 1, 1);
                printBekanntFuerBornBefore(c, date);
                printBekanntFuer(c, "Radia", "Perlman");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            try{
                if(c != null)
                    c.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public static void printBekanntFuer(Connection connection, String firstName, String lastName) throws SQLException{
        try(Statement abfrage = connection.createStatement()){
            String befehl = "select bekanntFuer " +
                            "from InformatikerinBekanntFuer " +
                            "where informatikerinFirstName = " + firstName + " and informatikerinLastName = " + lastName;
            ResultSet ergebnis = abfrage.executeQuery(befehl);
            while (ergebnis.next()){
                System.out.println(ergebnis.getString("bekanntFuer"));
            }
        }
    }

    public static void printBekanntFuerBornBefore(Connection connection, LocalDate birthday) throws SQLException {
        try (Statement abfrage = connection.createStatement()) {
            String befehl = "Select b.informatikerinFirstName, b.informatikerinLastName, b.bekanntFuer " +
                    "from InformatikerinBekanntFuer b, Informatikerin i" +
                    "where b.informatikerinFirstName = i.firstName and b.informatikerinLastName = i.lastName an birthday < " + birthday;
            ResultSet ergebnis = abfrage.executeQuery(befehl);
            while (ergebnis.next()) {
                System.out.println(ergebnis.getString("bekanntFuer") + ergebnis.getString("informatikerinFirstName") + ergebnis.getString("informatikerinLastName"));
            }
        }
    }
}
