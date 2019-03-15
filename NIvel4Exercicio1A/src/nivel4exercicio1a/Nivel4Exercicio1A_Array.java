
package nivel4exercicio1a;
import static lerexibir.Janela.*;
public class Nivel4Exercicio1A_Array {

    public static void main(String[] args) {
        String[] nomes= new String[10];
        nomes[0] = ler("Digite o 1° nome por favor.");
        nomes[1] = ler("Digite o 2° nome por favor.");
        nomes[2] = ler("Digite o 3° nome por favor.");
        nomes[3] = ler("Digite o 4° nome por favor.");
        nomes[4] = ler("Digite o 5° nome por favor.");
        nomes[5] = ler("Digite o 6° nome por favor.");
        nomes[6] = ler("Digite o 7° nome por favor.");
        nomes[7] = ler("Digite o 8° nome por favor.");
        nomes[8] = ler("Digite o 9° nome por favor.");
        nomes[9] = ler("Digite o 10° nome por favor.");
        String auxiliar = 
                "A lista de convidados da sua festa é : \n";
        for (int indice = 0; indice < nomes.length; indice++) {
            auxiliar += nomes[indice] + "\n";
        }
        exibir(auxiliar);
    }
    
}
