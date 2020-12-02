import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Person {


    public enum Sex {
        MALE, FEMALE
    }

    String name;
    Integer age;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, String emailAddress) {
        this.name = name;
        this.age = generateAge();
        this.birthday = generateBirthDay();
        this.gender = getGender();
        this.emailAddress = emailAddress;
    }

    public int generateAge() {
        int age;
        int generated;
        Random random = new Random();

        generated = random.nextInt(65);
        while (generated < 21) {
            generated = random.nextInt(65);
        }
        age = generated;
        return age;
    }

    public LocalDate generateBirthDay() {
        Random random = new Random();
        int generated = 0;
        int year = 2020 - this.age;
        int month;
        int day;

        while (generated == 0) {
            generated = random.nextInt(12);
        }
        month = generated;
        generated = 0;

        while (generated == 0) {
            generated = random.nextInt(28);
        }
        day = generated;

        return LocalDate.of(year, month, day);
    }

    public Sex getGender() {
        int generated;
        Random random = new Random();

        generated = random.nextInt(2);

        if (generated == 0) {
            return Sex.FEMALE;
        } else {
            return Sex.MALE;
        }
    }


    public String printPerson() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String print =
                String.format("%s\n%s\n%d\n%s\n%s",
                this.name,this.gender.name(), this.age, this.birthday.format(formatter),
                 this.emailAddress);
        System.out.println(print);
        return print;
    }

    public static void main(String[] args) {
        Person person = new Person("Celine", "celine@gmail.com");
        person.printPerson();
    }
}
