package chap1_5.member;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

//        Member m1 = new Member(30, "abc1234@gmail.com", "1234", "말포이", Gender.MALE);
//
//        System.out.println(m1);

        // 클래스 안에 있는 데이터는 반드시 객체 생성을 통해 접근함.
        MemberRepository mr = new MemberRepository();
        System.out.println(Arrays.toString(mr.getMembers()));

        // 맴버 추가 테스트
        mr.addMember(new Member(80, "oldman@gmail.com", "9888", "할아버지", Gender.MALE));


        System.out.println(Arrays.toString(mr.getMembers()));
        System.out.println(mr.size());

        System.out.println("=====================");

        Member foundMeber = mr.findMemberByEmail("oldman@gmail.com");
        System.out.println("found member: " + foundMeber);

        System.out.println("=======================");
        boolean flag = mr.isDuplicateEmail("oldman@gmail.com");
        System.out.println("flag: " + flag);

    }
}
