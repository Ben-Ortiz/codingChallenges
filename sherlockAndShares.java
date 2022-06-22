public class sherlockAndShares {
    /*
    Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value describing a range of integers. Sherlock must determine the number of square integers within that range, inclusive of the endpoints (note that a square integer is an integer which is the square of an integer,
    e.g. 1, 4, 9, 16, 25, 36, 49).
    
    For example, the range is a=24 and b=49, inclusive. There are three square integers in the range: 25, 36 and 49.
    
    Complete the squares function that returns an integer representing the number of square integers in the inclusive range from a to b.
    
    Examples
    squares(3, 9) ➞ 2
    squares(17, 24) ➞ 0
    squares(1, 1000000000) ➞ 31622
    
    Notes
    Your solution must solve each problem in 1 second or less.
     */
    public static void main(String[] args) {
        System.out.println(squares(3, 9));
        System.out.println(squares(17, 24));
        System.out.println(squares(1, 1000000000));
    }

    public static int squares(int a, int b) {
        double a1 = Math.floor(Math.sqrt(a));
        double b1 = Math.floor(Math.sqrt(b));
        
        if(Math.sqrt(a) % 1 == 0)
            a1--;
        return  (int)(b1-a1);
    }
}
