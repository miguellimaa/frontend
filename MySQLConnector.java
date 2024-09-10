import java.sql.*;

public class MySQLConnector {
    public static Connection conectar(){
        String status = "Nada aconteceu ainda...";
        String mysqlHost = "127.0.0.1";
        String mysqlDb = "db_mysql_connector";
        String mysqlUser = "root";
        String mysqlPassword = "senac@02";
        String mysqlPort = "3306";
        String mysqlUrl= "jdbc:mysql://" + mysqlHost + ":"  + mysqlPort +  "/" + mysqlDb + "?user" + mysqlUser + "&passworld" + mysqlPassword;
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jbdc.Driver").getDeclaredConstructor().newInstance();
            conn = DriverManager.getConnection(mysqlUrl);
            status = "Conexão realizada com sucesso!";
        } catch (Exception e) {
        status = "Ops! Algo de errado não esta certo"+ e;           
        }
        System.out.println(status);
        return conn;

    }
    
}
