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

/**
 * Created by dinuka on 7/12/17.
 */
public interface ICalculator {
    int sum(int a, int b);

    int subtraction(int a, int b);

    int multiplication(int a, int b);

    int divison(int a, int b) throws Exception;

    boolean equalIntegers(int a, int b);
}
