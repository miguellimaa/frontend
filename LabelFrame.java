// Fig. 12.6: LabelFrame.java
// JLabels com texto e ícones.
import java.awt.FlowLayout; // especifica como os componentes são dispostos
import javax.swing.Icon; // fornece funcionalidades básicas da janela
import javax.swing.ImageIcon; // exibe texto e imagens
import javax.swing.JFrame; // constantes comuns usadas com o Swing
import javax.swing.JLabel; // interface usada para manipular imagens
import javax.swing.SwingConstants; // carrega imagens

public class LabelFrame extends JFrame 
{
   private final JLabel label1; // JLabel apenas com texto
   private final JLabel label2; // JLabel construído com texto e ícone
   private final JLabel label3; // JLabel com texto e ícone adicionados

   // O construtor LabelFrame adiciona JLabels ao JFrame
   public LabelFrame()
   {
      super("Testando JLabel");//super=nome do titulo
      setLayout(new FlowLayout()); // define o layout do frame

      // Construtor JLabel com um argumento de string
      label1 = new JLabel("Vai corinthians");
      label1.setToolTipText("Este é o label1");
      add(label1); // adiciona label1 ao JFrame

      // Construtor JLabel com argumentos de string, Ícone e alinhamento
      Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
      label2 = new JLabel("Label com texto e ícone", bug, 
         SwingConstants.LEFT);
      label2.setToolTipText("Este é o label2");
      add(label2); // adiciona label2 ao JFrame

      label3 = new JLabel(); // Construtor JLabel sem argumentos
      label3.setText("Label com ícone e texto na parte inferior");
      label3.setIcon(bug); // adiciona ícone ao JLabel
      label3.setHorizontalTextPosition(SwingConstants.CENTER);
      label3.setVerticalTextPosition(SwingConstants.BOTTOM);
      label3.setToolTipText("Este é o label3");
      add(label3); // adiciona label3 ao JFrame
   } 
} // fim da classe LabelFrame
                                                                                                                                                                                                                                                                                       
