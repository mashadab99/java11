package lambdaExpressions.genericFunctionalInterface.example1;

public class GenericFunctionInterfaceDemo {
    public static void main(String[] args){

        //Use String based version of SomeFunc
        SomeFunc<String> stringSomeFunc = (str) ->{
            String result="";
            int i;
            for(i=str.length()-1; i >=0; i--){
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Reverse of String India is : "+stringSomeFunc.func("India"));

        //Use a Integer based version of SomeFunc

        SomeFunc<Integer> integerSomeFunc= (number) -> {
            int value=1;
            for(int i=1; i<=number;i++){
                value = value * i;
            }
            return value;
        };

        System.out.println("Factorial of 3 is "+ integerSomeFunc.func(3));
    }
}
