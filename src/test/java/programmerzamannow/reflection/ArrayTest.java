package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.data.Person;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {

  // Array
  @Test
  void testArrayClass() {

    Class<String[]> stringArrayClass = String[].class;
    Class<int[]> intArrayClass = int[].class;
    Class<Person> personClass = Person.class;

    System.out.println(stringArrayClass.isArray());
    System.out.println(intArrayClass.isArray());
    System.out.println(personClass.isArray());

  }

  // Array Member
  @Test
  void testArrayMember() {

    Class<String[]> stringArrayClass = String[].class;

    System.out.println(Arrays.toString(stringArrayClass.getDeclaredFields()));
    System.out.println(Arrays.toString(stringArrayClass.getDeclaredConstructors()));
    System.out.println(Arrays.toString(stringArrayClass.getDeclaredMethods()));
    System.out.println(stringArrayClass.getComponentType());

  }

  //  java.lang.reflect.Array
  @Test
  void testArrayManipulation() {

    Class<String[]> stringArrayClass = String[].class;

    String[] array = (String[]) Array.newInstance(stringArrayClass.getComponentType(), 10);

    System.out.println(Arrays.toString(array));

    Array.set(array, 0, "Aidil");
    Array.set(array, 1, "Adam");
    Array.set(array, 2, "Baik Hati");

    System.out.println(Arrays.toString(array));

    System.out.println(Array.get(array, 0));
    System.out.println(Array.get(array, 1));
    System.out.println(Array.get(array, 2));

  }
}
