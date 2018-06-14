package JCF;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

    public static void main(String[] args) {

        Person person1 = new Person("Alex", 46);
        Person person2 = new Person("Katia", 31);
        Person person3 = new Person("Sia", 5);
        Person person4 = new Person("Kosta", 1);

        Queue<Person> personQueue1
                = new PriorityQueue<>(Comparator.comparing(Person::getAge));
        Queue<Person> personQueue = new PriorityQueue<>(new PersonComparator());
        personQueue.add(person1);
        personQueue.add(person2);
        personQueue.add(person3);
        personQueue.add(person4);

        System.out.println(personQueue);


    }
}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }

}

