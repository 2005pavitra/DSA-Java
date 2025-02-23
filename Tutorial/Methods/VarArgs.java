package Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(3,4,22,4,57,8,8,45,53);

    }
    static void fun(int ...v){
        System.out.println(v.length);
        System.out.println(Arrays.toString(v));
    }
}
