package ch03_array;

import java.util.Scanner;

public class StudentExam {

    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("이름 입력 :");
        String name = scan.nextLine();


        int total = 0;
        double average = 0.0;
        int [] num = new int[3];
        //int total = 0;
        //double average = 0.0;
        for (int i = 0; i < num.length; i++) {
            System.out.println("점수 입력 :");
            num[i] = scan.nextInt();
            total += num[i];

        }

        average = (double) total/num.length;

        System.out.println("이름 : " + name);
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + average);




    }

}
