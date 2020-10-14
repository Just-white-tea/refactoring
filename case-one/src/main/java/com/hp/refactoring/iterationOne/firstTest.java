package com.hp.refactoring.iterationOne;

/**
 * @author haopeng lin
 * 2020年 10月 13日
 */
public class firstTest {
    public static void main(String[] args) {
        Movie movie1 = new Movie("霸王别姬",Movie.NEW_RELEASE);
        Movie movie2 = new Movie("激战",Movie.REGULAR);
        Movie movie3 = new Movie("少年与你",Movie.CHILDRENS);

        Rental rental1 = new Rental(movie1,3);
        Rental rental2 = new Rental(movie2,1);
        Rental rental3 = new Rental(movie3,2);

        Customer customer = new Customer("张三");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        System.out.println(customer.statement());
    }
}
