public class Main {
    public static void main(String[] args) {
        Person sarah = new Person("Sarah", 30);
        if (sarah.getAge() > 18) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }
    }
}