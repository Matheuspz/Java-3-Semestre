public class Main {

    public static void main(String[] args) {
        // Não existe solução em reais
        equacao2grau(10,1,1);
        // Existe solução em reais, x1 = 2, x2 = 3
        equacao2grau(1,-5,6);
        // Existe solução em reais, x1 = x2 = -1
        equacao2grau(2,4,2);
    }

    public static void equacao2grau(double a, double b, double c) {
        double delta = Math.pow(b,2) - 4 * a * c;
        if(delta < 0) {
            System.out.println("Não há soluções Reais");
            return;
        }
        delta = Math.sqrt(delta);
        double divisao = 2.0 * a;
        double x1 = -b + delta;
        x1 = x1 / divisao;
        double x2 = -b - delta;
        x2 = x2 / divisao;
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }

    public static long potencia(long base ,long potencia) {
        if (potencia == 0) {
            return 1;
        }
        long x = base;
        for (int i = 1; i < potencia; i++) {
            x *= base;
        }
        return x;
    }

}
