import java.util.ArrayList;
import java.util.List;

public class Roster {

    private static final Roster singleton = new Roster();

    List<Person> people;

    private Roster() {
        this.people = new ArrayList<>();
    }

    public static Roster getInstance() {
        return singleton;
    }

    public List<Person> getRoster(Person person) {
        return this.people;
    }
}
