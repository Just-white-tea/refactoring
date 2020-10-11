package com.baicha.refactoring.caseOne;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Author HaoPeng Lin
 * @Date 2020-10-11 14:31
 * @Version 1.0
 * @function
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
            switch (each.getMovie().getPriceCode()){
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2){
                        thisAmount += (each.getDaysRented() -2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3){
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    }
                    break;
                default:
                    break;
            }

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
}
