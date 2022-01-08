package one.one;

import one.one.Dollar;
import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        testMultiplication();
    }
    public static void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        Assert.assertEquals(10, five.amount);
    }
}
