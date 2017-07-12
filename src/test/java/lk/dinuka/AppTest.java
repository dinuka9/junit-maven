/*
 *
 *  * (C) Copyright 2010-2017 hSenid Mobile Solutions (Pvt) Limited.
 *  * All Rights Reserved.
 *  *
 *  * These materials are unpublished, proprietary, confidential source code of
 *  * hSenid Mobile Solutions (Pvt) Limited and constitute a TRADE SECRET
 *  * of hSenid Mobile Solutions (Pvt) Limited.
 *  *
 *  * hSenid Mobile Solutions (Pvt) Limited retains all title to and intellectual
 *  * property rights in these materials.
 *
 */

package lk.dinuka;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {
    private static ICalculator calculator;

    @BeforeClass
    public static void initCalculator() {
        calculator = new Calculator();
    }

    @Before
    public void beforeEachTest() {
        System.out.println("This is executed before each Test");
    }

    @After
    public void afterEachTest() {
        System.out.println("This is executed after each Test");
    }

    @Test
    public void testSum() {
        int result = calculator.sum(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testDivison() {
        try {
            int result = calculator.divison(10, 2);
            assertEquals(5, result);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    @Test(expected = Exception.class)
    public void testDivisionException() throws Exception {
        calculator.divison(10, 0);
    }

    @Ignore
    @Test
    public void testEqual() {
        boolean result = calculator.equalIntegers(20, 20);
        try {
            assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSubstraction() {
        int result = 10 - 3;
        assertTrue(result == 6);
    }

}
