package one.d;

import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        testMultiplication();
        testEquality();
    }
    public static void testMultiplication(){
        Dollar five = new Dollar(5);
        Assert.assertEquals(new Dollar(10), five.times(2));
        Assert.assertEquals(new Dollar(15), five.times(3));
    }

    public static void testEquality(){
        Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
