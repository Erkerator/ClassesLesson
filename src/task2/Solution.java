package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static final String USER = "user";
    public static final String LOSER = "loser";
    public static final String CODER = "coder";
    public static final String PROGER = "proger";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while ((key = reader.readLine()) != null) {
            switch (key) {
                case (USER):
                    doWork(new Person.User());
                    break;
                case (LOSER):
                    doWork(new Person.Loser());
                    break;
                case (CODER):
                    doWork(new Person.Coder());
                    break;
                case (PROGER):
                    doWork(new Person.Proger());
                    break;
                default:
                    System.out.println("Incorrect data");
                    break;
            }
        }


    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            Person.User user = (Person.User) person;
            user.live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else {
            ((Person.Proger) person).enjoy();
        }
    }
}
