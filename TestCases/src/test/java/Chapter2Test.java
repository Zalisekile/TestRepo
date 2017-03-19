import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import java.lang.Math.*;

/**
 * Created by Zalisekile on 2017/03/17.
 */
public class Chapter2Test
{
    Chapter2 testing = new Chapter2();
    @Test
    public void tesFloat() throws Exception
    {
        Chapter2 testing  = new Chapter2(2.20);
        double price = testing.getPrice();

        assertTrue("Is not a float",price != Math.round(price));
    }
    @Test
    public void testInteger() throws Exception
    {

        testing.setDigit(5);
        int digit = testing.getDigit();
        assertTrue("Is not a Digit",digit == Math.round(digit));
    }

    @Test
    public void testObjectEquality() throws Exception
    {
        Chapter2.Dog dog1 = testing.new Dog("PitBull","Zakes",'M',2,"black");
        Chapter2.Dog dog2 = testing.new Dog("PitBull","Zakes",'M',2,"black");
        //Chapter2.Dog dog2 = testing.new Dog("PitBull","Zakes",'M',2,"black");
        //Chapter2.Dog dog2 = testing.new Dog("PitBull","Gina",'F',3,"white");

        assertTrue("Object are not equal in value",dog1.getClass() ==  dog2.getClass());
    }

    @Test
    public void testObjectIdentity() throws Exception
    {
        Chapter2.Dog dog1 = testing.new Dog("PitBull","Zakes",'M',2,"black");
        //Chapter2.Dog dog2 = testing.new Dog("PitBull","Zakes",'M',2,"black");
       // Chapter2.Dog dog2 = testing.new Dog("PitBull","Gina",'F',3,"white");

        assertSame(dog1,dog1);
    }

    @Test
    public void testFalse() throws Exception
    {
        testing.setPrice(5.30);
        double price = testing.getPrice();

        assertFalse("Price is equal to Float", price == Math.round(price));
    }

    @Test
     public void testNullness() throws Exception
    {
        Chapter2.Dog dg = null;

        assertNull(dg);
    }

    @Test
    public void failTest() throws Exception
    {
        Chapter2.Dog dg = null;

        assertNull(dg);
        fail();
    }


    @Test(timeout=10)
    public void testTimeout() throws Exception
    {
        int x = 10;

        while(x > 1)
        {
            System.out.println(x);
        }

    }

    @Ignore
    @Test
    public void disbaleTest() throws Exception
    {
        Chapter2.Dog dg = null;

        assertNull(dg);
    }

    @Test
    public void testArrayContent() throws Exception
    {
        int[] a = {1,2,3};
        int[] b = {1,2,3};

       assertArrayEquals(a,b);

    }

}