package com.hp.refactoring.iterationSeven;

/**
 * @author haopeng lin
 * 2020年 10月 13日
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    double getCharge(){
        double result = 0;
        switch (getMovie().getPriceCode()){
            case Movie.REGULAR:
                result += 2;
                if (getDaysRented() > 2){
                    result += (getDaysRented() -2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (getDaysRented() > 3){
                    result += (getDaysRented() - 3) * 1.5;
                }
                break;
            default:
                break;
        }
        return result;
    }

    int getFrequentRentalPoints(){
        //add frequent renter points 增加常客积分,如果是新上映的电影，则额外增加一分
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE &&
                getDaysRented() > 1)){
            return 2;
        }else {
            return 1;
        }
    }
}
