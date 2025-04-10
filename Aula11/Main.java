import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Candidato candidato1 = new Candidato();
        candidato1.numero = 1;
        candidato1.nome = "Jorge";
        candidato1.votos = 0;

        Candidato candidato2 = new Candidato();
        candidato2.numero = 2;
        candidato2.nome = "Guilherme";
        candidato2.votos = 0;

        Candidato candidato3 = new Candidato();
        candidato3.numero = 3;
        candidato3.nome = "Thiago";
        candidato3.votos = 0;

        Candidato candidatoNulo = new Candidato();
        candidatoNulo.votos = 0;


        for (int i = 0; i < 10; i++) {
            System.out.print("Insira seu Voto: ");
            int voto = leitor.nextInt();
            switch (voto){
                case 1:
                    candidato1.votacao();
                    break;
                case 2:
                    candidato2.votacao();
                    break;
                case 3:
                    candidato3.votacao();
                    break;
                default:
                    candidatoNulo.votacao();
            }
        }

        candidato1.imprimir();
        candidato2.imprimir();
        candidato3.imprimir();
        System.out.println("--------------");
        if (candidato1.votos > candidato2.votos & candidato1.votos > candidato3.votos) {
            System.out.println("O Vencedor da Eleição é: "+candidato1.nome);
            System.out.println("Quantidade de Votos Nulos: "+candidatoNulo.votos);
        } else if (candidato2.votos > candidato1.votos & candidato2.votos > candidato3.votos) {
            System.out.println("O Vencedor da Eleição é: "+candidato2.nome);
            System.out.println("Quantidade de Votos Nulos: "+candidatoNulo.votos);
        } else if (candidato3.votos > candidato2.votos & candidato3.votos > candidato1.votos) {
            System.out.println("O Vencedor da Eleição é: "+candidato3.nome);
            System.out.println("Quantidade de Votos Nulos: "+candidatoNulo.votos);
        } else {
            System.out.println("Não houve nenhum vencedor por conta de um empate");
            System.out.println("Quantidade de Votos Nulos: "+candidatoNulo.votos);
        }

    }
}