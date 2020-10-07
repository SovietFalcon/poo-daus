import java.util.Scanner;

public class JocDaus {

    public static void iniciar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quants cops vols tirar els daus?");

        int tiradas = scanner.nextInt();
        int ganadas = 0;
        int perdidas = 0;

        Dau dado1 = new Dau(1);
        Dau dado2 = new Dau(2);
        Dau dado3 = new Dau(1);

        for (int i = 0; i < tiradas; i++) {
            dado1.tirar();
            dado2.tirar();
            dado3.tirar();

            if (dado1.getValor() == dado2.getValor() && dado2.getValor() == dado3.getValor()) {
                ganadas++;
            } else {
                perdidas++;
            }

        }

        System.out.println("Has guanyat " + ganadas + " vegades.");
        System.out.println("Has perdut " + perdidas + " vegades.");

    }

}