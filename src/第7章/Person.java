package 第7章;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name + name ;
        this.age = 2*age ;

    }
    public static void main(String[] args) {
        Person person = new Person("xiaoming", 2);
        System.out.println(person.name);
        System.out.println(person.age);
    }
}
