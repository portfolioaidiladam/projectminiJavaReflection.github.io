package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.data.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ConstructorTest {

  // Constructor
  @Test
  void testGetConstructors() {

    Class<Person> personClass = Person.class;

    Constructor<?>[] constructors = personClass.getDeclaredConstructors();
    for (Constructor<?> constructor : constructors) {
      System.out.println(constructor.getName());
      System.out.println(Arrays.toString(constructor.getParameterTypes()));
      System.out.println("=========");
    }

  }

  // Membuat Object dengan Constructor
  @Test
  void testCreateObjectUsingConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

    Class<Person> personClass = Person.class;

    Constructor<Person> constructor = personClass.getConstructor();
    Constructor<Person> constructorParameters = personClass.getConstructor(String.class, String.class);

    Person person1 = constructor.newInstance();
    Person person2 = constructorParameters.newInstance("Aidil", "Adam");

    System.out.println(person1);
    System.out.println(person2);

  }
}
