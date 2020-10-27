package com.hp.refactoring.iterationTen;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 与上一次比对，修改了amountFor函数中的变量名
 * @author haopeng lin
 * 2020年 10月 13日
 */
public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg){
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement(){
        Enumeration rentalEunm  = rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentalEunm.hasMoreElements()){
            Rental each = (Rental)rentalEunm.nextElement();
            //show figures for this rental 显示此租金的数字
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }

        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "you earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    private double getTotalCharge(){
        double result = 0;
        Enumeration rentalEnum = rentals.elements();
        while (rentalEnum.hasMoreElements()){
            Rental each = (Rental)rentalEnum.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints(){
        int result = 0;
        Enumeration rentalEnum = rentals.elements();
        while (rentalEnum.hasMoreElements()){
            Rental each = (Rental)rentalEnum.nextElement();
            result += each.getFrequentRentalPoints();
        }
        return result;
    }
}
