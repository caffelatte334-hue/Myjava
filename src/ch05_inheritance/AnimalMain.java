package ch05_inheritance;

public class AnimalMain {
    static void main(String[] args) {

        //클래스 이름 객체 이름 = new 생성자이름();
        Dog retriver = new Dog();
        retriver.name = "김리트리버";
        retriver.age = 2;
        retriver.feed = "건식 사료";
        retriver.guide = false;



        retriver.display();
        retriver.eat();
        retriver.bark();

        System.out.println("객체 정보");
        System.out.println(retriver.toString());

        Dog maltese = new Dog();
        maltese.name = "이말티즈";
        maltese.age = 7;
        maltese.feed = "습식 사료";
        maltese.guide = true;

        maltese.display();
        maltese.eat();
        maltese.bark();
        //고양이 : 페르시안(persian), 샴(siamese)

        Cat persian = new Cat();
        persian.name = "야옹이";
        persian.age = 500;
        persian.indoor = false;


        persian.display();
        persian.bark();

        Cat siamese = new Cat();
        siamese.name = "최샴";
        siamese.age = 3;
        siamese.indoor = true;


        siamese.display();
        siamese.bark();

    }
}
