package chap1_9.final_;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("김철수", "991122-1234567");
        st1.name = "김철수";
//        st1.ssn = "991122-1234556";

        Student st2 = new Student("박영희", "940123-1234567");

        System.out.println("st1 = " + st1);
        System.out.println("st2 = " + st2);


    }
}
