package com.ohgiraffers.section08.initblock;

public class Product {

    /* 목차. 1. 필드를 초기화 하지 않으면 JVM이 정한 기본값으로 객체가 생성된다. */
//    private String name;
//    private int price;
//    private static String brand;

    /* 목차. 2. 명시적 초기화 */
    private String name = "갤럭시";
    private int price = 1000;
    private static String brand = "삼송";

    /* 목차. 3. 인스턴스 초기화 블럭 */
    {
        name = "아이뽕";
        price = 2000;
        brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작함...");

    }


    public String getInfo() {

        return "Product [name=" + this.name + ", price=" + this.price + ", brand=" + Product.brand + "]";
    }

}
