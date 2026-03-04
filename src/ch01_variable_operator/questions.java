package ch01_variable_operator;

public class questions {
    static void main() {
        int a = 10 , b = 8 ;
        boolean bool1 = a!= b;
        System.out.println("bool1 :" + bool1);

        boolean bool2 = --a == b++;
        System.out.println("bool2 :" + bool2);

        boolean bool3 = a++ != --b;
        System.out.println("bool3 :" + bool3);

        boolean bool4 = bool3 && (5>7) ;
        System.out.println("bool4 :" + bool4);

        boolean bool5 = !bool4 || (bool1&&bool2);
        System.out.println("bool5 : " + bool5);








    }
}
