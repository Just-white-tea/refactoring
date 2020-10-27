package com.hp.refactoring.iterationEight;



/**
 * @author haopeng lin
 * 2020年 10月 15日
 */
public class Test8 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("霸王别姬", Movie.NEW_RELEASE);
        Movie movie2 = new Movie("激战",Movie.REGULAR);
        Movie movie3 = new Movie("少年与你", Movie.CHILDRENS);

        Rental rental1 = new Rental(movie1,6);
        Rental rental2 = new Rental(movie2,5);
        Rental rental3 = new Rental(movie3,2);

        Customer customer = new Customer("张三");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        System.out.println(customer.statement());
    }
}
