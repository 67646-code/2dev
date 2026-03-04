public class Dog {
    String name;
    int weight;
    boolean hungry = false;
    boolean injured = false;
    int randomx;

    Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.hungry = isHungry();
    }

    boolean isHungry() {
        return this.hungry;
    }

    void run() {
        if (isHungry()) {
            throw new IllegalStateException(this.name + " a faim !");
        }
        else if (injured){
            throw new IllegalStateException(" on fait pas courir un chien blessé");
        }
        else {
            System.out.println(this.name + " court comme un fou !");
            this.hungry = true;
            randomx = (int)(Math.random() * 5);
            if (randomx == 3){
                this.injured = true;
            }
        }
    }

    void eat() {
        if (this.hungry == true) {
            this.hungry = false;
        } else {
            throw new IllegalStateException(this.name + " n'a pas faim.");
        }
    }

    void bark() {
        if (this.weight > 30) {
            System.out.println(this.name + " a dit : WOOOUF !");
        } else if (this.weight < 10) {
            System.out.println(this.name + " a dit : yip yip !");
        } else {
            System.out.println(this.name + " a dit : Wouf !");
        }
    }

    void multipleBarks(int x) {
        if (0 > x) {
            throw new IllegalArgumentException(this.name + " ne peux pas aboyer à l'envers !!!");
        } else {
            for (int i = 0; i < x; i++) {
                this.bark();
            }
        }
    }
    String sound() {
        if (this.weight < 10) {
             return "Yip yip";
             }
        else if (this.weight <= 30) {
             return "Wouf";
             }
        else {
             return "WOUUUF";
             }
    }
}
