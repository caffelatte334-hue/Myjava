package ch04_class;

public class VolleyBallPlayer01 {
    static void main(String[] args) {

        VolleyBall01 kim = new VolleyBall01() ;

        kim.name = "김연경";
        kim.uniformNumber = 10;
        kim.position = "Outside Hitter";
        kim.blocks = 5.3;

        System.out.println("배구선수");
        System.out.println("이름 :" + kim.name);
        System.out.println("등번호 :" + kim.uniformNumber);
        System.out.println("포지션 :" + kim.position);
        System.out.println("평균블록수 :" + kim.blocks);


        String str = kim.showData();
        System.out.println(str);

        kim.Emperor();


    }
}
