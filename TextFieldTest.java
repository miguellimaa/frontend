// Fig. 12.10: TextFieldTest.java
// Testando o calculator.
import javax.swing.JFrame; // Importa a classe JFrame para criar a janela principal
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Calculator extends.JFrame
{
{
   private final JTextField calculator1; // Declara um campo de texto com tamanho definido
   private final JTextField calculator2; // Declara um campo de texto com texto padrão
   private final JTextField calculator3; // Declara um campo de texto com texto padrão e tamanho
   private final JPasswordField passwordField; // Declara um campo de senha com texto oculto

   // Construtor da classe calculator que configura o JFrame
   public Calculator()
   {
      super("Testando JTextField e JPasswordField"); // Define o título da janela principal
      setLayout(new FlowLayout()); // Define o layout da janela como FlowLayout

      // Cria o campo de texto com 10 colunas de largura
      calculator1 = new JTextField(10); 
      add(calculator1); // Adiciona calculator1 à janela principal (JFrame)

      // Cria o campo de texto com texto padrão
      calculator2 = new JTextField("Digite seu texto aqui agora");
      add(calculator2); // Adiciona calculator2 à janela principal (JFrame)

      // Cria o campo de texto com texto padrão e 21 colunas de largura
      calculator3 = new JTextField("Campo de texto não editável", 21);
      calculator3.setEditable(false); // Desativa a edição do campo de texto
      add(calculator3); // Adiciona calculator3 à janela principal (JFrame)
      // '== operador de comparação'

      // Cria o campo de senha com texto padrão
      passwordField = new JPasswordField("Texto oculto");
      add(passwordField); // Adiciona passwordField à janela principal (JFrame)

      // Registra o manipulador de eventos para todos os campos de texto e senha
      TextFieldHandler handler = new TextFieldHandler();
      calculator1.addActionListener(handler); // Adiciona o manipulador de eventos ao calculator1
      calculator2.addActionListener(handler); // Adiciona o manipulador de eventos ao calculator2
      calculator3.addActionListener(handler); // Adiciona o manipulador de eventos ao calculator3
      passwordField.addActionListener(handler); // Adiciona o manipulador de eventos ao passwordField
   } // Fim do construtor calculator

   // Classe interna privada para manipulação de eventos de ação
   private class TextFieldHandler implements ActionListener 
   {
      // Processa eventos de ação nos campos de texto e senha
      @Override
      public void actionPerformed(ActionEvent event)
      {
         String string = ""; 
         // Verifica se o evento foi gerado pelo calculator1 e obtém o texto
         if (event.getSource() == calculator1)
            string = String.format("calculator1: %s",
               event.getActionCommand());

         // Verifica se o evento foi gerado pelo calculator2 e obtém o texto
         else if (event.getSource() == calculator2)
            string = String.format("calculator2: %s",
               event.getActionCommand());

         // Verifica se o evento foi gerado pelo calculator3 e obtém o texto
         else if (event.getSource() == calculator3)
            string = String.format("calculator3: %s", 
               event.getActionCommand());

         // Verifica se o evento foi gerado pelo passwordField e obtém o texto
         else if (event.getSource() == passwordField)
            string = String.format("passwordField: %s", 
               event.getActionCommand());

         // Exibe uma caixa de diálogo com o conteúdo do campo de texto ou senha
         JOptionPane.showMessageDialog(null, string); 
      } 
   }   public static void main(String[] args)
   { 
      calculator Calculator = new calculator(); // Cria uma instância de calculator
      Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a operação de fechamento da janela para sair do aplicativo
      Calculator.setSize(350, 100); // Define o tamanho da janela (largura: 350, altura: 100)
      Calculator.setVisible(true); // Torna a janela visível
   } 
} // fim da classe TextFieldTest
}