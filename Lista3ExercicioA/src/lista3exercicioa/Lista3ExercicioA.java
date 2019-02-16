package lista3exercicioa;
import static lista3exercicioa.LerExibir.*;
public class Lista3ExercicioA {

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
     
    exibir((graus == Double.MAX_VALUE ?"[ERRO]" : "Da " + graus +" graus"));
    
    
        
    }//main
    
   
    
}//class
