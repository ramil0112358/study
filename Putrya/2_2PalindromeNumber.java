public class PalindromeNumber {
    public boolean isPalindrome(int x){
        StringBuilder result = new StringBuilder();
        int divisible = Math.abs(x);
        if(divisible % 2 == 0) return false;
        else {
            while (divisible > 0) {
                int modulo = divisible % 10;
                result.append(modulo);
                divisible /= 10;
            }
        } return Math.abs(x) == Integer.parseInt(result.toString());
    }
}


