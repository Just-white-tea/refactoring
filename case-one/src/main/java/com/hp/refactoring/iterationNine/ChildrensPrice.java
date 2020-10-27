package com.hp.refactoring.iterationNine;

import java.security.Principal;

/**
 * @author haopeng lin
 * 2020年 10月 15日
 */
public class ChildrensPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }
}
