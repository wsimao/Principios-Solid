package S.Solução;


import S.Violação.ExecucaoViolacao;

public class App {
    public static void main(String[] args) {
        System.out.println("############### VIOLAÇÃO ############### ");
        ExecucaoViolacao.execute();
        System.out.println("############### VIOLAÇÃO ############### ");

        System.out.println("");

        System.out.println("############### SOLUÇÃO ############### ");
        ExecucaoSolucao.execute();
        System.out.println("############### SOLUÇÃO ############### ");
    }
    
}
