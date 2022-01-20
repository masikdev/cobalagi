package class_input;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        
        if(koneksi == null){
            try {
                String url;
                url = "jdbc:mysl://localhost:3306/input_data_mahasiswa";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    return koneksi;
    }

    static Object getConnection(){
        throw new UnsupportedOperationException("NOT YET IMPLEMENTED");
    }
    
}

 
//    private static Connection koneksi;
//    public static Connection getKoneksi(){
//        if(koneksi == null){
//            try {
//                String url;
//                url = "jdbc:mysql://localhost:3306/input_data_mahasiswa";
//                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//                String user = "root";
//                String password = "";
//                koneksi = DriverManager.getConnection(url,user,password);
//                
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, e);
//            }
//        }
//        return koneksi;
//    }static Object getConnection(){
//        throw new UnsupportedOperationException("NOT YET IMPLEMENTED");
//    }