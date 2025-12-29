package com.nhnacademy.practice_problems_17;

public class Main {
    public static void main(String[] args) {
        //####문제 17: 다음 두 생성자의 차이점을 설명하세요.
        /*
        정답 : A는 초기값이 무조건 0 인 반면, B는 초기값을 입력과 동시에 생성자를 호출할 때 만들 수 잇다.
         */
    }
}
 class Todo {
    private String title;
    private int hours;
    private boolean done;

    // 생성자 A
    public Todo() {
        this.title = "제목 없음";
        this.hours = 0;
        this.done = false;
    }

    // 생성자 B
    public Todo(String title, int hours, boolean done) {
        this.title = title;
        this.hours = hours;
        this.done = done;
    }
}
