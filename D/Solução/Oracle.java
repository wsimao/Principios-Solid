package D.Solução;

public class Oracle implements Repositorio{

    @Override
    public void inserir(String texto){
        System.out.printf("Estou inserindo este texto[%s] no banco ORACLE.%n",texto);
    }
    
}
