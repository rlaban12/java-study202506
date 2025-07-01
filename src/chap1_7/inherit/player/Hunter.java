package chap1_7.inherit.player;
// 선생님 설명 놓침
public class Hunter extends Player {

    int concentrate; // 집중 게이지

    public Hunter(String nickName) {
        super(nickName, 60);
        this.concentrate = 100;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# 집중: " + this.concentrate);
    }

    void MultiArrow() {

    }

}
