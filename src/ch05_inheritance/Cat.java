package ch05_inheritance;

public class Cat extends Animal{
    boolean indoor ; // 애완묘, 길고양이

    @Override
    public void bark() {
        System.out.println(super.name + "(는/은) 야옹야옹");

    }

    @Override
    public void display() {
        super.display();

        if(indoor){
            System.out.println("타입 : 애완묘");

        }else{
            System.out.println("타입 : 길고양이");

        }
    }
}
