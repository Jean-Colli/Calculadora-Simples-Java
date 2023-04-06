package operacoes;
import calculator.Type;


public class Subtracao implements Type{

    @Override
    public int calcular(int a, int b){
        return a-b;
    }
}

