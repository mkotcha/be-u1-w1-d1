import java.util.Scanner;

public class Es3 {
    public static Double perimeter(Double l, Double m) {
        return (l * 2) + (m * 2);
    }

    public static int evenOdd(int x) {
        if (x % 2 == 0) return 0;
        else return 1;
    }

    public static Double triangleArea(Double l, double m, double n) {
        Double p = l + m;
        return Math.sqrt(p) * (p - l) * (p - m) * (p - n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double l, m, i, j, k;
        int n;
        System.out.println("inserisci i 2 lati del rettangolo");
        l = input.nextDouble();
        m = input.nextDouble();
        System.out.println("il perimetro è " + perimeter(l, m));

        System.out.println("inserisci un numero...");
        n = input.nextInt();
        if (evenOdd(n) == 0) System.out.println(n + " è pari");
        else System.out.println(n + " è dispari");

        System.out.println("inserisci i 3 lati del triangolo");
        i = input.nextDouble();
        j = input.nextDouble();
        k = input.nextDouble();
        System.out.println("l'area del triengolo è  " + triangleArea(i, j, k));
    }

}
