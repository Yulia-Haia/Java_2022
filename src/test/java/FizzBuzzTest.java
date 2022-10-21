import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    // 1. Positive testing Happy path    // каждое условие должно быть протестировано юнит-тестами (в пирамиде тестов их 80%)
    // if (start <= end)
    // return result;
    @Test


    // start < end
    public void testStartLessThanEnd_HappyPath() {
        // AAA

        // arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        //act
        // на других потоках создавали дополнительную переменную помимо act - actual result
        //сначала нужно создать объект класса↓ чтобы от него вызвать тестируемый метод
        //FizzBuzz fizzBuzz = new FizzBuzz();   // но будем делать короче, поэтому не будем создавать объект отдельно↓

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //start = end
    @Test
    public void testStartEqualsEnd_HappyPath() {
        // arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};
        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //assert
        Assert.assertEquals(actualResult, expectedResult);

    }

   //@Ignore //чтобы тест не запускался
    @Test
    //start = end
    public void testStartLessThanEnd_StartEndAreNegative_HappyPath() {
        // arrange
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13", "Fizz", "-11",
                "Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1"};
        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //assert
        Assert.assertEquals(actualResult, expectedResult);

    }
    // 2. Negative testing
    // if (start > end)
    // return new String[0];

    @Test
    public void testStartGreaterThanEnd_NegativePath() {
        // arrange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};
        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //assert
        Assert.assertEquals(actualResult, expectedResult);

    }
}
