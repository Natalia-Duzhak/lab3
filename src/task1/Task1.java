package task1;

public class Task1 {
    public static void main(final String[] args) {
        final Address address = new Address("L", "B", 12);
        final User user = new User("Natalochka", "D", 0, 808080803, 978979697,address);
        System.out.println(user);
    }
}
