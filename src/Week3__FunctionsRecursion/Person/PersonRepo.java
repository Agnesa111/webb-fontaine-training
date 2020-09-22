package Week3__FunctionsRecursion.Person;

/**
 * Created by Agnesa on Sep, 2020
 */
public class PersonRepo {
    static String[] companies = {"Webb Fontaine", "Google", "FB", "Amazon","Linkedin"};
    static String[] names = {"Bob", "John", "Carol", "Ann","Max","Christian","Monica"};

    public static Person[] getData() {
        Person[] persons = new Person[10];
        for (int i = 0; i < persons.length; i++) {
            Person person = new Person();
            person.name = names[(int)(Math.random()*4)];
            person.company = companies[(int)(Math.random()*4)];
            person.age = (int)((Math.random())*100);
            persons[i] = person;
        }
        return persons;
    }
}
