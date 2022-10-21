public class FizzBuzz {

    public String[] fizzBuzz (int start, int end) {
        if (start <= end) {
            String[] result = new String[end - start + 1];

            int number = start;

            for (int i = 0; i < result.length && number <= end; i++) {
                if (number % 15 == 0) {
                    result[i] = "FizzBuzz";
                } else if (number % 3 == 0) {
                    result[i] = "Fizz";
                } else if (number % 5 == 0) {
                    result[i] = "Buzz";
                } else {
                    result[i] = Integer.toString(number);
                }
                number++;
            }

            return result;
        }

        return new String[0];
    }
}
