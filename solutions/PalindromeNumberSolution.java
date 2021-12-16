import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * overthought this, didn't need to use a queue or a stack, was a much simpler way of reversing x
 * Runtime: 21 ms, faster than 12.53% of Java online submissions for Palindrome Number.
 * Memory Usage: 45.6 MB, less than 5.39% of Java online submissions for Palindrome Number.
 */
public class PalindromeNumberSolution {

    public boolean isPalindrome(int x) {
        if(x>2147483647) return false;
        if(x<0) return false;
        if(x<10) return true;
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        int remainder = x;
        do {
            int what = remainder/10;
            q.add(remainder%10);
            s.push(remainder%10);
            remainder = remainder/10;
        } while(remainder > 0);
        do {
            int y = q.remove();
            int z = s.pop();
            if(y!=z) return false;
        } while(!q.isEmpty());
        return true;
    }
}
