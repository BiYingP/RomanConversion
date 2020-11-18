public class IntToRoman {
    public String intToRoman(int n){
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX","V", "IV", "I"};
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuffer s = new StringBuffer();
        for (int i = 0; i < nums.length; i++){
            while( n >= nums[i]){
                s.append(roman[i]);
                n -= nums[i];
            }
        }
        return s.toString();
    }
}
