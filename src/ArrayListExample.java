import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<String>();
        studentNames.add("John");
        studentNames.add("Jane");
        studentNames.add("Bob");
        studentNames.add("Mary");
        studentNames.add("Jack");
        System.out.println("Student Names: " + studentNames);
        for (String name : studentNames) {
            System.out.println(name);
        }
        studentNames.remove("John");
        System.out.println("ArrayList after removing John: " + studentNames);
        Collections.sort(studentNames);
        System.out.println("ArrayList after sorting: " + studentNames);


    }
}
