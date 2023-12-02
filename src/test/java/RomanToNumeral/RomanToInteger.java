package RomanToNumeral;

import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = sc.nextLine().toUpperCase();

        int result = convertInteger(romanNumeral);
        System.out.println("Integer representation: " + result);
    }

    private static int convertInteger(String romanNumeral) {
        int result = 0;

        for (int i = 0; i < romanNumeral.length(); i++) {
            char currentChar = romanNumeral.charAt(i);

            // Check the value of the current Roman numeral character
            switch (currentChar) {
                case 'I':
                    result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default:
                    System.out.println("Invalid Roman numeral character: " + currentChar);
                    return -1; // Return -1 for invalid input
            }

            // Handle subtraction cases (e.g., IV = 4, IX = 9)
            if (i > 0) {
                char prevChar = romanNumeral.charAt(i - 1);
                if ((currentChar == 'V' || currentChar == 'X') && prevChar == 'I') {
                    result -= 2;
                } else if ((currentChar == 'L' || currentChar == 'C') && prevChar == 'X') {
                    result -= 20;
                } else if ((currentChar == 'D' || currentChar == 'M') && prevChar == 'C') {
                    result -= 200;
                }
            }
        }

        return result;
   
	}

}
