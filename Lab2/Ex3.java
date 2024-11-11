package Lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter names (type 'end' to stop):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("end")) break;
            names.add(name);
        }

        Collections.sort(names);

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
