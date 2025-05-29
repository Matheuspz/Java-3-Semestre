public class Main {
    public static void main(String[] args) {
        Ordenador o = new Ordenador();
        OrdenadorDecrescente b = new OrdenadorDecrescente();
        int[] arr = {5,2,3,1,7,4};
        int[] arrO = o.ordenar(arr);
        o.imprimir(arrO);
        int[] arrB = b.ordenar(arr);
        b.imprimir(arrB);

    }
}
