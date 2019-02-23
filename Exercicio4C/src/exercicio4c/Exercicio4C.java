
package exercicio4c;

//import static lerexibir.Janela.*;
import static lerexibir.Console.*;
public class Exercicio4C {

   static final double NOTA_MINIMA = 5.0;
   static final String MENSAGEM_APROVADO = "APROVADO :)";
   static final String MENSAGEM_REPROVADO = "REPROVADO :(";
   
    public static void main(String[] args) {
        double nota1 = lerDouble("Digite a nota do 1°BIM");
        double nota2 = lerDouble("Digite a nota do 2°BIM");
        double nota3 = lerDouble("Digite a nota do 3°BIM");
        double nota4 = lerDouble("Digite a nota do 4°BIM");
        
        double media = (nota1 + nota2 + nota3 + nota4)/4; 
        
        exibir("Situação final : " + (media >= NOTA_MINIMA ? MENSAGEM_APROVADO : MENSAGEM_REPROVADO) 
                + "\n Média Final: " + media);
    }//main

}//class
