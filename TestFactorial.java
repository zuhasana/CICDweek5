public class TestFactorial {

    public static void main(String[] args) {

        int n = 5;

        
        int givenAnswer = 120;

        
        int correctAnswer = Factorial.calculate(n);

        if (givenAnswer == correctAnswer) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAIL");
        }
    }
}

