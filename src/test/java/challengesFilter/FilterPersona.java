package challengesFilter;

import java.util.Arrays;
import java.util.List;

public class FilterPersona {

    public static void main(String[] args) {

        List<Persona> personas = Arrays.asList(
                new Persona("Juan", 25),
                new Persona("Maria", 30),
                new Persona("Pedro", 20),
                new Persona("Ana", 35)
        );

        // Tests
        // Filter persona less than 30 years

        List<Persona> personLessBy30 = personas.stream()
                .filter(p -> p.getAge() < 30).toList();
        System.out.println("Personas less than 30 years");
        //
        personLessBy30.forEach(persona -> System.out.println("Name " + persona));
        personLessBy30.forEach(System.out::println);

        // Filter person starting from 'M'

        List<Persona> personStartingM = personas.stream()
                .filter(p -> p.getName().startsWith("M")).toList();
        System.out.println("\nPersona Starting startsWith M");
        personStartingM.forEach(System.out::println);
    }


    static class Persona {

        private String name;
        private int age;


        public Persona(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }


        public String toString() {
            return "Persona {" +
                    "name='" + name + '\'' +
                    ", age" + age +
                    '}';
        }
    }


}
