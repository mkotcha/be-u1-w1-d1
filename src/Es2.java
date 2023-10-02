import java.util.Scanner;

public class Es2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = new String[3];
        System.out.println("inserisci tre stringhe");

        StringBuilder fwdStr = new StringBuilder();
        StringBuilder rwdStr = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            System.out.println("stringa " + (i + 1));
            str[i] = input.nextLine();
            fwdStr.append(str[i]);
        }

        System.out.println(fwdStr);

        for (int i = str.length; i > 0; i--) {
            rwdStr.append(str[i - 1]);
        }

        System.out.println(rwdStr);
        input.close();
    }

}
