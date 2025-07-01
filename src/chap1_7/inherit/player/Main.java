package chap1_7.inherit.player;


public class Main {

    /*
                     Object
                        /
                       /
                     Player
                      /   \        \
                     /     \        \
                Warrior     Mage    Hunter
                    /
                   /
               Berserker
     */

    public static void main(String[] args) {
        Warrior warrior = new Warrior("주차왕파킹");
        Mage mage = new Mage("충격왕쇼킹");

        warrior.showStatus();
        warrior.attack();
        System.out.println("========");

        mage.showStatus();
        mage.attack();
    }



}
