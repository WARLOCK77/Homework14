package ua.levelup.homework14.annotations;

import ua.levelup.homework14.Generator;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MatrixProperties.class)
public @interface MatrixProperty {
    Class<? extends Generator<?>> type();
    int rows();
    int column();
}