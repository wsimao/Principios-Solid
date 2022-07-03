package D.Solução;

import D.Violação.ExecucaoViolacao;

public class App {
    public static void main(String[] args) {
        System.out.println("############### VIOLAÇÃO ############### ");
        ExecucaoViolacao.execute();
        System.out.println("############### VIOLAÇÃO ############### ");

        System.out.println("############### SOLUÇÃO ############### ");
        ExecucaoSolucao.execute();
        System.out.println("############### SOLUÇÃO ############### ");
    }
    
}
