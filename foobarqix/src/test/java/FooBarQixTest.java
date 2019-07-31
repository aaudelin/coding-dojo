import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooBarQixTest {

    final FooBarQix fooBarQix = new FooBarQix();

    @Test
    public void test_notNumber() {
        assertEquals("", fooBarQix.compute("abs155"));
    }

    @Test
    public void test_one() {
        assertEquals("1", fooBarQix.compute("1"));
    }

    @Test
    public void test_two() {
        assertEquals("2", fooBarQix.compute("2"));
    }

    @Test
    public void test_three() {
        assertEquals("FooFoo", fooBarQix.compute("3"));
    }

    @Test
    public void test_five() {
        assertEquals("BarBar", fooBarQix.compute("5"));
    }

    @Test
    public void test_seven() {
        assertEquals("QixQix", fooBarQix.compute("7"));
    }

    @Test
    public void test_fifteen() {
        assertEquals("FooBarBar", fooBarQix.compute("15"));
    }

    @Test
    public void test_thirtythree() {
        assertEquals("FooFooFoo", fooBarQix.compute("33"));
    }

    @Test
    public void test_hundredandone() {
        assertEquals("1*1", fooBarQix.compute("101"));
    }

    @Test
    public void test_threehundredandthree() {
        assertEquals("FooFoo*Foo", fooBarQix.compute("303"));
    }

    @Test
    public void test_hundredandfive() {
        assertEquals("FooBarQix*Bar", fooBarQix.compute("105"));
    }

    @Test
    public void test_tenthousandhundredandone() {
        assertEquals("FooQix**", fooBarQix.compute("10101"));
    }
}