public class OperatorExample10{
    public static void main(String[] args){
        int a = 10;
        int b=5;
        int c=20;
        System.out.println(a<b&&a++<c);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a<b&a++<c);//false && true = false
        System.out.println(a);//11 because second condition is checked

        //Ternary Operator
        int min = (a>b)?a:b;
        System.out.println(min);
    }}


//AND = If First condition is FALSE, second condition will not be checked;

//OR = If First condition is TRUE, second condition will not be checked;