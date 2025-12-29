package com.nhnacademy.practice_problems_22;

public class Main {
    public static void main(String[] args) {
        //####문제 22: 다음 코드의 출력 결과를 예측하세요.

        // 정답 : 8
        //      24
    }

    
}
class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}

 class Problem22 {
    public static void main(String[] args) {
        int sum = Calculator.add(3, 5);
        int product = Calculator.multiply(4, 6);
        System.out.println(sum);
        System.out.println(product);
    }
}