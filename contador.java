public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public int getValor() {
        return valor;
    }

    public void incrementar() {
        valor++;
    }

    public void decrementar() {
        if (valor > 0) {
            valor--;
        } else {
            System.out.println("Não é possível decrementar mais, o contador já está em zero.");
        }
    }

    public void zerar() {
        valor = 0;
    }
}
