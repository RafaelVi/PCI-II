
package nivel4exercicio1a;
import java.util.ArrayList;
import static lerexibir.Janela.*;

public class Nivel04Exercicio1A_ArrayList {

    public static void main(String[] args) {
        //ler e exibir 10 nomes
        ArrayList<String> nomes = new ArrayList<>();
        for (int indice = 0; indice < 10; indice++) {
           nomes.add(   ler("Digite o "+(indice + 1) + "° nome por favor."));

        }
         String auxiliar = 
                "OS NOMES DA SUA FESTAO SÃO: \n";
         for (String umElementoDaLista : nomes) {
            auxiliar += umElementoDaLista + "\n";
        }
         exibir(auxiliar);
    }
    
}
