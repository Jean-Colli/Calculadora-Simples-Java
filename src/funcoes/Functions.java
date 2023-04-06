package funcoes;

import operacoes.*;
import calculator.Type;

import javax.swing.JOptionPane;

public class Functions {
    static Type somar = new Soma();
    static Type subtrair = new Subtracao();
    static Type multiplicar = new Multiplicacao();
    static Type dividir = new Divisao();

    public static Type escolheOperacao(){
        String type = JOptionPane.showInputDialog(null, "Qual Operação deseja realizar?", "Operação", 0);
    
        if (type.equals("Somar") || type.equals("somar")) {
            return somar;
        } else if (type.equals("Subtrair") || type.equals("subtrair")) {
            return subtrair;
        } else if (type.equals("Multiplicar") || type.equals("multiplicar")) {
            return multiplicar;
        } else if (type.equals("Dividir") || type.equals("dividir")) {
            return dividir;
        } else {
            JOptionPane.showMessageDialog(null, "Insira uma operação válida: Somar, Subtrair, Multiplicar ou Dividir");
            return escolheOperacao();
        }
    }

    public static int escolheNumero(int sequencia){
        String sequenciaString = "";
        if (sequencia == 1) {
            sequenciaString = "Primeiro";
        } else if (sequencia == 2) {
            sequenciaString = "Segundo";
        }

        String message = "Insira o " + sequenciaString + " número: ";

        String a = JOptionPane.showInputDialog(null, message, "Número", 0);
        if (a.equals("")) {
            System.exit(0);
        }
        try {
            int b = Integer.parseInt(a);
            return b;


        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada Inválida, informe um número inteiro! ");
            return escolheNumero(sequencia);
        }   
             
    }
}
