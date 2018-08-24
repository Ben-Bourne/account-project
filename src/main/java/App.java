public class App {
    public static void main(String[] args) {
        AccountServices manager = new AccountServices();
        manager.addAccount("Tony", "Glover");
        manager.addAccount("Sebastian", "Delaney");
        System.out.println(manager.viewAccount(1));
        System.out.println(manager.convertToJSON());
    }
}