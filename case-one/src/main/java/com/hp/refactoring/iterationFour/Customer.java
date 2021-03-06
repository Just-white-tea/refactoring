package com.hp.refactoring.iterationFour;

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
            double thisAmount = 0;
            Rental each = (Rental)rentalEunm.nextElement();

            //determine amounts for each line 确定每行的金额
            thisAmount = amountFor(each);

            //add frequent renter points 增加常客积分
            frequentRenterPoints ++;
            //add bonus for a two day new release rental 增加两天新发行电影的租金
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE &&
                    each.getDaysRented() > 1)){
                frequentRenterPoints ++;
            }

            //show figures for this rental 显示此租金的数字
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;

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
