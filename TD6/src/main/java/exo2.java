public class exo2 {
    public static boolean isPalindrome(int[] tab) {
        for (int i = 0; i < tab.length / 2; i++) {
            if (tab[i] != tab[tab.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] hello = {1,2,3,4,3,2,1};
        System.out.println(isPalindrome(hello));
    }
}
