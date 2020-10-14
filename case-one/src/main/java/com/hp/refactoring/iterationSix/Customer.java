package com.hp.refactoring.iterationSix;

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
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentalEunm  = rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentalEunm.hasMoreElements()){
            Rental each = (Rental)rentalEunm.nextElement();

            frequentRenterPoints += each.getFrequentRentalPoints();

            //show figures for this rental 显示此租金的数字
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
            totalAmount += each.getCharge();

        }

        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "you earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

    private double amountFor(Rental aRental){
        return aRental.getCharge();
    }
}
