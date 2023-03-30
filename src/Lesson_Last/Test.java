package Lesson_Last;

public class Test {
    public static void main(String[] args) {
//        counter(3);
//        System.out.println(fac(5));
        System.out.println(sum(10));
    }


    //counter(3) --> sout(3) -> counter(n- 1) --> sout(2) and .... if(n == 0)return;
//    private static void counter(int n) {
//        if(n == 0)
//            return;
//        System.out.println(n);
//
//        counter(n-1);//3,2,1

//
//    }
//    fac(4)
//    4  * 6 = 24
//    3 * 2 = 6
//    2 * 1
//    fac(1) = return 1;

//    private static int fac(int n) {
//        if (n == 1)
//            return 1;
//
//        int i = n * fac(n - 1);
//        System.out.println(i);
//        return i;
//
//
//    }
    public static int sum(int n ){
        if(n == 1) return 1;
        return n + sum(n - 1);
    }
}
