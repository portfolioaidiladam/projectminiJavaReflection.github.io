package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.data.Person;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrimitiveTypeTest {

  // Primitive Type
  @Test
  void testClass() {

    Class<Integer> integerClass = int.class;
    Class<Long> longClass = long.class;
    Class<Boolean> booleanClass = boolean.class;

    System.out.println(integerClass.isPrimitive());
    System.out.println(longClass.isPrimitive());
    System.out.println(booleanClass.isPrimitive());

  }

  // Field Primitive
  @Test
  void testGetField() throws NoSuchFieldException {
    Class<Person> personClass = Person.class;
    Field age = personClass.getDeclaredField("age");

    System.out.println(age.getType().isPrimitive());
  }

  // Mengambil Field Data Primitive
  @Test
  void testGetFieldValue() throws NoSuchFieldException, IllegalAccessException {
    Class<Person> personClass = Person.class;
    Field age = personClass.getDeclaredField("age");

    System.out.println(age.getType().isPrimitive());

    age.setAccessible(true);

    Person person = new Person("Aidil", "Adam");
    person.setAge(25);

    System.out.println(age.getInt(person));
  }

  // Mengambil Method Primitive Type
  @Test
  void testInvokeMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

    Class<Person> personClass = Person.class;
    Method setAge = personClass.getDeclaredMethod("setAge", int.class);

    Person person = new Person();
    setAge.invoke(person, 25);

    System.out.println(person);

  }
}
