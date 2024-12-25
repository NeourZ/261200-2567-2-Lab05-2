public class Lab05 {
    public static void main(String[] args) {
        Admin john = new Admin("John", 1954, 12, 25);
        john.displayInfo();
        john.displayHappyBirthday();
        System.out.println();

        User nicolas = new User("Nicolas", 1964, 1, 7);
        nicolas.displayInfo();
        nicolas.displayHappyBirthday();
        System.out.println();

        john.displayInfo(true);
        System.out.println();
        john.displayInfo(false);
    }
}
