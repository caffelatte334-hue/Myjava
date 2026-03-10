package ch04_class;

public class ProductE {

    String name;
    int height ;
    String profession = "백수";

  public ProductE(String name,int height,String profession){
      this.name = name;
      this.height = height;
      this.profession = profession;

  }

  public ProductE(String name, String profession){
     this.name = name;
     this.profession = profession;

  }

    public ProductE(String name, int height) {
     this.name  = name;
     this.height = height;

    }

    public void showus() {

        System.out.println("이름 :" + name);
        System.out.println("키 :" + height);
        System.out.println("직업 :" + profession);
    }
}
