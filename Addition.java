
// Programa adicional que usa JOptionPane para entrada e saída.

import javax.swing.JOptionPane; 

public class Addition  //classe public, e adicão
{
   public static void main(String[] args)
    /**
         * static:declaração de metodo somente de leitura,o qual não podera ser editado,pelo uso de @Override
         * void: modo protegido de um método, o qual não retornará qualquer valor
         * main: nome do metodo "executor"
         *   */

   {
      // obter entrada do usuário nas caixas de diálogo de entrada do JOptionPane
      String firstNumber = 
         JOptionPane.showInputDialog("Enter first integer");
      String secondNumber =
         JOptionPane.showInputDialog("Enter second integer");

      // converter entradas de String em valores int para uso em um cálculo
      int number1 = Integer.parseInt(firstNumber); 
      int number2 = Integer.parseInt(secondNumber);

      int sum = number1 + number2; // adicionar numero para soma

      //exibir o resultado em uma caixa de diálogo de mensagem JOptionPane
      JOptionPane.showMessageDialog(null, "The sum is " + sum, 
         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
   } 
} 
