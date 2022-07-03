package O.Violação;
public class Calculadora {
    public double jurosBandeira(String nomeBandeira){

        double result = 0;

        if("VISA".equals(nomeBandeira)){
            result = new Visa().getTaxa();
        }else if("MASTERCARD".equals(nomeBandeira)){
            result = new MasterCard().getJuros();
        }else if("ALE".equals(nomeBandeira)){
            result = new Alelo().getJurosInmetrics();
            result += 2;
        }

        result += 2;

        return result;
    }
    
}
