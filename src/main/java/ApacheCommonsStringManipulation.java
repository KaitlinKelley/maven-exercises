import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ApacheCommonsStringManipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter something:");
        String userInput = sc.nextLine();
        if(StringUtils.isBlank(userInput)){
            System.out.println("That's just some blank space....bye....");
        }else {
            System.out.printf("You entered: \"%s\"\n", userInput);
            if (StringUtils.isNumericSpace(userInput)) {
                System.out.printf("\"%s\" is a number.\n", userInput);
            } else {
                System.out.printf("\"%s\" is not a number.\n", userInput);
            }
            System.out.println();
            System.out.println("Is it worth it...let me work it...put my thing down");
            System.out.println("Flip it: " + StringUtils.swapCase(userInput));
            System.out.println("and Reverse it: " + StringUtils.reverse(userInput));
        }
    }
}
