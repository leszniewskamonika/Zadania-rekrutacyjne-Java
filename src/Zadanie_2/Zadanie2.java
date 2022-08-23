package Zadanie_2;

// Dodawanie liczb całkowitych do siebie 1+2+3+....+n (ciąg arytmetyczny)

public class Zadanie2 {

    public static void main(String[] args){
        int n = 100;

        //Big
        //BigInteger

        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Suma liczb sposób 1 to "+sum);

        // 1+2+3+.....+7+8+9+10
        // 1 10
        // 2 9
        // 3 8
        // 4 7
        // 5 6

        //Należy obsłużyć sytację przekroczenia maksylanej dopuczszalnej wartości w integer

        if(n %  2 == 0){
            sum = (n / 2)*(n + 1);

        } else {
            sum = (n + 1)/ 2 * n;
        }

        System.out.println("Suma liczb sposób 2 to "+sum);
    }
}
