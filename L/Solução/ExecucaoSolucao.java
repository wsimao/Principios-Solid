package L.Solução;

public class ExecucaoSolucao {
    public static void execute() {
        Gaviao gaviao = new Gaviao();
        Pinguim pinguim = new Pinguim();

        AveVoadora ave1 = new Gaviao();

        pegarComidaArvore(gaviao);
        pegarComidaArvore(ave1);
        pegarComidaNoChao(pinguim);
        pegarComidaNoChao(gaviao);
        pegarComidaDentroAgua(pinguim);


    }

    public static void pegarComidaArvore(AveVoadora ave) {

        System.out.println("Voando até a arvore");
        ave.voar();

        System.out.println("Bicando o alimento");
        ave.bicar();

    }

    public static void pegarComidaNoChao(Ave ave) {

        System.out.println("Bicando o alimento");
        ave.bicar();

    }

    public static void pegarComidaDentroAgua(AveNadadora ave){

        System.out.println("Nadando no Oceano");
        ave.nadar();

        System.out.println("Nadando até a comida");
        ave.bicar();

    }
    
}
