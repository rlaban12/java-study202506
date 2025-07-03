package chap1_10.inter;

// 추상적
public interface Pet {

    // 인터페이스는 필드를 가질 수 없습니다.
    // 따라서 필드를 하위 클래스에게 상속시키고 싶으면 추상클래스를 써야함.
    String abc = "dasdfas"; // 상수 처리

    // 애완동물의 필수 기능
    // 노는 기능
    void handle();
    // 예방접종 기능
    boolean inject();
    // 난폭한 행동을 하는 기능
    void violent();

    // 뒤늦게 이미 구현이 많은 상태에서 새 메서드를 추가할 때는 강요하지 말자 -> 인터페이스에서만 가능
    default void eat() {}

    // static는 가능
    static void aaa() {}

}
