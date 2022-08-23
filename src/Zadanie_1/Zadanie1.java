package Zadanie_1;

// Zamiana pierwszej i ostatniej liczby w tablicy

public class Zadanie1 {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 3, 10};

        //wynik {10, 4, 6, 3, 2}
        //indexy   = [0 | 1 | 2 | 3 | 4]
        //wartości = [2 | 4 | 6 | 3 | 10]

        int lastIndex = numbers.length - 1;

        //sposób pierwszy
        //dodawanie wielu zmiennych (najprościej)

        int first = numbers[0];
        int last = numbers[lastIndex];

        numbers[0] = last;
        numbers[lastIndex] = first;

        //sposób drugi
        //użycie tylko jednej zmiennej

        int temp = numbers[0];
        numbers[0] = numbers[lastIndex];
        numbers[lastIndex] = temp;

        //sposób trzeci
        //brak użycia zmiennych

        numbers[0] = numbers[0] + numbers[lastIndex]; // 12 4 6 3 10
        numbers[lastIndex] = numbers[0] - numbers[lastIndex]; // 12 4 6 3 2
        numbers[0] = numbers[0] - numbers[lastIndex]; // 10 4 6 3 2

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
