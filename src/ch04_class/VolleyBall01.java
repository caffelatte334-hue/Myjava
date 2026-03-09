package ch04_class;

public class VolleyBall01 {

    String name;
    int uniformNumber;
    String position;
    double blocks;

    // 이름 : 김연경, 등번호 : 10번, 포지션 : outsideHitter, 평균블록수:5.3
    String showData() {
        String result = "이름 : " + name + " 등번호 : " + uniformNumber + "번  포지션 : " + position + " 평균블록수 :" + blocks;
        return result;



    }

    void Emperor(){

        System.out.println("이름 :" + name);
        System.out.print("등번호 :" + uniformNumber);

        System.out.print("포지션 :" + position);

        System.out.print("평균블록수 :" + blocks);

    }
}

