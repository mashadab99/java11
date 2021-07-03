package lambdaExpressions.basic1;

public class LambdaDemo {
    public static void main(String[] args){
        //declare an interface reference
        MyNumber myNumber;

        /* Here, the lambda expression is simply a constant expression
             When it is assigned to myNumber,
             a class instance is constructed
             in which the lambda expression
             implements the getValue() method in MyNumber
        */

        myNumber = ()->123.45;

        // Call getValue(), which is provided by the previous assigned lambda expression.

        System.out.println("A fixed value: "+myNumber.getValue());

        // Here, a more complex expression is used.
        myNumber = ()->Math.random()*12;

        // Call getValue(), which is provided by the previous assigned lambda expression.
        System.out.println("A Random value: "+myNumber.getValue());

        // Call getValue(), which is provided by the previous assigned lambda expression.
        System.out.println("Another Random value: "+myNumber.getValue());

        /*A lambda expression must be compatible with the method
        defined by the functional interface.
        Therefore this wont work
        COMPILE TIME ERROR:-
        java: incompatible types: bad return type in lambda expression
        java.lang.String cannot be converted to double
         */

        //myNumber = ()->"Test";
    }
}
