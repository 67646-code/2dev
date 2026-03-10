
    public class Ex1 {
    public static void fibonacci(int n) {
        int n1 = 1;
        int n2 = 1;
        for(int i=2; i<=n; i++) {
            int n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }
            System.out.println(n2);
    }

        public static void main(String[] args) {
            fibonacci(20);
            }
}

