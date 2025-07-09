package chap2_8.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

    public static void main(String[] args) {
        // 육류 요리 중 칼로리가 낮은 순으로 정렬하기
        List<Dish> lowCalorieMeats = Menu.menuList.stream()
                .filter(m -> m.getType() == DishType.MEAT)
                .sorted(Comparator.comparing(Dish::getCalories))
                .collect(Collectors.toList());


        lowCalorieMeats.forEach(System.out::println);

        System.out.println("========================");

        // 메뉴들을 이름 내림차로 정렬 (zyx순)
        List<Dish> menuNameDESC = Menu.menuList.stream()
                .sorted(Comparator.comparing(Dish::getName).reversed())
                .collect(Collectors.toList());

        menuNameDESC.forEach(System.out::println);

        System.out.println("========================");

        // 300 칼로리 이상인 요리 중 칼로리가 낮은 탑3 요리를 필터링
        Menu.menuList.stream()
                .filter(m -> m.getCalories() >= 300)
                .sorted(Comparator.comparing(dish -> dish.getCalories()))
                .limit(3)
                .forEach(x -> System.out.println(x));

    }


}
