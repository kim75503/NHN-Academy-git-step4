package com.nhnacademy.practice_problems_8;

public class Main {
    public static void main(String[] args) {
        //###문제 8: 다음 코드에서 필드, 생성자, 메서드를 각각 구분하세요.

        
    }
}

class Product {                 // 정답 :
    private String name;           // (A) 필드
    private int price;             // (B) 필드

    public Product(String name, int price) {  // (C) 생성지
        this.name = name;
        this.price = price;
    }

    public String getName() {      // (D) 메서드
        return name;
    }
}
