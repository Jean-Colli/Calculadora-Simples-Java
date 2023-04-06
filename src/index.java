import calculator.Type;
import funcoes.Functions;
import calculator.Calculadora;



import javax.swing.JOptionPane;

public class index {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        Type type = Functions.escolheOperacao();
        calculadora.setType(type);
        
        int a = Functions.escolheNumero(1);
        int b = Functions.escolheNumero(2);

        int resultado = calculadora.calcular(a, b);
      
        String resposta = "O resuldado é: " + resultado;
        System.out.println(resposta);
        JOptionPane.showMessageDialog(null, resposta);
    }
}
