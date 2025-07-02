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

    /*
        파이어을 맞은 플레이어의 직업이 전사이면 50 데이지를 입혀라
        마법사이면 60 데이지
        사냥꾼이면 40의 데미지를 입혀주세요.

        만약 전사가 파이어볼을 맞으면 해당 전사는 그 파이어볼 시전자에게
        돌진(dash)를 시전해야 합니다.
     */

    //
    

}
