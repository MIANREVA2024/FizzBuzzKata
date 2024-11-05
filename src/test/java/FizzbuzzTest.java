import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.vir.Fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {
    @Test
    @DisplayName("Si el numero es divisible por 3")
    void test_WhenTheNumberIsDivisibleBy3_return(){

        //given
        Fizzbuzz objectOfFizzbuzz  = new Fizzbuzz();

        //When
        String result = objectOfFizzbuzz.checkNumber(9);

        //Then
        assertEquals( "Fizz" , result);
    }
    @Test
    @DisplayName("Si el numero es divisible por 5")
    void test_WhenTheNumberIsDivisibleBy5_return(){

        //given
        Fizzbuzz objectOfFizzbuzz  = new Fizzbuzz();

        //When
        String result = objectOfFizzbuzz.checkNumber(10);

        //Then
        assertEquals( "Buzz" , result);
    }
    @Test
    @DisplayName("Si el numero es divisible por 3 y 5")
    void test_WhenTheNumberIsDivisibleBy3and5_return(){

        //given
        Fizzbuzz objectOfFizzbuzz  = new Fizzbuzz();

        //When
        String result1 = objectOfFizzbuzz.checkNumber(9);
        String result2 = objectOfFizzbuzz.checkNumber(15);

        //Then
        assertEquals( "Fizz" , result1);
        assertEquals( "FizzBuzz" , result2);
    }


}
