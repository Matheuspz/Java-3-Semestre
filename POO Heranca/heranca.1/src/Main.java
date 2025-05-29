public class Main {
    public static void main(String[] args) {
        Soma a = new Soma();
        Subtracao b = new Subtracao();
        Multiplicacao c = new Multiplicacao();
        Divisao d = new Divisao();

        a.calcular(5,2);
        b.calcular(10,2);
        c.calcular(8,2);
        d.calcular(50,5);
    }
}
