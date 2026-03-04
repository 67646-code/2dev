import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    @Test
    void sound_weight_9_is_small() {
        Dog dog = new Dog("chien", 9);
        assertEquals("Yip yip", dog.sound());
    }


    @Test
    void sound_weight_10_is_medium() {
        Dog dog = new Dog("chien", 10);
        assertEquals("Wouf", dog.sound());
    }

    @Test
    void sound_weight_11_is_medium() {
        Dog dog = new Dog("chien", 11);
        assertEquals("Wouf", dog.sound());
    }

    @Test
    void sound_weight_29_is_medium() {
        Dog dog = new Dog("chien", 29);
        assertEquals("Wouf", dog.sound());
    }

    @Test
    void sound_weight_30_is_medium() {
        Dog dog = new Dog("chien", 30);
        assertEquals("Wouf", dog.sound());
    }

    @Test
    void sound_weight_31_is_big() {
        Dog dog = new Dog("chien", 31);
        assertEquals("WOUUUF", dog.sound());
    }
    @Test
    void new_dog_not_injured(){
        Dog dog = new Dog("chien",10);
        assertFalse(dog.injured);
    }
    @Test
    void run_after_run_is_hungry(){
        Dog dog = new Dog("chien", 10);
        dog.run();
        assertTrue(dog.isHungry());
    }
    @Test
    void eat_not_hungry_anymore(){
        Dog dog = new Dog("chien",10);
        dog.run();
        dog.eat();
        assertFalse(dog.isHungry());
    }
    @Test
    void run_when_hungry_does_not_run_ISE(){
        Dog dog = new Dog("chien",10);
        dog.run();
        assertThrows(IllegalStateException.class, () -> dog.run());
    }
    @Test
 void isWeightBetween_nb1_before_nb2_and_weigth_is_inside() {
         Dog dog = new Dog("chien", 10);
         assertTrue(dog.isWeightBetween(4,24));
         }

         @Test
 void isWeightBetween_nb1_before_nb2_and_weigth_is_below() {
         Dog dog = new Dog("chien", 12);
         assertFalse(dog.isWeightBetween(13,24));
         }

         @Test
 void isWeightBetween_nb1_before_nb2_and_weigth_is_above() {
         Dog dog = new Dog("chien", 25);
         assertFalse(dog.isWeightBetween(13,24));
         }

         @Test
 void isWeightBetween_nb1_before_nb2_and_weigth_is_nb1() {
         Dog dog = new Dog("chien", 13);
         assertTrue(dog.isWeightBetween(13,24));
         }

         @Test
 void isWeightBetween_nb1_before_nb2_and_weigth_is_nb2() {
         Dog dog = new Dog("chien", 24);
         assertTrue(dog.isWeightBetween(13,24));
         }

         @Test
 void isWeightBetween_nb1_after_nb2_and_weigth_is_inside() {
         Dog dog = new Dog("chien", 30);
         assertTrue(dog.isWeightBetween(42,24));
         }

         @Test
 void isWeightBetween_nb1_after_nb2_and_weigth_is_below() {
         Dog dog = new Dog("chien", 23);
         assertFalse(dog.isWeightBetween(33,24));
         }
    @Test
 void isWeightBetween_nb1_after_nb2_and_weigth_is_above() {
         Dog dog = new Dog("chien", 34);
         assertFalse(dog.isWeightBetween(33,24));
         }

         @Test
 void isWeightBetween_nb1_after_nb2_and_weigth_is_nb1() {
         Dog dog = new Dog("chien", 33);
         assertTrue(dog.isWeightBetween(33,24));
         }

         @Test
 void isWeightBetween_nb1_after_nb2_and_weigth_is_nb2() {
         Dog dog = new Dog("chien", 24);
         assertTrue(dog.isWeightBetween(33,24));
         }
}