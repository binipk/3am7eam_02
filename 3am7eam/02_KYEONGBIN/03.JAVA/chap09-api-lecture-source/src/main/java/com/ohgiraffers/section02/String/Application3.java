package com.ohgiraffers.section02.String;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Application3 {

    public static void main(String[] args) {

        /*
         * 문자열을 특정 구분자로 하여 분리한 문자열을 반환하는 기능을 한다.
         * split() : 정규표현식을 이용하여 문자열을 분리한다.
         *           비정형화된 문자열을 분리할 대 좋지만(공백 문자열 값 포함)
         *           정규표현식을 이용하기 때문에 속도가 느리다는 단점을 가진다.
         *           정규표현식은 자바에서는 다루지 않고 자바스크립트에서 다룰 예정
         * StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
         *                   정형화된 문자열 패턴을 분리할 대 사용하기 좋다. (공백 문자열 무시)
         *                   split()보다 속도면에서는 더 빠르다.
         *                   구분자를 생략하는 경우 공백이 기본 구분자이다.
         * */

        // 사번 / 이름 / 주소 / 부서

        String emp1 = "100/홍길동/서울/영업부";
        String emp2 = "200/유관순//총무부";
        String emp3 = "300/이순신/경기도/";

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");

        System.out.println(Arrays.toString(empArr1));
        System.out.println(Arrays.toString(empArr2));
        System.out.println(Arrays.toString(empArr3));

        System.out.println("----------");

        String[] empArr4 = emp3.split("/", -1);
        // split()의 두 번째 인자로 -1을 주면, 마지막 구분자 뒤에 값이 없어도 빈 문자열로 저장됨

        System.out.println(Arrays.toString(empArr4));

        StringTokenizer st1 = new StringTokenizer(emp1, "/");
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");

        System.out.println("----------");

        while (st1.hasMoreTokens()) { // hasMoreTokens() : 현재 꺼낼 토큰이 있는지 없는지 체크

            System.out.println("st1 : " + st1.nextToken());
        }
        System.out.println("----------");
        while (st2.hasMoreTokens()) { // hasMoreTokens() : 현재 꺼낼 토큰이 있는지 없는지 체크

            System.out.println("st2 : " + st2.nextToken());
        }
        System.out.println("----------");
        while (st3.hasMoreTokens()) { // hasMoreTokens() : 현재 꺼낼 토큰이 있는지 없는지 체크

            System.out.println("st3 : " + st3.nextToken());
        }
        System.out.println("----------");
        System.out.println("----------");
        while (st3.hasMoreTokens()) { // hasMoreTokens() : 현재 꺼낼 토큰이 있는지 없는지 체크

            System.out.println("st3 : " + st3.nextToken()); // 두번 못씀.. 다시 쓰려면 다시 split 해줘야 함
        }

        String colorStr = "red * orange/yellow green";
//        String[] colors = colorStr.split("#/"); // #/ 이렇게 생긴게 없음
        String[] colors = colorStr.split("[*i/ #]");
        System.out.println("Colors : " + Arrays.toString(colors));

        System.out.println("----------");
        StringTokenizer colorStringTokenizer = new StringTokenizer(colorStr, "*# /");
        while (colorStringTokenizer.hasMoreTokens()) {
            System.out.println("colorStringTokenizer : " + colorStringTokenizer.nextToken());
        }

    }
}
