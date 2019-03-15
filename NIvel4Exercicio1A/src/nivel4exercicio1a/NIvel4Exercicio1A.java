
package nivel4exercicio1a;
import static lerexibir.Janela.*;

public class NIvel4Exercicio1A {

    public static void main(String[] args) {
        //Ler 10 nomes e exibir 10 nomes
        String nome00 = ler("Digite o primeiro nome");
        String nome01 = ler("Digite o segundo nome");
        String nome02 = ler("Digite o terceiro nome");
        String nome03 = ler("Digite o quarto nome");
        String nome04 = ler("Digite o quinto nome");
        String nome05 = ler("Digite o sexto nome");
        String nome06 = ler("Digite o setimo nome");
        String nome07 = ler("Digite o oitavo nome");
        String nome08 = ler("Digite o nono nome");
        String nome09 = ler("Digite o decimo nome");
        
        String auxiliar = 
                "A lista de convidados da sua festa é : \n"+
                nome00 + "\n" +
                nome01 + "\n" +
                nome02 + "\n" +
                nome03 + "\n" +
                nome04 + "\n" +
                nome05 + "\n" +
                nome06 + "\n" +
                nome07 + "\n" +
                nome08 + "\n" +
                nome09 + "\n" ;
        exibir(auxiliar);
    }
    
}
