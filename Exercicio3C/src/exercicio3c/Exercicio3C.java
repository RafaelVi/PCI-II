
package exercicio3c;
import static lerexibir.Console.*;
public class Exercicio3C {

    public static void main(String[] args) {
        double raio = lerDouble("Digite o valor do raio:");
        double altura = lerDouble("Digite o valor da altura:");
        double volume = 3.14159 * Math.pow(raio, 2) * altura;
        exibir("O volume da lata é " + volume + "cm3");
    }
    
}
