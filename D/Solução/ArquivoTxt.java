package D.Solução;

public class ArquivoTxt implements Repositorio {

    @Override
    public void inserir(String texto){
        System.out.printf("Estou inserindo este texto[%s] no arquivo 'banco.txt'.%n",texto);
    }
    
}
