public class Main {
    public static void main(String[] args) {
        // Помилка 1: Синтаксична помилка
        int x = 5;
        System.out.println("Значення x: " + x)

        // Помилка 2: Невідомий символ
        int y = 10;
        int sum = x + y;
        System.out.println("Сума: " + sum);

        // Помилка 3: Помилка виконання
        int a = 0;
        int b = 10;
        int division = b / a;
        System.out.println("Результат ділення: " + division);

        // Помилка 4: Відсутність обробки винятків
        int[] numbers = {1, 2, 3};
        System.out.println("Елемент за індексом 3: " + numbers[3]);
    }
}
