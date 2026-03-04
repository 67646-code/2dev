import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyDateTest {
    @Test
    void isLenient_false_when_not_multiple_of_4() {
         MyDate date = new MyDate(1,1,2003);
         assertFalse( date.isLenient() );
    }

    @Test
    void isLenient_true_when_multiple_of_4_but_not_100() {
         MyDate date = new MyDate(1,1,1900);
         assertFalse( date.isLenient() );
    }
}