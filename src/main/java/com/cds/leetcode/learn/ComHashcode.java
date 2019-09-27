package com.cds.leetcode.learn;

/**
 * Created by cds on 7/10/16.
 */
public class ComHashcode{
    public static void main(String[] args) throws Exception {
        ComHashcode a = new ComHashcode();
        ComHashcode b = new ComHashcode();
        System.out.println(a.hashCode());    //870919696
        System.out.println(b.hashCode());    //298792720

        Long num1 = new Long(8);
        Long num2 = new Long(8);
        System.out.println(num1.hashCode());    //8
        System.out.println(num2.hashCode());    //8
        System.out.println(num1.equals(num2));
        System.out.println(num1 == num2);
    }
}
