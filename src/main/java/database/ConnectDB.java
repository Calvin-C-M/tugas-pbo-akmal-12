/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import com.mysql.cj.jdbc.Driver;
import java.lang.Thread.State;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Calvin C M
 */
public class ConnectDB {
    private String user ;
    private String pwd ; //password koneksi database, tidak ada maka kosong
    private String host ;
    private String db ; //ganti dan isi dgn nama database
    private String url;
    private Statement st = null;
    private Connection con = null;
    private ResultSet rs = null;

    public ConnectDB(){
        user = "root";
        pwd = "";
        host = "localhost";
        db = "db_barang";
        url = "";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Ada kesalahan Driver JDBC " + "tidak barhasil Load");
        }

        try{
            url = "jdbc:mysql://"+host+"/"+db;
            con=(Connection) DriverManager.getConnection(url,user,pwd);
            System.out.println("Driver Terhubung.");
        } catch (SQLException se){
            JOptionPane.showMessageDialog(null, "Perintah salah.");
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Driver tidak Terhubung");
        }
    }

    public ResultSet getData(String query) {
        try {
            this.st=(Statement) this.con.createStatement();
            this.rs=st.executeQuery(query);
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return this.rs;
    }

    public void query(String sql) {
        int hsl;
        try {
            this.st=(Statement) this.con.createStatement();
            hsl=this.st.executeUpdate(sql);
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
