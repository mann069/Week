// Program Name: BreakContinueExample

public class BreakContinueExample {

    public static void main(String[] args) {

        // For loop from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // Skip number 5
            if (i == 5) {
                continue;
            }

            // Stop loop at 9
            if (i == 9) {
                break;
            }

            // Print number
            System.out.println(i);

        }

    }
}

