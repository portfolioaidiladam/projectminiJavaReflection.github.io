package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.data.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterTest {

  // Parameter
  @Test
  void getGetParameters() {

    Class<Person> personClass = Person.class;
    Method[] methods = personClass.getDeclaredMethods();
    for (Method method : methods) {
      System.out.println(method.getName());
      Parameter[] parameters = method.getParameters();
      for (Parameter parameter : parameters) {
        System.out.println("Parameter Name : " + parameter.getName());
        System.out.println("Parameter Type : " + parameter.getType());
      }
      System.out.println("===========");
    }

  }

  // Memanggil Method dengan Parameter
  @Test
  void testInvokeMethodWithParameter() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

    Class<Person> personClass = Person.class;
    Method setFirstName = personClass.getDeclaredMethod("setFirstName", String.class);

    Person person = new Person("Aidil", "Adam");
    setFirstName.invoke(person, "Joko");

    System.out.println(person.getFirstName());

  }
}
