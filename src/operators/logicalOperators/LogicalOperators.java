package operators.logicalOperators;

public class LogicalOperators {
    public static void main(String[] args){

        /*
        There are 2 logical operators:
        - AND Operator
        - OR Operator
        AND (&, &&) --> If there is only one false, the rest is false, no matter what
        OR (|, ||) --> If the is ONLY ONE TRUE, the rest is true no matter what
        - single ones are checking everything and double ones are not checking
        the rest once they find what they are looking for

        AND Operator:
        - condition 1 & condition 2

        Ex 1: OR Operator
        send me "javaHomework" OR "interviewQuestions"
        javaHomework | interviewQuestions --> result
        false           false             --> false
        true            true              --> true
        false           true              --> true
        true            true              --> true
        Ex. 2: AND Operator
        send me "javaHomework" AND "interviewQuestions"
        javaHomework | interviewQuestions --> result
        false           false             --> false
        true            true              --> false
        false           true              --> false
        true            true              --> true

         */


        boolean isInterviewQuestionsSent = true;
        boolean isJavaHomeworkSent = true;

        // Send me interviewQuestions OR JavaHomework
        System.out.println("The student is okay: " +
                (isInterviewQuestionsSent || isJavaHomeworkSent));
        // if there is a single TRUE for OR it is TRUE


        //Send me InterviewQuestions AND JavaHomework
        System.out.println("The student is okay: " +
                (isInterviewQuestionsSent && isJavaHomeworkSent));
        // if there is a single FALSE for AND it is FALSE

        System.out.println("\nThe student did NOT send the homework " + !isInterviewQuestionsSent);














    }
}
