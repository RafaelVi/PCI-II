package nivel05;
import static lerexibir.Janela.*;
import nivel05.telas.*;
public class Executavel {
    public static void main(String[] args) {
//        Contato jao = new Contato();
//        jao.nome = "Jão";
//        jao.endereco = "Rua XY";
//        jao.telefone = "(11) 1234-4567";
//        
//        Contato luana = new Contato();
//        luana.nome = "Luana";
//        luana.endereco = "Rua XY";
//        luana.telefone = "(11) 1234-4567";
//        
//        Contato rafael = new Contato();
//        rafael.nome = "Rafael";
//        rafael.endereco = "Rua Arace";
//        rafael.telefone = "(11) 2036-8411";
//        
//        Contato felipe = new Contato();
//        felipe.nome = "Felipe";
//        felipe.endereco = "Rua Kim Jun";
//        felipe.telefone = "(11) 3333-5656";
//
//        Contato amanda = new Contato();
//        amanda.nome = "Amanda";
//        amanda.endereco = "Rua Bahia";
//        amanda.telefone = "(11) 6564-1584";
//       
//        Contato marcelo = new Contato();
//        marcelo.nome = "Marcelo";
//        marcelo.endereco = "Rua Spindola";
//        marcelo.telefone = "(11) 2345-7863";
//       
//        Contatos agenda = new Contatos();
//        agenda.adicionar(luana);
//        agenda.adicionar(jao);
//        agenda.adicionar(amanda);
//        agenda.adicionar(rafael);
//        agenda.adicionar(felipe);
//        agenda.adicionar(marcelo);
//        
//        
//        exibir(agenda);

            Contatos contatos = new Contatos();
            Abertura abertura = new Abertura();
            abertura.setVisible(true);
            CriarContato criarContato = new CriarContato();
            
            abertura.proximaJanela= criarContato;
            criarContato.janelaAnteiror = abertura;
    }//método main
    
}//class
