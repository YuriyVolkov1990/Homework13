public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah", 30);
        if (personService.isAdult(sarah)) {

        }
        if (sarah.isAdult()) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }
        System.out.println(sarah);
        sarah.increaseAge(-30);
    }
}