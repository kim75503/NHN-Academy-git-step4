package com.nhnacademy.practice_problems_16;

public class Main {
    public static void main(String[] args) {
        //####문제 16: 다음 코드에서 잘못된 부분을 찾고 수정하세요.
        /*
        
        정답 : 생성자에 this.name = name, this.count = count 로 수정

         */
    }
}
class Item {
    private String name;
    private int count;

    public Item(String name, int count) {
        name = name;
        count = count;
    }
}