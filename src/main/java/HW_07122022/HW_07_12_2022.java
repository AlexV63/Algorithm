package HW_07122022;

public class HW_07_12_2022 {
    public static void main(String[] args) {


//        public int binarySearch(int[] arr, int key){
//            int left = 0;
//            int right = arr.length - 1;
// //           int middle = arr.length/2;
//
//            while (left <= right) {
//                int middle = (left + right) / 2;
//                int current = arr[middle];
//                if (current == key) {
//                    return current;
//                } else if (key < middle) {
//                    left = middle + 1;
//                } else {
//                    right = middle + 1;
//                }
//                return -1;
//            }
//
//
//        }
//        System.out.println(binarySearch([]));
//    }
    }

    static boolean getElement() {
        int[] arr = {1, 4, 7, 9, 12, 15};
        boolean res = false;
        int k = 9;
        int midlIdx = arr.length / 2;
        if (arr[midlIdx - 1] == k)
            res = true;
        else if ((arr[midlIdx - 1] < k) && (res != true)) {
            for (int i = midlIdx - 1; i < arr.length; i++)
                if (arr[i] == k)
                    res = true;
        } else {
            for (int i = 0; i < midlIdx - 1; i++) {
                if (arr[i] == k)
                    res = true;
            }
        }
        return res;
    }
}

// Решение к заданию 2

// Первое кольцо переместить с левого стержня на средний стержень
// Второе кольцо переместить на правый стержень
// Первое кольцо переместить правый стержень
// Третье кольцо переместить на средний стержень
// Первое кольцо на левый стержень
// Второе кольцо на средний стержень
// Первое кольцо на средний стержень
// Четвертое кольцо на правый стержень
// и так далее





/**
 * First level: 1) Реализовать алгоритм бинарного поиска, который находит данный key в данном отстортированном массиве
 * public int binarySearch(int[] arr, int key)
 * Описание алгоритма из лекции
 *     binary search
 *     problem: find key in sorted array
 *     returns index of key
 *     arr = [1,4,7,9,12,15], key = 9
 *     take element from the middle 7
 *     compare to key 7 == 9 false
 *     compare to key 7 < 9
 *     if middle element less than key repeat procedure for right half of array
 *     if middle element more  than key repeat procedure for left half of arr
 *
 * 2)
 * Задача заключается в следующем. Имеется три стержня — левый, средний и правый. На левом стержне находятся n дисков,
 * диаметры которых различны. Диски упорядочены по размеру диаметра, сверху лежит наименьший, снизу — наибольший. Т
 * ребуется перенести диски с левого стержня на правый, используя средний стержень как вспомогательный.
 * Головоломка имеет следующие два правила:
 *       1. Вы не можете поместить больший диск на меньший диск.
 *       2. За один раз можно перемещать только один диск.
 *
 * Задача  - придумать и описать алгоритм. Можно текстом, можно псевдокодом.
 *
 * Задача со звёздочкой
 * Нужно реализовать  метод moveRing(firstPole, secondPole, thirdPole, numOfRings) .
 *
 * Параметры firstPole, secondPole, thirdPole - стеки, которые представляют  стержни. Числа внутри - диски, диаметр диска - число
 * Например, стек firstPole = [3,2,1] содержит три диска диаметром 3 - в самом внизу, 2 - в середине, 1 - на самом верху.
 * numOfRings - количество колец, которые нужно передвинуть.
 */