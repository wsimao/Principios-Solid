package D.Solução;

public class MySql implements Repositorio{

    @Override
    public void inserir(String texto){
        System.out.printf("Estou inserindo este texto[%s] no banco MYSQL.%n",texto);
    }
    
}
