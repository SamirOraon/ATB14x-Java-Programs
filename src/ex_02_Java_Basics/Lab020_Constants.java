package ex_02_Java_Basics;

public class Lab020_Constants {
    public static void main(String[] args) {

        int a = 10;
            a = 11;
        System.out.println();

        final int b = 99;

//                  b =100; // java: cannot assign a value to final variable b

        final float PI = 3.14f;
        final int   a1 = 10;
        System.out.println(PI);
        System.out.println(a1);
        System.out.println(b);
        System.out.println(a);
    }

}
