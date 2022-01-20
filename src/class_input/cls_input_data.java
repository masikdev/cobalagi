package class_input;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

public class cls_input_data {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    private String sql;
    public String nim;
    public String nama;
    public String kelas;
    public String jurusan;
    
    public void simpan() throws SQLException{
        
        conn = koneksi.getKoneksi();
        
        sql = "INSERT INTO input_data(nama,nim,kelas,jurusan) VALUE (?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, nim);
        pst.setString(2, nama);
        pst.setString(3, kelas);
        pst.setString(4, jurusan);
        pst.execute();
        pst.close();
    }
    
    public ResultSet UpdateJTable() throws SQLException{
        conn = koneksi.getKoneksi();
        sql  = "SELECT * FROM input_data";
        pst  = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
    }
    
    
}
