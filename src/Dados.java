import java.util.Random;
import java.util.Scanner;

public class Dados {

    public static void dados() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quants cops vols tirar els daus?");

        int tiradas = scanner.nextInt();
        int[] resultados = new int[11];

        Random dados = new Random();

        for (int i = 0; i < tiradas; i++) {
            int dado1 = dados.nextInt(6)+1;
            int dado2 = dados.nextInt(6)+1;
            int res = dado1+dado2;

            //sum
            resultados[dado1+dado2-2]++;
        }

        for (int i = 0; i < 11; i++) {
            System.out.println(i+2 + " : " + resultados[i]);
        }

    }

}
