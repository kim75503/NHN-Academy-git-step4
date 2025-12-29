package com.nhnacademy.Summary;

public class Main {
    public static void main(String[] args) {
        //###클래스(Class)란?
        //####클래스란?
        /*
        - 오브젝트를 만들기 위한 설계도(Blueprint)
        - 데이터(필드)와 동작(메서드)를 하나로 묶음)
        - 현실 세꼐의 개념을 코드로 표현하는 방법

        ####왜 데이터와 메서드를 함께 묶는가?

        - 데이터와 그 데이터를 다루는 동작은 밀접하게 관련되어 있습니다. 
        이를 함께 묶으면:
        장점	        설명
        응집도 향상      관련된 것들이 한 곳에 모여 있어 이해하기 쉬움
        캡슐화	        데이터를 숨기고, 메서드를 통해서만 접근하게 하여 잘못된 사용 방지
        재사용성	    클래스 단위로 다른 프로그램에서 재사용 가능
        유지보수    	변경이 필요할 때 한 곳만 수정하면 됨
         */

        
        // 나쁜 예: 데이터와 동작이 분리됨
        String todoTitle = "공부";
        int todoHours = 3;
        boolean todoDone = false;

        //void completeTodo() { todoDone = true; }  // 어떤 todo를 완료하는 건지 불명확

        //좋은 예: 데이터와 동작이 함께 묶임
        Todo todo = new Todo("공부", 3, false);
        todo.complete();  // 이 todo를 완료
        

        //####비유로 이해하기:
        /*
        // 클래스 = 설계도 (1개)
        public class Todo { ... }

        // 오브젝트 = 설계도로 만든 실체 (여러 개 가능)
        Todo todo1 = new Todo("공부", 3, false);
        Todo todo2 = new Todo("운동", 1, false);
         */

        //###클래스의 기본 구조
        //맨 아래 클래스의 3가지 구성요소 보기.


        //####구성 요소 정리:
        /*
        요소	                역할	                    키워드/문법
        필드 (Field)	        오브젝트의 상태(데이터) 저장	 private 타입 이름;
        생성자 (Constructor)	 오브젝트 생성 시 초기화	     public 클래스명(매개변수)
        메서드 (Method)	         오브젝트의 동작 정의	        public 반환타입 이름(매개변수)
        
        +Getter/Setter도 메서드입니다. 필드에 접근하기 위한 특별한 명명 규칙(getXxx, setXxx)을 따르는 메서드입니다.
        */

        //####Instance vs Static (참고):
        /*
        구분	Instance (인스턴스)	     Static (정적)
        소속	각 오브젝트에 속함	      클래스 자체에 속함
        접근	object.field	      ClassName.field
        메모리	 오브젝트마다 별도	       클래스당 1개
        예시	todo.title	          Math.PI, Integer.MAX_VALUE
         */


        /*
        public class Counter {
            // instance 변수 - 각 오브젝트마다 다른 값
            private int count;

            // static 변수 - 모든 오브젝트가 공유
            private static int totalCount = 0;

            public Counter() {
                this.count = 0;
                totalCount++;  // 생성될 때마다 증가
            }
        }
         */

        //####파일 구조:
        /*
        src/main/java/com/example/todo/
        ├── Main.java       ← main() 메서드
        └── Todo.java       ← Todo 클래스 (별도 파일)
         */


        //###필드(Field) - 데이터 저장
        //####필드란?
        /*
        - 오브젝트가 가지는 데이터(상태)
        - 클래스 내부에 선언하는 변수
         */

        //####필드 선언 문법:
        //접근제어자 타입 필드명;

        //####Todo 클래스의 필드:
        /*
        public class Todo{
        // 필드 선언
        private String title; // 할 일 제목
        private int hours;    // 예상 소요 시간
        private boolean done; // 완료 여부
        }
         */

        //####접근 제어자:
        /*  
        접근 제어자     설명	                권장 사용
        private	    클래스 내부에서만 접근 가능	  필드에 권장
        public	    어디서든 접근 가능	       메서드에 사용
        (없음)	     같은 패키지에서 접근 가능	  권장하지 않음
         */

        //####왜 필드는 private으로 선언하나?
        /*
        // 나쁜 예: public 필드
        public class Todo {
            public int hours;
        }
        todo.hours = -100;  // 잘못된 값 저장 가능!

        // 좋은 예: private 필드 + setter로 검증
        public class Todo {
            private int hours;

            public void setHours(int hours) {
                if (hours > 0) {  // 검증 가능
                    this.hours = hours;
                }
            }
        }
        */

        //###생성자(Constructor) - 오브젝트 초기화
        //####생성자란?
        /*

        - 오브젝트를 생성할 때 호출되는 특별한 매서드
        - 필드의 초기값을 설정하는 역할
        - 클래스 이름과 동일, 반환 타입 없음
         */

        //####생성자 문법:
        /*
        public 클래스명(매개변수){
            // 초기화 코드
        }
         */

        //####Todo 클래스의 생성자
        /*
        public class Todo {
           private String title;
            private int hours;
            private boolean done;

            // 생성자
            public Todo(String title, int hours, boolean done) {
                this.title = title;   // 매개변수 → 필드에 저장
                this.hours = hours;
                this.done = done;
            }
        }
         */

        //####this 키워드:
        /*
        - this는 현재 오브젝트 자신을 가리킴
        - 매개변수와 필드 이름이 같을 때 구분하기 위해 사용

        public Todo(String title, int hours, boolean done) {
           this.title = title;
            //   ↑          ↑
            // 필드      매개변수
        }
         */

        //####기본 생성자 vs 매개변수 생성자:
        /*
        public class Todo {
            private String title;
            private int hours;
            private boolean done;

            // 기본 생성자 (매개변수 없음)
            public Todo() {
                this.title = "제목 없음";
                this.hours = 0;
                this.done = false;
            }

            // 매개변수 생성자
            public Todo(String title, int hours, boolean done) {
                this.title = title;
                this.hours = hours;
                this.done = done;
            }
        }

        // 사용
        Todo todo1 = new Todo();                      // 기본 생성자
        Todo todo2 = new Todo("공부", 3, false);      // 매개변수 생성자        
         */


        //###메서드(Method) - 동작 정의
        //####메서드란?
        /*
        - 오브젝트가 수행하는 동작(행위)을 정의
        - 입력(매개변수)을 받아 처리하고, 결과(반환값)를 돌려줌
         */
        
        //####메서드 선언 문법:
        /*
        접근제어자 반환타입 메서드명(매개변수) {
           // 실행할 코드
            return 반환값;  // 반환타입이 void면 생략
        }
         */

        //####Todo클래스의 메서드 예시:
        /*
        public class Todo {
          private String title;
            private int hours;
            private boolean done;

            // 생성자 (생략)

            // 반환값이 있는 메서드
            public String getTitle() {
                return title;
            }

            // 반환값이 없는 메서드 (void)
            public void complete() {
                done = true;
            }

            // 매개변수가 있는 메서드
            public void setHours(int hours) {
                this.hours = hours;
            }

            // 매개변수와 반환값 모두 있는 메서드
            public boolean canFinishIn(int availableHours) {
                return hours <= availableHours;
            }
        }
        */

        //####메서드 사용:
        /*
        Todo todo = new Todo("공부", 3, false);

        String title = todo.getTitle();           // "공부" 반환
        todo.complete();                          // done을 true로 변경
        todo.setHours(5);                         // hours를 5로 변경
        boolean ok = todo.canFinishIn(4);         // false (5시간 > 4시간)
         */
        
        //####Instance Method vs Class Method (Static):
        /*
        구분	   Instance Method	        Class Method (Static)
        선언  	   public void method()	    public static void method()
        호출	   object.method()	        ClassName.method()
        this 사용	  가능	                    불가능
        필드 접근	instance 필드 접근 가능	     static 필드만 접근 가능
        용도	   오브젝트의 동작	            유틸리티, 공통 기능
        */

        //####Instance Method - 오브젝트에 속한 메서드:
        /*
        public class Todo {
            private String title;

            // instance method - 오브젝트마다 다른 결과
            public String getTitle() {
                return title;  // 이 오브젝트의 title 반환
            }
        }

        Todo todo1 = new Todo("공부", 3, false);
        Todo todo2 = new Todo("운동", 1, false);

        todo1.getTitle();  // "공부"
        todo2.getTitle();  // "운동" - 오브젝트마다 다름
        */

        //####Class Method (Static) - 클래스에 속한 메서드:
        /*
        public class MathUtil {
            // static method - 오브젝트 없이 호출
            public static int add(int a, int b) {
                return a + b;
            }

            public static int max(int a, int b) {
                return (a > b) ? a : b;
            }
        }

        // 클래스명으로 직접 호출 (오브젝트 생성 불필요)
        int sum = MathUtil.add(3, 5);     // 8
        int max = MathUtil.max(10, 7);    // 10
         */
        
        //####Java 기본 제공 static 메서드 예시:
        /*
        // Math 클래스
        Math.abs(-5);           // 5 (절대값)
        Math.max(3, 7);         // 7 (최대값)
        Math.random();          // 0.0 ~ 1.0 난수

        // Integer 클래스
        Integer.parseInt("42"); // 42 (문자열 → 정수)

        // String 클래스
        String.valueOf(123);    // "123" (정수 → 문자열)
         */
        
        
        //###Getter와 Setter - 필드 접근
        //####왜 Getter/Setter가 필요한가?

        /*
        필드를 private으로 선언하면 외부에서 직접 접근할 수 없습니다. 그래서 public 메서드를 통해 간접적으로 접근합니다.

        public class Todo {
            private String title;   // 외부에서 직접 접근 불가
            private int hours;
        }

        Todo todo = new Todo("공부", 3, false);
        todo.title = "운동";  // ❌ 컴파일 에러! private 필드 접근 불가

         */

        //####접근 제어자와 캡슐화:
        /*
        접근 제어자	    접근 범위	       사용 목적
        private	     같은 클래스 내부만	  필드 보호 (외부 접근 차단)
        public	     어디서든 접근 가능	  메서드 공개 (외부에 기능 제공)
         */
        /*
        public class Todo {
           private int hours;          // private: 외부에서 직접 접근 불가

            public int getHours() {     // public: 외부에서 호출 가능
                return hours;           // 클래스 내부에서 private 필드 접근
            }

            public void setHours(int hours) {
                if (hours > 0) {        // 검증 로직 추가 가능!
                    this.hours = hours;
                }
            }
        }
         */

        //####Getter린?
        /*
        - 필드 값을 읽어서 반환하는 메서드
        - 이름 규칙 : get필드명() (boolean은 is필드명())
         */

        //####Setter란?
        /*
        - 필드 값을 변경하는 메서드
        - 이름 규칙: set필드명(새값)
         */

        //####Todo 클래스의 Getter/Setter:
        /*
        public class Todo {
           private String title;
            private int hours;
            private boolean done;

            // 생성자 (생략)

            // ===== Getter =====
            public String getTitle() {
                return title;
            }

            public int getHours() {
                return hours;
            }

            // boolean은 is로 시작
            public boolean isDone() {
                return done;
            }   

            // ===== Setter =====
            public void setTitle(String title) {
                this.title = title;
            }

            public void setHours(int hours) {
                this.hours = hours;
            }

            public void setDone(boolean done) {
                this.done = done;
            }   
        }
         */

        //####Getter/Setter 사용:
        /*
        Todo todo = new Todo("공부", 3, false);

        // Getter로 값 읽기
        String title = todo.getTitle();    // "공부"
        int hours = todo.getHours();       // 3
        boolean done = todo.isDone();      // false

        // Setter로 값 변경
        todo.setTitle("Java 공부");
        todo.setDone(true);
         */

        //####왜 Getter/Setter를 사용하나?
        /*
        이유	     설명	                        예시
        캡슐화	    내부 구현을 숨기고 안전하게 접근	필드명 변경해도 메서드명 유지 가능
        검증 가능	Setter에서 잘못된 값 차단	     if (hours > 0) 검증
        읽기 전용	Getter만 제공하면 변경 불가	      getTitle()만 제공, setTitle() 없음
         */

        /*
        // 나쁜 예: public 필드 (직접 접근)
        public class Todo {
            public int hours;
        }
        todo.hours = -100;  // 잘못된 값 저장 가능!

        // 좋은 예: private 필드 + setter 검증
        public class Todo {
            private int hours;

            public void setHours(int hours) {
                if (hours > 0) {
                    this.hours = hours;
                }
            }
        }
        todo.setHours(-100);  // 검증 실패, 값 변경 안 됨
         */

        //###오브젝트(Object) 생성하기
        //####new 키워드로 오브젝트 생성:
        /*
        // 오브젝트 생성
        Todo todo1 = new Todo("Java 공부", 3, false);
        Todo todo2 = new Todo("운동하기", 1, true);

        // 오브젝트 사용
        System.out.println(todo1.getTitle());  // "Java 공부"
        System.out.println(todo1.isDone());    // false

        // 상태 변경
        todo1.setDone(true);
        System.out.println(todo1.isDone());    // true
         */

        //####클래스 vs 오브젝트:
        /*
        구분	클래스	        오브젝트
        정의	설계도	      설계도로 만든 실제 물건
        메모리	코드 영역	   힙(Heap) 영역
        개수	1개	         여러 개 가능
        예시	Todo 클래스	  todo1, todo2
         */

        //###Object 클래스 - 모든 클래스의 조상
        //####Object 클래스란?
        /*
        Java에서 모든 클래스는 Object 클래스를 상속받습니다. 명시적으로 상속을 선언하지 않아도 자동으로 Object를 상속합니다.

        // 이 두 선언은 동일합니다
        public class Todo { }
        public class Todo extends Object { }  // 자동으로 Object 상속
         */

        //####클래스 계층 구조:
        /*
                Object          ← 모든 클래스의 최상위 조상
                  ↑
                Todo            ← Object를 상속
         */

         //####왜 중요한가?
         /*
         Object 클래스가 제공하는 메서드를 모든 클래스에서 사용할 수 있습니다:

        메서드	               설명	                   기본 동작
        toString()	         오브젝트를 문자열로 표현	클래스명@해시코드
        equals(Object obj)	 두 오브젝트 동등성 비교	참조(주소) 비교
        hashCode()	        오브젝트의 해시코드 반환	메모리 주소 기반 값
          */

        //####기본 toString() 출력:
        /*
        Todo todo = new Todo("공부", 3, false);
        System.out.println(todo);           // Todo@15db9742 (기본 출력)
        System.out.println(todo.toString()); // 위와 동일
        
        +println(todo)는 내부적으로 todo.toString()을 호출합니다. 
        */

        //####기본 출력이 의미 없는 이유:
        /*
        - Todo@15db9742는 클래스명@해시코드 형태
        - 오브젝트의 실제 내용(title, hours, done)을 알 수 없음
        - 디버깅이나 로그 출력에 불편함
        
        + 이 문제를 해결하려면 toString() 메서드를 재정의해야 합니다.
        */

        //###클래스 확장(extends) - 상속
        //####상속이란?
        /*
        기존 클래스(부모)의 필드와 메서드를 물려받아 새로운 클래스(자식)를 만드는 것입니다.

        public class 자식클래스 extends 부모클래스 {
            // 부모의 필드와 메서드를 자동으로 물려받음
            // 추가 필드나 메서드 정의 가능
            }
         */

        //###예시: 동물 클래스:
        /*
        // 부모 클래스
        public class Animal {
            private String name;

            public Animal(String name) {
                this.name = name;
            }

            public void eat() {
                System.out.println(name + "이(가) 먹습니다.");
            }

            public String getName() {
                return name;
            }
        }

        // 자식 클래스 - Animal을 확장
        public class Dog extends Animal {

            public Dog(String name) {
                super(name);  // 부모 생성자 호출
            }

            // Dog만의 고유 메서드
            public void bark() {
                System.out.println(getName() + "이(가) 짖습니다: 멍멍!");
            }
        }
        */

        //####사용:
        /*
        Dog dog = new Dog("바둑이");
        dog.eat();   // "바둑이이(가) 먹습니다." - 부모에게 물려받은 메서드
        dog.bark();  // "바둑이이(가) 짖습니다: 멍멍!" - Dog만의 메서드
        */

        //####상속 계층 구조:
        /*
                Object
                  ↑
                Animal     ← eat(), getName()
                  ↑
                Dog        ← bark() 추가, eat() 상속받음
         */


        //####핵심 키워드:
        /*
        키워드	의미	사용 위치
        extends	클래스 확장 (상속)	클래스 선언부
        super	부모 클래스 참조	생성자, 메서드 내부
        super()	부모 생성자 호출	자식 생성자 첫 줄
         */

        //####모든 클래스는 Object를 상속:
        /*
        public class Todo { }
        // 실제로는: public class Todo extends Object { }

        Todo todo = new Todo("공부", 3, false);
        todo.toString();  // Object에서 물려받은 메서드
         */


        //###메서드 재정의 (Override)
        //####메서드 재정의란?
        /*
        부모 클래스에서 물려받은 메서드를 자식 클래스에서 다시 정의하는 것입니다.

        public class Animal {
            public void speak() {
                System.out.println("동물이 소리를 냅니다.");
            }
        }

        public class Dog extends Animal {
            @Override  // 재정의 표시 (권장)
            public void speak() {
                System.out.println("멍멍!");  // 부모의 speak()를 재정의
            }
        }

        public class Cat extends Animal {
            @Override
            public void speak() {
                System.out.println("야옹!");
            }
        }
        */

        //####사용:
        /*
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.speak();  // "동물이 소리를 냅니다."
        dog.speak();     // "멍멍!" - 재정의된 메서드 호출
        cat.speak();     // "야옹!" - 재정의된 메서드 호출
         */

        //####@Override 어노테이션:
        /*
        - 권장 사항: 재정의할 때 @Override를 붙이는 것이 좋음
        - 역할: 컴파일러가 실제로 부모 메서드를 재정의하는지 확인
        - 실수 방지: 메서드 이름이나 매개변수가 다르면 컴파일 에러 발생
        
        public class Dog extends Animal {
            @Override
            public void speak() { }  // ✅ 정상: 부모의 speak() 재정의
        
            @Override
            public void speck() { }  // ❌ 컴파일 에러: 부모에 speck() 없음
        }
         */

        //####재정의 규칙:
        /*
        항목	       규칙
        메서드 이름	  부모와 동일해야 함
        매개변수 	 부모와 동일해야 함
        반환 타입	 부모와 동일하거나 하위 타입
        접근 제어자	  부모보다 같거나 넓어야 함
         */

        
        //###toString() 재정의 - 오브젝트를 문자열로
        //####왜 toString()을 재정의하나?
        /*
        - 기본 toString()은 Todo@15db9742 같은 무의미한 문자열을 반환합니다. 오브젝트의 내용을 알아보기 쉽게 재정의합니다.
         */

        //####기본 동작 vs 재정의:
        /*
        // 재정의 전
        Todo todo = new Todo("공부", 3, false);
        System.out.println(todo);  // Todo@15db9742

        // 재정의 후
        System.out.println(todo);  // Todo{title='공부', hours=3, done=false}
        */

        //####toString() 재정의 방법:
        /*
        public class Todo {
            private String title;
            private int hours;
            private boolean done;

            // 생성자, getter/setter 생략

            @Override
            public String toString() {
                return "Todo{title='" + title + "', hours=" + hours + ", done=" + done + "}";
            }
        }
        */

        //####활용 예시:
        /*
        Todo todo1 = new Todo("Java 공부", 3, false);
        Todo todo2 = new Todo("운동하기", 1, true);

        // println에서 자동으로 toString() 호출
        System.out.println(todo1);  // Todo{title='Java 공부', hours=3, done=false}
        System.out.println(todo2);  // Todo{title='운동하기', hours=1, done=true}

        // 디버깅에 유용
        System.out.println("현재 할 일: " + todo1);
         */
        
        //####다양한 toString() 형식:
        /* 
        // 형식 1: 클래스명{필드=값}
        @Override
        public String toString() {
            return "Todo{title='" + title + "', hours=" + hours + ", done=" + done + "}";
        }
        // 출력: Todo{title='공부', hours=3, done=false}

        // 형식 2: 간단한 형식
        @Override
        public String toString() {
            String status = done ? "[완료]" : "[미완료]";
            return status + " " + title + " (" + hours + "시간)";
        }
        // 출력: [미완료] 공부 (3시간)

        // 형식 3: 여러 줄
        @Override
        public String toString() {
            return "=== TODO ===\n" +
                "제목: " + title + "\n" +
                "시간: " + hours + "시간\n" +
                "완료: " + (done ? "예" : "아니오");
        }
        */

        //####toString()이 호출되는 상황:
        /*
        Todo todo = new Todo("공부", 3, false);

        // 1. println()에서 자동 호출
        System.out.println(todo);

        // 2. 문자열 연결에서 자동 호출
        String msg = "할 일: " + todo;

        // 3. 명시적 호출
        String str = todo.toString();
        
        + 팁: 대부분의 IDE(IntelliJ, Eclipse)에서 toString()을 자동 생성해주는 기능이 있습니다.
        */

    }
}

//####클래스의 3가지 구성요소:
/*public */class Todo {
    // 1. 필드 (Instance Variables) - 데이터 저장
    private String title;
    private int hours;
    private boolean done;

    // 2. 생성자 (Constructor) - 오브젝트 초기화
    public Todo(String title, int hours, boolean done) {
        this.title = title;
        this.hours = hours;
        this.done = done;
    }

    // 3. 메서드 (Methods) - 동작 정의
    public void complete() {
        done = true;
    }

    public String getTitle() {
        return title;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}