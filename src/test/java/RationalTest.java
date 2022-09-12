import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testMultiply() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(8, x.denominator);
    }

    @Test
    public void testDivide() {
        Rational x = new Rational();
        x.numerator = 5;
        x.denominator = 20;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 6;
        x.divide(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testEquals() {
        Rational x = new Rational();
        x.numerator = 6;
        x.denominator = 8;
        Rational y = new Rational();

        // Test in case they are equal
        y.numerator = 9;
        y.denominator = 12;
        Assert.assertTrue(x.equals(y));

        // Test in case they are not equal
        y.numerator = 1;
        y.denominator = 2;
        Assert.assertFalse(x.equals(y));
    }

    @Test
    public void testCompareTo() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 4;
        Rational y = new Rational();

        // Test current is greater than given
        y.numerator = 1;
        y.denominator = 5;
        Assert.assertEquals(1, x.compareTo(y));

        // Test current is equal to given
        y.numerator = 1;
        y.denominator = 4;
        Assert.assertEquals(0, x.compareTo(y));


        y.numerator = 1;
        y.denominator = 3;
        Assert.assertEquals(-1, x.compareTo(y));
    }

    @Test
    public void testToString(){
        Rational x = new Rational();
        x.numerator = 6;
        x.denominator = 8;
        Assert.assertEquals("3/4",x.toString());
    }
}
