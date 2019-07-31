import org.junit.Assert.assertEquals
import org.junit.Test

class FooBarQixKtTest {

    @Test
    fun test_notNumber() {
        assertEquals("", compute("abs155"))
    }

    @Test
    fun test_one() {
        assertEquals("1", compute("1"))
    }

    @Test
    fun test_two() {
        assertEquals("2", compute("2"))
    }

    @Test
    fun test_three() {
        assertEquals("FooFoo", compute("3"))
    }

    @Test
    fun test_five() {
        assertEquals("BarBar", compute("5"))
    }

    @Test
    fun test_seven() {
        assertEquals("QixQix", compute("7"))
    }

    @Test
    fun test_fifteen() {
        assertEquals("FooBarBar", compute("15"))
    }

    @Test
    fun test_thirtythree() {
        assertEquals("FooFooFoo", compute("33"))
    }

    @Test
    fun test_hundredandone() {
        assertEquals("1*1", compute("101"))
    }

    @Test
    fun test_threehundredandthree() {
        assertEquals("FooFoo*Foo", compute("303"))
    }

    @Test
    fun test_hundredandfive() {
        assertEquals("FooBarQix*Bar", compute("105"))
    }

    @Test
    fun test_tenthousandhundredandone() {
        assertEquals("FooQix**", compute("10101"))
    }
}