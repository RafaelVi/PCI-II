package nivel05;
import java.util.*;

public class ListadeContatos {
    //Atributos de Classe/Instância
    private ArrayList<Contato> contatos = new ArrayList<>();
    
    
    //Métodos/Ações
    public void adicionar(Contato novoContato){
        contatos.add(novoContato);
    }
    
    public void remover(Contato contatoParaRemover){
        contatos.remove(contatoParaRemover);
    }
    
    public void remover(int indiceContatoParaRemover){
        contatos.remove(indiceContatoParaRemover);
    }
    
    public Contato get(int indiceContatoProcurado){
        return contatos.get(indiceContatoProcurado);
    }
    
    public int length(){
        return contatos.size();
    }
    
    public boolean existeContato(Contato contatoProcurado){
        for (Contato contatoAtual : contatos) {
            if (contatoAtual.equals(contatoProcurado)) {
                return true;
            }
        }
        return false;
    }
    
    public Contato pesquisaPorNome(String nome){
        Contato aux = new Contato();
        for (int cont = 0; cont < contatos.size(); cont++) {
            aux=get(cont);
            if (aux.nome.equalsIgnoreCase(nome)) {
                return aux;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        String listaContatos = "Contatos{\n";
        for (int indice = 0; indice < length(); indice++) {
            listaContatos = listaContatos + 
                    "  [" + indice + "]: " 
                        + get(indice).nome + " | "
                        + get(indice).endereco + " | "
                        + get(indice).telefone + "\n"
            ;
        }
        listaContatos = listaContatos + "}";
        return listaContatos;
    }
    
}
