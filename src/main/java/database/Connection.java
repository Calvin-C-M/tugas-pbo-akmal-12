/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import com.mysql.jdbc.Driver;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Calvin C M
 */
public class Connection {
    private String user ;
    private String pwd ; //password koneksi database, tidak ada maka kosong
    private String host ;
    private String db ; //ganti dan isi dgn nama database
    private String url;
    private Statement st = null;
    private Connection con = null;
    private ResultSet rs = null;

    public Connection(){
        user = "root";
        pwd = "";
        host = "localhost";
        db = "akademik";
        url = "";

        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Ada kesalahan Driver JDBC " + "tidak barhasil Load");
        }
        
        try{
            url = "jdbc:mysql://"+host+"/"+db;
            con=(Connection) DriverManager.getConnection(url,user,pwd);
            JOptionPane.showMessageDialog(null, "Driver Terhubung.");
        } catch (SQLException se){
            JOptionPane.showMessageDialog(null, "Perintah salah.");
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Driver tidak Terhubung");
        }
    }
}
