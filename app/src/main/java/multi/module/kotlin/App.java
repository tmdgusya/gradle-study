/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package multi.module.kotlin;

import domain.Person;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Person person = new Person("Roach", 20);
        System.out.println(new App().getGreeting());
        System.out.println("Multi Module Project Success??");

        person.hello();
    }
}
