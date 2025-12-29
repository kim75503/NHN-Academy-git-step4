package com.nhnacademy.practice_problems_33;

public class Main {
    public static void main(String[] args) {
        //####문제 33: 다음 코드의 출력 결과를 예측하세요.
        /*
        정답 : 동물이 소리를 냅니다.
              멍멍!
         */
    }

}
class Animal {
    public void speak() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("멍멍!");
    }
}

 class Problem33 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.speak();
        d.speak();
    }
}