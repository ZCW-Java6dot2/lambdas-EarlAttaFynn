import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RosterTest {
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


    @Before
    public void setup(){

    }

    @Test
    public void testTest() {

        roster1.getRoster()
                .stream()
                .filter(roster1::test)
                .forEach(p -> Assert.assertTrue(p.age < 36));
    }

    @Test
    public void printPersonTestAnonymous() {
        roster2.getRoster()
                .stream()
                .filter(roster2::test)
                .forEach(p -> Assert.assertTrue(p.gender.equals(Person.Sex.FEMALE)));
    }
}