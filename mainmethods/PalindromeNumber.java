
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
        boolean answer = solution.isPalindrome(101);
        System.out.println(answer);
    }
}