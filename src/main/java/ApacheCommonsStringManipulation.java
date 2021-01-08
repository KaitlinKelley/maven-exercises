import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ApacheCommonsStringManipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter something:");
        String userInput = sc.nextLine();
        System.out.printf("You entered: \"%s\"\n", userInput);
        if(StringUtils.isNumeric(userInput)){
            System.out.printf("\"%s\" is a number.\n", userInput);
        }else{
            System.out.printf("\"%s\" is not a number.\n", userInput);
        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }
}
