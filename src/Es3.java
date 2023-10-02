import java.util.Scanner;

public class Es3 {
    public static double perimeter(double l, double m) {
        return (l * 2) + (m * 2);
    }

    public static int evenOdd(int x) {
        if (x % 2 == 0) return 0;
        else return 1;
    }

    public static double triangleArea(double l, double m, double n) {
        double p = l + m;
        return Math.sqrt(p) * (p - l) * (p - m) * (p - n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l, m, i, j, k;
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
        input.close();
    }

}
