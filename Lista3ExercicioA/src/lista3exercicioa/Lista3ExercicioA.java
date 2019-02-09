package lista3exercicioa;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
public class Lista3ExercicioA {
static final String NOME_APP = "CONVERTER 5000"; //final não pode ser alterada, é uma constante.
    public static void main(String[] args) {
    int opcao = lerInt(
                        "Qual opção você deseja de conversão?\n"+
                        "1- Celsius para Fahrenheit\n"+
                        "2- Fahrenheit para Celsius\n"
                        );
     double graus=lerDouble("Digita a temperatura que você quer vei");
     
     switch(opcao){
         case 1:
             graus = (9 * graus + 160)/5;
             break;
         case 2:
             graus =  ((graus - 32) * 5) / 9;
             break;
         default:
             graus = Double.MAX_VALUE;
             
     }
     
    exibir((graus == Double.MAX_VALUE ?"[ERRO]" : "" + graus));
    
    
        
    }//main
    
    public static String ler(Object mensagem){//metodo para exibir a mensagem e pegar um valor
        return  showInputDialog(
                null,//janela pai 
                mensagem,//MENSAGEM
                NOME_APP,//titulo
                JOptionPane.PLAIN_MESSAGE);
    }//ler
    
    public static double lerDouble(Object mensagem){
    return Double.parseDouble(ler(mensagem));
    }//lerdouble
   
    public static int lerInt(Object mensagem){
    return Integer.parseInt(ler(mensagem));
    }//lerInt    
    
    public static void exibir(Object mensagem){
   
        showMessageDialog(
                null,//janela pai 
                mensagem,//MENSAGEM
                NOME_APP,//titulo
                JOptionPane.PLAIN_MESSAGE);
    }
    
}//class
