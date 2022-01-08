package one.c;

import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        testMultiplication();
        testEquality();
    }
    public static void testMultiplication(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assert.assertEquals(10, product.amount);
        product = five.times(3);
        Assert.assertEquals(15, product.amount);
    }

    public static void testEquality(){
        Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
