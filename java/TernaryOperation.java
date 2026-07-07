public class TernaryOperation {

    // ternary operator ? = Return 1 of 2 values if a condition is true

    // variable = (condition) ? ifTrue : ifFalse;

    public static void main(String[] args){
        int score = 55;
        String PassOrFail = (score >= 65) ? "PASS" : "FAIL";
        System.out.println(PassOrFail);
    }
}
