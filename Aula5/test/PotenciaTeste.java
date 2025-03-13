import org . junit . jupiter .api . Assertions;
import org . junit . jupiter .api . Test ;

public class PotenciaTeste {

    @Test
    public void potenciaPorZero(){
        long esperado = 1;
        long resposta = Main.potencia(2,0);
        Assertions.assertEquals(esperado
         ,resposta
         ,"Too munoo morreu");

    }

    @Test
    public void potenciaPorUM(){
        long esperado = 3;
        long resposta = Main.potencia(3,1);
        Assertions.assertEquals(esperado
                ,resposta
                ,"Too munoo morreu DENOVO");
    }

}
