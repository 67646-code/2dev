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
}