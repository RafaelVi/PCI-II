
package exercico4a;
import static lerexibir.Janela.*;
public class Exercico4A {

    public static void main(String[] args) {
        int a = lerInt("Digite um numero inteiro para A:");
        int b = lerInt("Digite um numero inteiro para B:");
        int diferenca = 0;
        
        if(a > b){
            diferenca = a - b;
        }
        if(b > a){
            diferenca = b - a;
        }
        if (a==b){
            diferenca = a - b;
            exibir("Pois numeros iguais né danado");
        }
                exibir("a diferença entra A e B é : " + diferenca);
    }
    
}
