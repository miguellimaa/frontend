// Fig. 12.7: LabelTest.java
// Testing LabelFrame.
import javax.swing.JFrame; //Importação de uma biblioteca

public class LabelTest //criação de classe
{
   public static void main(String[] args)
   { 
      LabelFrame labelFrame = new LabelFrame(); //criação do construtor
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      labelFrame.setSize(1000, 800); //largura e tamanho
      labelFrame.setVisible(true); //definição de visibilidade
   }//encerramento do bloco do código do método
} // end class LabelTest

