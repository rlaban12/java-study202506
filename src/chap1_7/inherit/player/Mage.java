package chap1_7.inherit.player;

// 패키지 내 클래스 모두 선생님 설명 놓쳤으니 선생님 코드 확인해보기
public class Mage extends Player {

    int mana;

    public Mage(String nickName) {
        super(nickName, 40);
        this.mana = 100;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# 마력: " + this.mana);
    }

    void fireBall() {
        System.out.printf("%s님이 파이어볼을 시전합니다.\n", this.nickName);
    }

}
