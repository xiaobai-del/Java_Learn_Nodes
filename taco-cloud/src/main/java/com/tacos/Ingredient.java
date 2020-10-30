package com.tacos;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor//这个注解可以生成带参或者不带参的构造方法。
                        //若带参数，只能是类中所有带有 @NonNull注解的和以final修饰的未经初始化的字段
                        //两个条件都不满足，则生成无参构造方法
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
