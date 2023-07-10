package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void testAddMethod_itemIsNotInTheList_shouldReturnTrue(){
        Basket basket = new Basket();
        String name1 = "Product1";
        int price1 = 2;
        Assertions.assertTrue(basket.add(name1, price1));
    }
}