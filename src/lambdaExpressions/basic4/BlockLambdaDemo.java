package lambdaExpressions.basic4;

public class BlockLambdaDemo {

    public static void main(String[] args){
        NumericFunction numericFunction;

        //Block lambda to compute factorial
        numericFunction = (int number) -> {
            int result=1;

            for (int i=1; i<=number;i++){
                result = result * i;
            }
            return result;
        };

        System.out.println("The factorial of 3 is "+ numericFunction.func(3));
        System.out.println("The factorial of 5 is "+ numericFunction.func(5));
    }
}
