package com.nhnacademy.practice_problems_12;

public class Main {
    public static void main(String[] args) {
        //####문제 12: 다음 코드의 문제점을 설명하고 해결책을 제시하세요.
        /*
        정답 : - balance 필드가 public이라 외부에서 직접 접근 가능
              - 잘못된 값(음수)이 저장될 수 있음
         */
    }
}
class Account {
    public int balance;
}

class Problem12 {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.balance = -10000; // 잔액이 음수가 됨

        System.out.println("Account balance: " + acc.balance);
    }
}