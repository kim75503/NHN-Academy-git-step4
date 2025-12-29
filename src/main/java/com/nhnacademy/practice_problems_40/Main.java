package com.nhnacademy.practice_problems_40;

public class Main {
    public static void main(String[] args) {
     //####문제 40: 다음 코드의 출력 결과를 예측하세요.
     /*
     정답: Java 입문 - 25000원
          구매할 책 : Java 입문 - 25000원
      */   
    }
}
class Book {
    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " - " + price + "원";
    }
}

 class Problem40 {
    public static void main(String[] args) {
        Book book = new Book("Java 입문", 25000);
        System.out.println(book);
        System.out.println("구매할 책: " + book);
    }
}