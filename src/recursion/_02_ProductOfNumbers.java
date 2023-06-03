package recursion;

public class _02_ProductOfNumbers {
    /*
    recursive method taking int n return from 1 to n product
     */

    public static int product(int n){
        int product = 1;
        for(int i = 1; i <= n; i++){
            product *= i;
        }
        return product;
    }
    public static int recursionProduct(int n){
        if(n > 1) return n * recursionProduct(n - 1);
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(recursionProduct(-2)); // 0
        System.out.println(recursionProduct(0)); // з
        System.out.println(recursionProduct(2)); // 2
        System.out.println(recursionProduct(4)); // 24
        System.out.println(recursionProduct(5)); // 120
    }
}
