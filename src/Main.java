public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer("BITCODE-69034", true);

        User u1 = new User("Divya", printer);
        User u2 = new User("Sakshi", printer);
        User u3 = new User("Snehal", printer);

        u1.start();
        u2.start();
        u3.start();

    }
}
