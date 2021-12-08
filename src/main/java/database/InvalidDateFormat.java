/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Calvin C M
 */
public class InvalidDateFormat extends Exception {
    public InvalidDateFormat() {
        super("Ingat format tanggal dd-mm-yyyy");
    }
}
