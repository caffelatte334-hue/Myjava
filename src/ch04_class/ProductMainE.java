package ch04_class;

public class ProductMainE {

    static void main(String[] args) {
        ProductE lee = new ProductE("홍길동",180,"대장군");
        lee.showus();

        ProductE kim = new ProductE("오막살","도둑");
        kim.showus();

        ProductE bang = new ProductE("방돌팔",175);
        bang.showus();

    }
}
