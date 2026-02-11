public class Main {
    public static void main(String[] args){
        Contact moi = new Contact("Albert", "Einstein", "rue d'Ailleurs", 12345);
        Contact unAutre = new Contact("Mahatma", "Gandhi", "rue d'Autre Part", 54321);
        Phonebook annuaire = new Phonebook();
        annuaire.add(moi);
        annuaire.add(unAutre);
        annuaire.add(new Contact("Nelson", "Mendela", "Avenue l'eau de là", 123321));
        annuaire.display();

    }
   /* public static void main(String[] args) {
        dog medor = new dog("Médor", 50);
        dog milou = new dog("Milou", 5);

        for (int i = 0; i < 10; i++) {
            milou.run();
            milou.eat();
        }
    }*/
}
