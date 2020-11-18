import java.util.*;

public class RomanToInteger {
    public int RomanToInteger(String s){
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        char[] c = s.toCharArray();
        int total = roman.get(c[s.length()-1]);
        for (int i = 0; i < s.length()-1; i++){
            if (roman.get(c[i]) < roman.get(c[i+1])){
                System.out.print(roman.get(c[i]));
                total -= roman.get(c[i]);
            }
            else{
                total += roman.get(c[i]);
            }
        }


        return total;
    }
}
