import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;

/**
 * @author Chet Backiewicz
 *
 */
public class CryptoUtilitiesTest {

    /*
     * Tests of reduceToGCD
     */

    @Test
    public void testReduceToGCD_0_0() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(0);
        NaturalNumber m = new NaturalNumber2(0);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    @Test
    public void testReduceToGCD_30_21() {
        NaturalNumber n = new NaturalNumber2(30);
        NaturalNumber nExpected = new NaturalNumber2(3);
        NaturalNumber m = new NaturalNumber2(21);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    /*
     * Tests of isEven
     */

    @Test
    public void testIsEven_0() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(0);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    @Test
    public void testIsEven_1() {
        NaturalNumber n = new NaturalNumber2(1);
        NaturalNumber nExpected = new NaturalNumber2(1);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(false, result);
    }

    /*
     * Tests of powerMod
     */

    @Test
    public void testPowerMod_0_0_2() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(0);
        NaturalNumber pExpected = new NaturalNumber2(0);
        NaturalNumber m = new NaturalNumber2(2);
        NaturalNumber mExpected = new NaturalNumber2(2);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    @Test
    public void testPowerMod_17_18_19() {
        NaturalNumber n = new NaturalNumber2(17);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(18);
        NaturalNumber pExpected = new NaturalNumber2(18);
        NaturalNumber m = new NaturalNumber2(19);
        NaturalNumber mExpected = new NaturalNumber2(19);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    @Test
    public void testIsWitnessToCompositeness_5_12() {
        NaturalNumber w = new NaturalNumber2(5);
        NaturalNumber n = new NaturalNumber2(12);
        boolean answer = CryptoUtilities.isWitnessToCompositeness(w, n);

        assertEquals(true, answer);

    }

    @Test
    public void testIsWitnessToCompositeness_7_21() {
        NaturalNumber w = new NaturalNumber2(7);
        NaturalNumber n = new NaturalNumber2(21);
        boolean answer = CryptoUtilities.isWitnessToCompositeness(w, n);

        assertEquals(true, answer);
    }

    @Test
    public void testIsWitnessToCompositeness_6_68() {
        NaturalNumber w = new NaturalNumber2(6);
        NaturalNumber n = new NaturalNumber2(28);
        boolean answer = CryptoUtilities.isWitnessToCompositeness(w, n);

        assertEquals(true, answer);
    }

    @Test
    public void testIsWitnessToCompositeness_3_7() {
        NaturalNumber w = new NaturalNumber2(3);
        NaturalNumber n = new NaturalNumber2(7);
        boolean answer = CryptoUtilities.isWitnessToCompositeness(w, n);

        assertEquals(false, answer);

    }

    @Test
    public void testIsWitnessToCompositeness_365_367() {
        NaturalNumber w = new NaturalNumber2(365);
        NaturalNumber n = new NaturalNumber2(367);
        boolean answer = CryptoUtilities.isWitnessToCompositeness(w, n);

        assertEquals(false, answer);

    }

    @Test
    public void testIsWitnessToCompositeness_34_3670000() {
        NaturalNumber w = new NaturalNumber2(34);
        NaturalNumber n = new NaturalNumber2(36700000);
        boolean answer = CryptoUtilities.isWitnessToCompositeness(w, n);

        assertEquals(true, answer);

    }

    @Test
    public void testIsWitnessToCompositeness_8_13() {
        NaturalNumber w = new NaturalNumber2(8);
        NaturalNumber n = new NaturalNumber2(13);
        boolean answer = CryptoUtilities.isWitnessToCompositeness(w, n);

        assertEquals(false, answer);

    }

    @Test
    public void isPrime2Test_367() {
        NaturalNumber n = new NaturalNumber2(367);
        boolean primality = CryptoUtilities.isPrime2(n);

        assertEquals(true, primality);

    }

    @Test
    public void isPrime2Test_22() {
        NaturalNumber n = new NaturalNumber2(22);
        boolean primality = CryptoUtilities.isPrime2(n);

        assertEquals(false, primality);

    }

    @Test
    public void isPrime2Test_3() {
        NaturalNumber n = new NaturalNumber2(3);
        boolean primality = CryptoUtilities.isPrime2(n);

        assertEquals(true, primality);

    }

    @Test
    public void isPrime2Test2_154327() {
        NaturalNumber n = new NaturalNumber2(154324);
        boolean primality = CryptoUtilities.isPrime2(n);

        assertEquals(false, primality);

    }

    @Test
    public void isPrime2Test2_15434297() {
        NaturalNumber n = new NaturalNumber2(15434297);
        boolean primality = CryptoUtilities.isPrime2(n);

        assertEquals(true, primality);

    }

    @Test
    public void generateNextLikelyPrimeTest_111() {
        NaturalNumber n = new NaturalNumber2(111);
        NaturalNumber nExpected = new NaturalNumber2(113);
        CryptoUtilities.generateNextLikelyPrime(n);

        assertEquals(nExpected, n);

    }

    @Test
    public void generateNextLikelyPrimeTest_42() {
        NaturalNumber n = new NaturalNumber2(42);
        NaturalNumber nExpected = new NaturalNumber2(43);
        CryptoUtilities.generateNextLikelyPrime(n);

        assertEquals(nExpected, n);

    }

    @Test
    public void generateNextLikelyPrimeTest_2() {
        NaturalNumber n = new NaturalNumber2(2);
        NaturalNumber nExpected = new NaturalNumber2(3);
        CryptoUtilities.generateNextLikelyPrime(n);

        assertEquals(nExpected, n);

    }

    @Test
    public void generateNextLikelyPrimeTest_15434295() {
        NaturalNumber n = new NaturalNumber2(15434295);
        NaturalNumber nExpected = new NaturalNumber2(15434297);
        CryptoUtilities.generateNextLikelyPrime(n);

        assertEquals(nExpected, n);

    }

}