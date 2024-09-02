import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L; // For version control

    private String name;
    private transient int age; // transient fields are not serialized

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
