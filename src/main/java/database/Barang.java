/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.SQLException;

/**
 *
 * @author Calvin C M
 */
public class Barang {
    private int kode;
    private String nama;
    private double harga;
    private int stok;
    private Date expired;

    Barang() {
        this.kode=0;
        this.nama="";
        this.harga=0;
        this.stok=0;
        this.expired=new Date();
    }

    Barang(int kode, String nama, double harga, int stok, Date expire) {
        this.kode=kode;
        this.nama=nama;
        this.harga=harga;
        this.stok=stok;
        this.expired=expire;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }

    public int getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public Date getExpired() {
        return expired;
    }

    public void insertBarang() throws SQLException {
        ConnectDB connectDB=new ConnectDB();
        String query="INSERT INTO barang VALUES ('"+ this.kode +
                     "', '" + this.nama +
                     "', '" + this.harga +
                     "', '" + this.stok +
                     "', '" + this.expired +
                     "');";

        connectDB.query(query);
    }

    public void updateBarang() throws SQLException {
        ConnectDB connectDB=new ConnectDB();
        String query="UPDATE barang SET nama='" + this.nama + 
                     "', harga=" + this.harga + 
                     ", stok=" + this.stok +
                     ", tgl_expire='" + this.expired.toString() + 
                     "' " +
                     "WHERE kode='" + this.kode +
                     "';";
        connectDB.query(query);
    }

    public void deleteBarang() throws SQLException {
        ConnectDB connectDB=new ConnectDB();
        String query="DELETE FROM barang WHERE kode='"+this.kode+"';";
        connectDB.query(query);
    }
}
