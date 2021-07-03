package lambdaExpressions.example1;

public class LambdaDemoWithourLambda implements MyNumber{
    public static void main(String[] args){
        LambdaDemoWithourLambda lambdaDemoWithourLambda=new LambdaDemoWithourLambda();
        System.out.println("A fixed value: "+lambdaDemoWithourLambda.getValue());
    }

    @Override
    public double getValue() {
        return 123.45;
    }
}
