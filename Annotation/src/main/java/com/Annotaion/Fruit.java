package main.java.com.Annotaion;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Fruit {
    String value() default "";
    String name() default "name";
    float price() default 0;
    String color() default "白色";
}
