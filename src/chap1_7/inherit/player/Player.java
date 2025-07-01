package chap1_7.inherit.player;

// 상속을 위해 공통 속성과 공통 기능을 가진 부모 클래스 (Super class)
public class Player extends Object {

    String nickName;
    int level;
    int hp;
    int exp;

//    Player() {}

    public Player(String nickName, int hp) {
        this.nickName = nickName;
        this.level = 1;
        this.hp = hp;
    }


    void attack() {
        System.out.printf("%s님이 공격 합니다. \n", this.nickName);
    }

    public void showStatus() {
        System.out.println("\n ===== 닉네임: ======");
        System.out.println("# 닉네임: " + this.nickName);
        System.out.println("# 레벨: " + this.level);
        System.out.println("# 체력: " + this.hp);
        System.out.println("# 경험치: " + this.exp);
    }

}
