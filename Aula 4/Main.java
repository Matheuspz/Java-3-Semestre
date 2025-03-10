public class Main {
    public static int metodo(int x) {
        return(2*x);
    }
    public static String metodo2(String x) {
        return("\u001b[31m"+x);
    }
    public static int metodo3(int x, int y) {
        if (y==0) {return(1);}
        int a = x;
        for (int i = 1; i<y; i++) {
            a = a * x;
        }
        return (a);
    }
    public static int metodo4(int x) {
        if(x==0) { return(0); }
        else if(x==1 || x==2) { return(1); }
        else {
            return metodo4(x-1) + metodo4(x-2);
        }
    }
    public static double metodo5(int x) {
        return(3.1415 * (x*x));
    }
    public static boolean metodo6(int a,int b, int c) {
        int valor = ((b*b) -4 * a * c);
        return valor >= 0;
    }
    public static void metodo7(int x,int y) {
        if(x < y) { System.out.println(x); }
        else { System.out.println(y); }
    }
    public static boolean metodo8(int n) {
        if(n <= 0) { return(false); }

        for(int i = 2; i < n; i++) {
           if (n%i == 0) { return(false); }
        }
        return(true);
    }

    public static void main(String[] args) {
        int a = 2;
        System.out.println(metodo(a));
        System.out.println(metodo2("Hello")); System.out.print("\u001B[0m");
        System.out.println(metodo3(5,0));
        System.out.println(metodo4(8));
        System.out.println(metodo5(10));
        System.out.println(metodo6(5,10,2));
        metodo7(10,5);
        System.out.println(metodo8(12));
    }
}