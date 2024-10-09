package org.example;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args)
    {
        Class<?> string = String.class;

        Method[] methods = string.getMethods();

        for (int i = 0;i < methods.length;i++)
        {
            System.out.println(methods[i]);
        }
    }
}