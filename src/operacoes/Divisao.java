package operacoes;
import javax.swing.JOptionPane;

import calculator.Type;


public class Divisao implements Type{
    @Override
    public int calcular(int a, int b){
        if (b == 0) {
            JOptionPane.showMessageDialog(null, "Não se pode dividir número por zero");
            System.exit(0);
        }
        return a/b;
    }
}
