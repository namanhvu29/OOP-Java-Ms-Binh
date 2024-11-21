public abstract class Person {

    // Attribute
    String name;
    int age;
    char gender;

    // Constructor
    public Person() {
        name = "";
        age = 0;
        gender = 'M';
    }
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Setter and Getter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    // Method toString
    public String toString() {
        return "Name:" + name + "\nAge:" + age + "\nGender:" + gender;
    }

    public abstract void input();

}