import java.util.HashMap;
import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        HashMap<String, String> userDetails = new HashMap<>();
        userDetails.put("Name", getUserDetails("Name"));
        userDetails.put("LastName", getUserDetails("LastName"));
        userDetails.put("Age", getUserDetails("Age"));
        userDetails.put("Height", getUserDetails("Height"));
        System.out.println(userDetails);
    }

    private static String getUserDetails(String key) {
        System.out.println("Please enter your "+key+" :");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }


}
