package main.java.com.Annotaion;

import java.lang.annotation.Annotation;

public class TestAnnotation {
    public static void main(String[] args) {
        Class aClass = Apple.class;
        if (aClass.isAnnotationPresent(Fruit.class)){
            Fruit anno = (Fruit) aClass.getAnnotation(Fruit.class);
            String name = anno.name();
            float price = anno.price();
            String color = anno.color();
            System.out.println(name);
            System.out.println(price);
            System.out.println(color);
        }
    }
}
