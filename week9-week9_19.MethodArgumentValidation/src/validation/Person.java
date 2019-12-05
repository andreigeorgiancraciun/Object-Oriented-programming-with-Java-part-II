package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if( age < 0 || age > 120){
            throw new IllegalArgumentException("Age out of range");
        }
        if( name == null || name.isEmpty() || name.length() > 40){
            throw new IllegalArgumentException("Name incorect");
        }
        
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
