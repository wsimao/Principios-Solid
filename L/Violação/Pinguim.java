package L.Violação;

public class Pinguim implements Ave {
    @Override
    public void voar() {
//        throw new RuntimeException("Pinguim não voa");
        System.out.println("----> ERRO <---- Pinguim não voa");
    }

    @Override
    public void bicar() {
        System.out.println("Pinguim bicando");
    }
    
}
