package person_employee;

import java.util.*;

public class Person {

    Scanner sc = new Scanner(System.in);

    // declare
    protected int personId;
    protected String personName;
    protected String personEmail;

    // contructor
    public Person() {

    }
    public Person(int personId, String personName, String personEmail) {
        this.personId = personId;
        this.personName = personName;
        this.personEmail = personEmail;
    }

    // setter and getter
    public int getPersonId() {
        return personId;
    }
    public void setPersonId(int personId) {
        this.personId = personId;
    }
    public String getPersonName() {
        return personName;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    public String getPersonEmail() {
        return personEmail;
    }
    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    // display
    public void displayInformation() {
        System.out.println("ID: " + personId);
        System.out.println("Name: " + personName);
        System.out.println("Email: " + personEmail);
    }

    // input
    public void inputInformation() {
        System.out.println("Fill your information!");

        System.out.println("ID?");
        personId = sc.nextInt();
        sc.nextLine();

        System.out.println("Name?");
        personName = sc.nextLine();

        System.out.println("Email?");
        personEmail = sc.nextLine();
    }

    
}
