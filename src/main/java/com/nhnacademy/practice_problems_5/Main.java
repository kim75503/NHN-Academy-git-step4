package com.nhnacademy.practice_problems_5;

public class Main {
    public static void main(String[] args) {
        //####문제 5: 다음 두 코드를 비교하고, 클래스로 묶었을 때의 장점을 설명하세요.
        /*
        // 코드 A: 데이터와 동작이 분리됨
        String todoTitle = "공부";
        int todoHours = 3;
        boolean todoDone = false;

        void completeTodo() {
            todoDone = true;
        }

        // 코드 B: 클래스로 묶음
        Todo todo = new Todo("공부", 3, false);
        todo.complete();
        
        정답 : 
        코드 A의 문제점:

        변수들이 흩어져 있어 어떤 할 일의 데이터인지 불명확
        completeTodo()가 어떤 할 일을 완료하는지 알 수 없음
        여러 개의 할 일을 관리하려면 변수 이름을 계속 바꿔야 함 (todo1Title, todo2Title...)
        
        코드 B의 장점:

        todo.complete()처럼 어떤 오브젝트의 동작인지 명확
        여러 개의 할 일을 todo1, todo2로 쉽게 관리
        관련 데이터와 동작이 한 곳에 모여 있어 이해하기 쉬움
        */

        
    }
}
