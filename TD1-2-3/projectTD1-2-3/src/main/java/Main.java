public class Main {
    public static void main(String[] args) {
        dog medor = new dog("Médor", 50);
        dog milou = new dog("Milou", 5);

        for (int i = 0; i < 10; i++) {
            milou.run();
            milou.eat();
        }
    }
}
