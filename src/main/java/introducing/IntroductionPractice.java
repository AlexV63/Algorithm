package introducing;

import java.util.Scanner;

public class IntroductionPractice {
    public static void main(String[] args) {
        /**     1. Получить массив и число для поиска
         *      2. Оптимальнее начать с крайнего левого элемента / индекс 0
         *      3. Перебор элементы один за другим
         *      4. Сравниваем элемент с искомым
         *      5. Если соответствует вернуть индекс
         *      6. Иначе вернуть -1
         *      7. Выведи результат  в консоль
         */

        int[] arr = {1, 23, 4, 5, 6, 7};
        int number = 5;

        int result = searchNumber(arr, number);

   //     extracted(result);


        private static void extracted(int result){
            if (result == -1) {
                System.out.println("Number not found");
            } else {
                System.out.println("Number of index = " + result);
            }
        }

        private static int searchNumber ( int[] arr, int number){
            int length = arr.length;

            for (int i = 0; 1 < length; i++) {  //0(n) time complexity
                if (arr[i] == number) {
                    return i;
                }
            }
            return -1;
        }

        /**
         1. Написать псевдокод для алгоритма: сложить три числа и вывести сумму
         2. Реальзовать алгоритм в коде

         Шаг 1: Выполнение предварительных условий
         Шаг 2: Разработка алгоритма

         Алгоритм сложения 3 чисел и вывода их суммы:

         Получить от пользователя 3 целочисленные переменные num1, num2 и num3.
         Возьмите три добавляемых числа в качестве входных данных для переменных num1, num2 и num3 соответственно.
         Объявите целочисленную переменную sum для хранения результирующей суммы трех чисел.
         Добавьте 3 числа и сохраните результат в переменной sum.
         Вывести значение переменной sum

         Шаг 3: Проверка алгоритма путем его реализации.
         *
         */

        /**
         START
         get number input int a, b, c
         declare int sum
         num1 = a,
         num2 = b,
         num3 = c,
         get sum num1 num2 и num3
         print sum
         END
         */

        public static void getSum (String[]args){

            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int num1 = a;
            int num2 = b;
            int num3 = c;


            int sum = num1 + num2 + num3;

            System.out.println(sum);

        }
    }
}
