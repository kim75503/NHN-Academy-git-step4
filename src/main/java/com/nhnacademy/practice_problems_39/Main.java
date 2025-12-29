package com.nhnacademy.practice_problems_39;

public class Main {
    public static void main(String[] args) {
        //####문제 39: Todo 클래스에 toString()을 재정의하여 "[미완료] 공부 (3시간)" 형태로 출력되도록 하세요.

        Todo todo = new Todo("공부", 3, false);
        System.out.println(todo);
    }
}
 class Todo {
    private String title;
    private int hours;
    private boolean done;

    // 생성자, getter/setter 생략
    Todo(String title, int hours, boolean done){
        this.title = title;
        this.hours = hours;
        this.done = done;
    }

    @Override
    public String toString(){
        if(done)
            return "[완료] " +  title + " "+  hours;
        else
            return "[미완료] " +  title + " " + hours;
    }
    // toString() 재정의
}