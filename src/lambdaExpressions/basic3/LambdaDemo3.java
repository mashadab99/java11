package lambdaExpressions.basic3;

public class LambdaDemo3 {
    public static void main(String[] args){

        NumericTest2 numericTest2;

        numericTest2 = (int number1,int number2) -> (number1 % number2) == 0;


        System.out.println("2 is a factor of 10 "+ numericTest2.test(10,2));

        System.out.println("3 is a factor of 10 "+ numericTest2.test(10,3));

    }
}
