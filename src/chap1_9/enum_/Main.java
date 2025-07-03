package chap1_9.enum_;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza();

        pizza.orderPizza();
        pizza.readyPizza();
        pizza.deliverPizza();

        // 현재 주문 상태
        System.out.println("주문 상태: " + pizza.getStatus());

        // 선생님 코드 따라 쳤는데 오류나서 주석
        //System.out.println("소요 시간: " + pizza.getTimeToSetup());

    }
}
