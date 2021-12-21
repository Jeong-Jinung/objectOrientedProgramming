package chapter4.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class c1 = Class.forName("chapter4.ch04.Person");

        Person person = (Person) c1.newInstance();
        person.setName("Lee");
        System.out.println(person);

        Class c2 = person.getClass(); // 이미 인스턴스가 있는 상태여야 쓸 수 있는 메서드
        Person person2 = (Person) c2.newInstance();
        System.out.println(person2);

        Class[] parameterTypes = {String.class};
        Constructor constructor = c2.getConstructor(parameterTypes);

        Object[] initargs = {"Kim"};
        Person kimPerson = (Person) constructor.newInstance(initargs);
        System.out.println(kimPerson);

    }
}
