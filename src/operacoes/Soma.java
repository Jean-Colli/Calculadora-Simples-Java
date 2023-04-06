package operacoes;
import calculator.Type;

public class Soma implements Type{
    
    @Override
    public int calcular(int a, int b){
        return a+b;
    }

}
