package loops.nestedLoops;

public class UnderstandingNestedLoops {
    public static void main(String[] args) {
        /*
        Nested loops
        Outer loop: prints numbers from 1 to 5
        1
            1
            2
            3
        2
            1
            2
            3
        3
            1
            2
            3
        4
            1
            2
            3
        5
            1
            2
            3
        for(int i = 1; i <= 5; i++){
            System.out.println(i);

            for(int j = 1; j <= 3; j++){
            System.out.println("\t" + j);
            }
        }
         */
//        for(int i = 1; i <= 3; i++){
//            System.out.println(i);
//
//            for(int j = 5; j >= 3; j--){
//                System.out.println("\t" + j);
//            }
//        }
        for(int i = 1; i <= 3; i++){
            System.out.println(i);
            for(int j = 5; j >= 3; j--){
                System.out.println("\t" + j);
            }
        }

    }
}
