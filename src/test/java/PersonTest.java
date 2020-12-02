import static org.junit.Assert.*;

public class PersonTest {

    Person person0;
    Person person1;
    Person person2;
    Person person3;


    @org.junit.Before
    public void setUp() throws Exception {
        Person person0 = new Person("Anataliya");
        Person person1 = new Person("Kravinsky");
        Person person2 = new Person("Stanko");
        Person person3 = new Person("Ivanka");


    }

    @org.junit.Test
    public void generateAge() {

    }

    @org.junit.Test
    public void generateBirthDay() {
    }

    @org.junit.Test
    public void getGender() {
    }

    @org.junit.Test
    public void printPerson() {
    }
}