
class PalindromeNumber {

    /**
     * #9
     * Given an integer x, return true if x is palindrome integer.
     * An integer is a palindrome when it reads the same backward as forward.
     * For example, 121 is a palindrome while 123 is not.
     *
     * @param args
     */
    public static void main(String[] args) {
        PalindromeNumberSolution solution = new PalindromeNumberSolution();
        for(int i=-100 ; i< 100 ; i++) {
            //boolean answer = solution.isPalindrome(i);
            //System.out.println(i + " " + answer);
        }
        boolean answer = solution.isPalindrome(1221);
        System.out.println(1221 + " " + answer);
        answer = solution.isPalindrome(56765);
        System.out.println(56765 + " " + answer);
        answer = solution.isPalindrome(212898212);
        System.out.println(212898212 + " " + answer);

    }
}