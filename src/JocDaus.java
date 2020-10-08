import java.util.Scanner;

public class JocDaus {


    private int totalPartidas;
    private int totalGanadas;
    private int totalPerdidas;

    private Dau dado1;
    private Dau dado2;
    private Dau dado3;


    public int getTotalPartidas() {
        return totalPartidas;
    }

    public void setTotalPartidas(int totalPartidas) {
        this.totalPartidas = totalPartidas;
    }

    public int getTotalGanadas() {
        return totalGanadas;
    }

    public void setTotalGanadas(int totalGanadas) {
        this.totalGanadas = totalGanadas;
    }

    public int getTotalPerdidas() {
        return totalPerdidas;
    }

    public void setTotalPerdidas(int totalPerdidas) {
        this.totalPerdidas = totalPerdidas;
    }

    public JocDaus() {
        dado1 = new Dau(1);
        dado2 = new Dau(2);
        dado3 = new Dau(3);
    }

    public void jugar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quants cops vols tirar els daus?");

        int tiradas = scanner.nextInt();
        int ganadas = 0;
        int perdidas = 0;


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

        setTotalPartidas(getTotalPartidas()+tiradas);
        setTotalGanadas(getTotalGanadas()+ganadas);
        setTotalPerdidas(getTotalPerdidas()+perdidas);






        System.out.println("Has guanyat " + ganadas + " vegades.");
        System.out.println("Has perdut " + perdidas + " vegades.");
        System.out.println("Partides aquesta ronda: " + tiradas);
        System.out.println("Partides totals: " + getTotalPartidas());

    }

}