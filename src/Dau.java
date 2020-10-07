import java.util.Random;

public class Dau {

    private int valor;

    Random dados1 = new Random();

    public void tirar() {
        valor = dados1.nextInt(6)+1;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Dau(int valor) {
        this.valor = valor;
    }


    

}
