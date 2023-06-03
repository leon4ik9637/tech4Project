package recursion;

public class _01_SumOfNumbers {
    /*
    Write recursive method to find sum of 1-n included
    method must be return type and static

    n = 5
    1 + 2 + 3 + 4 + 5 = 15
     */

    public static int sum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public static int recursiveSum(int n){
        if(n > 0) return n + recursiveSum(n - 1);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // 15
        System.out.println(sum(7)); // 28
        System.out.println(sum(-3)); // -5

        System.out.println(recursiveSum(-3));
    }


}
