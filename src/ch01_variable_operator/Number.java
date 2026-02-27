package ch01_variable_operator;

public class Number {
    static void main() {
        // 이름 언어 평균
        // 변수 연산자
        String name ;
        double kor ;
        double eng ;
        double average ;

        name = "홍길동" ;
        kor = 40.0 ;
        eng = 43.5 ;
        average = (kor + eng ) / 2.0 ;

        System.out.println("이름 :" + name );
        System.out.println("국어 :" + kor );
        System.out.println("영어 :" + eng );
        System.out.println("평균 :" + average );


    }
}
