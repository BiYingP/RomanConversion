import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
//        String input = "";

        while (true) {
            try {

                System.out.println("Choose Options:");
                System.out.println("1): Integer to Roman");
                System.out.println("2): Roman to Integer");
//                input = kb.next();
//                int option = Integer.parseInt(input);
                int option = kb.nextInt();

                if (option == 1) {
                    System.out.println("Enter a number: ");
                    IntToRoman i = new IntToRoman();
                    int n = kb.nextInt();
//        int n = 123;
                    System.out.println(i.intToRoman(n));

                }
                if (option == 2){
                    System.out.println("Enter a roman number:");
                    RomanToInteger r = new RomanToInteger();
                    String s = kb.next();
//            String s = "CXXIII";
                    System.out.println(r.RomanToInteger(s));
                }
            }
            catch (Exception e){
                System.out.println("Invalid Input!");
                System.exit(0);
            }
        }
    }
}
