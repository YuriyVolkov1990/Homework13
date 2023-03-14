public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Имя " + this.name + " Возраст " + this.age;
    }

    public boolean isAdult() {
        return getAge() > 18;
            }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void increaseAge(int increment) {
        if (increment < 0) {
            throw new IllegalArgumentException("Инкремент не может быть меньше нуля");
        }
        this.age = age + increment;
    }
}
