
package exercicio4b;
import static lerexibir.Janela.*;
//import static lerexibir.Console.*;
public class Exercicio4B {

    public static void main(String[] args) {
       int n = lerInt("Digite um numero:");
        if (n<0) {
            //n = n * -1
            //n*= -1;
            n = Math.abs(n);
        }
        exibir("O valor absoluto é :"+n);
    }
    
}
