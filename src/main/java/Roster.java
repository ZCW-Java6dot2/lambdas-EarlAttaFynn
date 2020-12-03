import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Roster implements CheckPerson {

    //Singleton instances, one with anonymous inner class
    // overriding test and print methods

    private static final Roster singleton = new Roster();
    private static final Roster anon = new Roster() {
        public boolean test(Person person) {
            return person.gender.equals(Person.Sex.FEMALE);
        }
        public void printPerson() {
            this.people.stream()
                    .filter(this::test)
                    .forEach(Person::toString);
        }
    };

    List<Person> people;

    private Roster() {
        this.people = new ArrayList<>();
    }

    public static Roster getInstance() {
        return singleton;
    }

    public static Roster getInstance2() {
        return anon;
    }

    public List<Person> getRoster() {
        return this.people;
    }

    public void printPerson() {
        this.people.stream()
                .filter(this::test)
                .forEach(Person::toString);

    }

    @Override
    public boolean test(Person person) {
        return person.age < 35;
    }



    public static void main(String[] args) {
        Roster roster1 = Roster.getInstance();
        Roster roster2 = Roster.getInstance2();
        Person person0 = new Person("Anataliya");
        Person person1 = new Person("Kravinsky");
        Person person2 = new Person("Stanko");
        Person person3 = new Person("Ivanka");
        Person person4 = new Person("Ivanovic");
        Person person5 = new Person("Yvgeny");
        Person person6 = new Person("Miroslav");
        Person person7 = new Person("Bogdan");

        roster1.printPerson();
        System.out.println("---------------------------------------------\n");
        roster2.printPerson();
    }
}

