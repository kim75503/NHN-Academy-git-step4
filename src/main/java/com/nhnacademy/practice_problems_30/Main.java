package com.nhnacademy.practice_problems_30;

public class Main {
    public static void main(String[] args) {
        //####문제 30: 다음 요구사항을 만족하는 코드를 작성하세요.
        /*
        - Student 클래스 정의 (필드: name, grade)
        - 생성자와 Getter 구현
        - 오브젝트 생성 후 정보 출력
         */

        Student st1 = new Student("Min Seo", 3);
        System.out.println(st1.getname());
        System.out.println(st1.getgrade());
    }
}

class Student {
    private String name;
    private int grade;

    Student(){}

    Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
    public String getname() { return this.name; }
    public int getgrade() { return this.grade; }
}
