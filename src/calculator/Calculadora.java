package calculator;

public class Calculadora {
    private Type type;

    public void setType(Type new_type){
        this.type = new_type;
    }

    public Type getType(){
        return type;
    }

    
    public int calcular(int a, int b){

        return type.calcular(a, b);
    }

    

    
}
