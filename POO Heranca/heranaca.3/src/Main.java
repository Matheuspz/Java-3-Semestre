public class Main {
    public static void main(String[] args) {
        Livro a = new Livro("Bolonhesa",5.23,"Thago",3,true);
        Camisa b = new Camisa("Caminha",7.22,"Preto","3xG","Poliester");

        a.exibirInfo();
        System.out.println(" ");
        b.exibirInfo();
    }
}
