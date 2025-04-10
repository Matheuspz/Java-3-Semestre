public class Candidato {
    String nome;
    int numero;

    int votos;

    public int votacao() {
        return votos++;
    }
    public void imprimir() {
        System.out.println("--------------");
        System.out.println("Candidato: "+nome);
        System.out.println("Numero: "+numero);
        System.out.println("Quantidade de Votos: "+votos);
    }


}
