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
public class Date {
    private int day;
    private int month;
    private int year;

    Date() {
        this.day=0;
        this.month=0;
        this.year=0;
    }

    Date(int d, int m, int y) {
        this.day=d;
        this.month=m;
        this.year=y;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    
    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return this.day + "-"+ this.month + "-" + this.year;
    }
}
