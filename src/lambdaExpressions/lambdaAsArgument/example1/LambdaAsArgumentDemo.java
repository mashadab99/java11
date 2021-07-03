package lambdaExpressions.lambdaAsArgument.example1;

public class LambdaAsArgumentDemo {

    /* This method takes two parameters
    First parameter is type of Functional Interface,
    so that it can accept an instance of that interface(StringFunc),
    including the instance created by lambda expression
    Second is type String,that specifies to operate on functional interface
     */
    static String stringOperation(StringFunc stringFunc, String string){
        return stringFunc.func(string);
    }

    public static void main(String[] args){

        String input="I Love Java";
        System.out.println("Here Input String is ::: "+input);

        //Here, a simple lambda expression that uppercase a string
        //passed to stringOperation

        String output = stringOperation(str -> str.toUpperCase() , input);

        System.out.println("The uppercase of input string is:: "+output);

        //Pass Block of Lambda that remove space

        String finalOutput = stringOperation(str -> {
            String result="";
            int i;
            for(i=0; i<str.length();i++){
                if(str.charAt(i) !=' '){
                    result +=str.charAt(i);
                }
            }
            return result;
        },input);

        System.out.println("After Removing space string is ::: "+finalOutput);

        StringFunc reverse = str -> {

            String result="";
            for(int i=str.length()-1;i >=0; i--){
                result += str.charAt(i);
            }
            return result;
        };

        // It is also possible to pass a instance created by earlier lambda expression
        String reverseOutput = stringOperation(reverse,input);

        System.out.println("Reverse of String is ::: "+reverseOutput);
    }
}
