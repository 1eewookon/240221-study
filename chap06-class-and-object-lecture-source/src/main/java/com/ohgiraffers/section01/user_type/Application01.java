package com.ohgiraffers.section01.user_type;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 클래스가 무엇인지 이해하고 작성할 수 있다. */

        /* 필기.
        *   회원 정보를 관리하기 위해 회원의 여러 정보(아이디, 비밀번호, 이름, 나이, 성별, 취미)를 관리
        *  */

        /* 목차. 1. 변수를 이용한 회원데이터 관리 */
        String id = "user01";
        String pwd = "pass01";
        String name = "조평훈";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[] {"야구", "배드민턴", "탁구"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.print("hobby = ");
        for(int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }

        System.out.println();

        /* 필기.
        *   이렇게 각각의 변수로 관리하게 되면 여러 가지 단점이 있다.
        *   1. 변수명을 다 관리해야 하는 어려움이 생긴다.
        *   2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면
        *      너무 많은 값들을 인자로 전달해야 해서 한 눈에 안 들어온다.
        *   3. 리턴은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리턴 값으로 사용할 수 없다.
        *      (서로 다른 자료형들이기 때문이다.)
        *  */

    }

}
