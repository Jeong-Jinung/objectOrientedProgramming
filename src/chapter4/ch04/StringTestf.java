package chapter4.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTestf {

    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("java.lang.String");

        Constructor[] cons = c.getConstructors();

        for (Constructor constructor : cons) {
            System.out.println(constructor);
        }

        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

    }
}
