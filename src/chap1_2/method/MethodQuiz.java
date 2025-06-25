package chap1_2.method;

/* 내가 푼것
public class MethodQuiz {
    static String[] foods = {"떡볶이", "치킨", "파스타"};

    public static void main(String[] args) {

        printFoods();

        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        pop();
        remove("치킨");
        remove(0);
        printFoods();
////
////
        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);
//
        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);
//
//        insert(1, "파인애플");
//
        printFoods();
//
//        modify(2, "닭갈비");
//        printFoods();

    } // end main

    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    static void push(String newFood) {
        foods = Arrays.copyOf(foods, foods.length + 1);
        foods[foods.length - 1] = newFood;
    }

    static int indexOf(String food) {

        boolean flag = false;
        int index = 0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(food)) {
                flag = true;
                index = i;
            }
        }

        if (flag) {
            return index;
        } else {
            return -1;
        }
    }

    static void pop() {
        // pop: 맨 끝 데이터를 지우면서 가져옴
        // 0. 지워질 데이터를 백업
        String delTarget = foods[foods.length - 1];

        // 1. 기존 사이즈보다 1개 작은 배열 생성
        String[] temp = new String[foods.length - 1];

        // 2. 새 배열의 맨 끝 데이터만 빼고 복사
        for (int i = 0; i < temp.length; i++) {
            temp[i] = foods[i];
        }

        // 3. 주소값 이전
        foods = temp;
        temp = null;

    }

    static void remove(String food) {

        int targetIndex = indexOf(food);

        for (int i = targetIndex; i < foods.length - 1; i++) {
            foods[i] = foods[i + 1];
        }

        String[] temp = new String[foods.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = foods[i];
        }
        foods = temp;
    }

    static void remove(int targetIndex) {
        for (int i = targetIndex; i < foods.length - 1; i++) {
            foods[i] = foods[i + 1];
        }

        String[] temp = new String[foods.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = foods[i];
        }
        foods = temp;
    }

    static boolean include(String food) {
        boolean flag = false;
        for (int i = 0; i < foods.length; i++) {
            if(foods[i].equals(food)) {
                flag = true;
            }
        }

        return flag;

    }



}
*/

// 선생님 해설=====================================================

import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"떡볶이", "치킨", "파스타"};

    public static void main(String[] args) {

        printFoods();

        push("라면");
        push("김치찌개");
        push("짬뽕", "닭강정");
        printFoods();


        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        pop();
        remove("치킨");
        remove(0);
        printFoods();


        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(1, "파인애플");

        printFoods();

        modify(2, "닭갈비");
        printFoods();
    } // end main

    static boolean isOutOfBounds(int index) {
        System.out.println("인덱스의 범위가 잘못되었습니다.");
        return index < 0 || index >= foods.length;
    }

    static void modify(int index, String item) {
        if (isOutOfBounds(index)) return;
        foods[index] = item;
    }

    static void insert(int index, String item) {
        if (isOutOfBounds(index)) return;
        String[] temp = copy(1);
        for (int i = foods.length; i > index; i--) {
            temp[i] = temp[i - 1];
        }
        temp[index] = item;
        foods = temp;
    }

    static String pop() {
        if (foods.length == 0) {
            System.out.println("제거할 대상이 없습니다.");
            return null;
        }
        String deleted = foods[foods.length - 1];

        foods = copy(-1);
        return deleted;
    }

    static int indexOf(String item) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    static String[] copy(int capacity) {
        String[] tempArray = new String[foods.length + capacity];

        // 루프 회전수는 사이즈를 늘릴 때는 원본만큼
        // 줄였을 때는 줄인 만큼 회전
        int loopCount = (capacity >= 0) ? foods.length : tempArray.length;
        for (int i = 0; i < loopCount; i++) {
            tempArray[i] = foods[i];
        }
        return tempArray;
    }

    static void push(String... items) {
        // 1. 사이즈가 1개 더 큰 배열을 생성
        // 2. 원본 내용을 복사
        String[] temp = copy(items.length);

        // 3. 배열에 맨 끝에 데이터 추가
        for (int i = 0; i < items.length; i++) {
            temp[temp.length - (items.length - i)] = items[i];
        }
        // 4. 주소값 이전
        foods = temp;
    }

    // 배열 저장값으로 찾아서 삭제
    static void remove(String targetItem) {

        if (!include(targetItem)) return;

        for (int i = indexOf(targetItem); i < foods.length - 1; i++) {
            foods[i] = foods[i + 1];
        }
        pop();
    }

    // 오버로딩 : 같은이름의 메서드를 계속만드는 행위
    static void remove(int targetIndex) {
        if (isOutOfBounds(targetIndex)) return;
        remove(foods[targetIndex]);
    }

    static boolean include(String item) {
        return indexOf(item) != -1;
    }

}

