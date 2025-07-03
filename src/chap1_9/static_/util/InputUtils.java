package chap1_9.static_.util;

import java.util.Scanner;
// 선생님 설명 놓침
public class InputUtils {

    private static Scanner sc = new Scanner(System.in);

    // 입력을 받아서 메세지출력과 함께 입력값을 리턴하는 메서드
    public static String prompt(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static int promptInt(String message) {
        while(true) {
            try{

            } catch (NumberFormatException e) {

            }
        }
    }

}
