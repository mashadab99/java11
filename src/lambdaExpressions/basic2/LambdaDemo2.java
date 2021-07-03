package lambdaExpressions.basic2;

public class LambdaDemo2 {
    public static void main(String[] args){
        NumericTest numericTest;

        //A lambda expression to test if a number is even
        numericTest = (number) -> (number%2) == 0;

        System.out.println("10 is even "+numericTest.test(10));

        System.out.println("9 is even "+numericTest.test(9));

        //A lambda expression to test if a number is non negative
        numericTest = (number) -> number >=0;

        System.out.println("10 is non negative "+numericTest.test(10));

        System.out.println("-1 is non negative "+numericTest.test(-1));
    }
}
