package com.nhnacademy.practice_problems_10;

public class Main {
    public static void main(String[] args) {
      
    //####문제 10: 다음 코드의 출력 결과를 예측하세요.
    /*
    
    정답 : 3

    */
    
    }
}

class Counter {
    private int count;
    private static int totalCount = 0;

    public Counter() {
        this.count = 0;
        totalCount++;
    }

    public static int getTotalCount() {
        return totalCount;
    }
}

class Problem10 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(Counter.getTotalCount());
    }
}
