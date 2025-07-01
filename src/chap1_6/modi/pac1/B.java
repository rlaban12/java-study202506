package chap1_6.modi.pac1;

// A 클래스와 같은 패키지
public class B {

    B() {
        A a = new A();
        new A(100);
//        new A(5.5);

        a.f1 = 1;
        a.f2 = 20;
//        a.f3 = 30;

        a.m1();
        a.m2();
//        a.m3();

    }

}
