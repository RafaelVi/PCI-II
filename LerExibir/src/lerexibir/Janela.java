package lerexibir;

import static javax.swing.JOptionPane.*;

    public class Janela {
public static String nomeApp = ""; //final não pode ser alterada, é uma constante.
    
     public static String ler(Object mensagem){//metodo para exibir a mensagem e pegar um valor
        return  showInputDialog(null,//janela pai 
                mensagem,//MENSAGEM
                nomeApp,//titulo
                PLAIN_MESSAGE);
    }//ler
    
    public static double lerDouble(Object mensagem){
    return Double.parseDouble(ler(mensagem));
    }//lerdouble
   
    public static int lerInt(Object mensagem){
    return Integer.parseInt(ler(mensagem));
    }//lerInt    
    
    public static void exibir(Object mensagem){
   
        showMessageDialog(null,//janela pai 
                mensagem,//MENSAGEM
                nomeApp,//titulo
                PLAIN_MESSAGE);
    }//exibir
  
    
    }//class
