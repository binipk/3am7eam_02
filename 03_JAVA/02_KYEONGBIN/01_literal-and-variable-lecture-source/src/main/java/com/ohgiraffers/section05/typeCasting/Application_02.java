package com.ohgiraffers.section05.typeCasting;

public class Application_02 {
    public static void main(String[] args) {

        long lNum = 80000000000L;
        int iNum = (int) lNum;
        System.out.println("\niNum = " + iNum);

        float avg = 31.235f;
        int floorNum = (int) avg;

        System.out.println("\nfloorNum = " + floorNum);
    }
}
