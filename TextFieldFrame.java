// Fig. 12.9: TextFieldFrame.java
// JTextFields e JPasswordFields.
import java.awt.*; // Importa a classe FlowLayout para gerenciar o layout dos componentes
import java.awt.event.*; // Importa a classe ActionEvent para eventos de ação
import javax.swing.*; // Importa a classe JFrame para criar a janela principal


// Define a classe TextFieldFrame que estende JFrame, a janela principal
public class TextFieldFrame extends JFrame 
{
   private final JTextField textField1; // Declara um campo de texto com tamanho definido
   private final JTextField textField2; // Declara um campo de texto com texto padrão
   private final JTextField textField3; // Declara um campo de texto com texto padrão e tamanho
   private final JPasswordField passwordField; // Declara um campo de senha com texto oculto

   // Construtor da classe TextFieldFrame que configura o JFrame
   public TextFieldFrame()
   {
      super("Testando JTextField e JPasswordField"); // Define o título da janela principal
      setLayout(new FlowLayout()); // Define o layout da janela como FlowLayout

      // Cria o campo de texto com 10 colunas de largura
      textField1 = new JTextField(10); 
      add(textField1); // Adiciona textField1 à janela principal (JFrame)

      // Cria o campo de texto com texto padrão
      textField2 = new JTextField("Digite seu texto aqui agora");
      add(textField2); // Adiciona textField2 à janela principal (JFrame)

      // Cria o campo de texto com texto padrão e 21 colunas de largura
      textField3 = new JTextField("Campo de texto não editável", 21);
      textField3.setEditable(false); // Desativa a edição do campo de texto
      add(textField3); // Adiciona textField3 à janela principal (JFrame)
      // '== operador de comparação'

      // Cria o campo de senha com texto padrão
      passwordField = new JPasswordField("Texto oculto");
      add(passwordField); // Adiciona passwordField à janela principal (JFrame)

      // Registra o manipulador de eventos para todos os campos de texto e senha
      TextFieldHandler handler = new TextFieldHandler();
      textField1.addActionListener(handler); // Adiciona o manipulador de eventos ao textField1
      textField2.addActionListener(handler); // Adiciona o manipulador de eventos ao textField2
      textField3.addActionListener(handler); // Adiciona o manipulador de eventos ao textField3
      passwordField.addActionListener(handler); // Adiciona o manipulador de eventos ao passwordField
   } // Fim do construtor TextFieldFrame

   // Classe interna privada para manipulação de eventos de ação
   private class TextFieldHandler implements ActionListener 
   {
      // Processa eventos de ação nos campos de texto e senha
      @Override
      public void actionPerformed(ActionEvent event)
      {
         String string = ""; 
         // Verifica se o evento foi gerado pelo textField1 e obtém o texto
         if (event.getSource() == textField1)
            string = String.format("textField1: %s",
               event.getActionCommand());

         // Verifica se o evento foi gerado pelo textField2 e obtém o texto
         else if (event.getSource() == textField2)
            string = String.format("textField2: %s",
               event.getActionCommand());

         // Verifica se o evento foi gerado pelo textField3 e obtém o texto
         else if (event.getSource() == textField3)
            string = String.format("textField3: %s", 
               event.getActionCommand());

         // Verifica se o evento foi gerado pelo passwordField e obtém o texto
         else if (event.getSource() == passwordField)
            string = String.format("passwordField: %s", 
               event.getActionCommand());

         // Exibe uma caixa de diálogo com o conteúdo do campo de texto ou senha
         JOptionPane.showMessageDialog(null, string); 
      } 
   } // Fim da classe interna privada TextFieldHandler
} // Fim da classe TextFieldFrame
