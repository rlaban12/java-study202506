package chap1_8.poly.drive;

public class Driver {

    String name;

    public void Driver(String name) {
        this.name = name;
    }

    public void drive(Sonata car) {
        System.out.printf("%s님이 운전을 시작합니다ㅣ.\n", this.name);
        car.accelerate();
    }

}
