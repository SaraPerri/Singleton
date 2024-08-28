public class Main {
    public static void main(String[] args) {
        User user1 = new User("Sara", 27);
        user1.stampaInformazioni();

        User user2 = new User("Marco", 31);
        user2.setNome("Leo");
        user2.setEtà(30);
        user2.stampaInformazioni();
    }
}