
import java.awt.*; // Importa todas as classes do pacote AWT (Abstract Window Toolkit) para trabalhar com a interface gráfica.
import javax.swing.*; // Importa todas as classes do pacote Swing para criar componentes de interface gráfica.
import javax.swing.event.*; // Importa as classes necessárias para tratar eventos, como seleção de itens na lista.

public class ListFrame extends JFrame // Define a classe ListFrame que herda de JFrame, a classe base para janelas no Swing.
{
   private final JList<String> colorJList; // Declara uma lista de strings (JList) que exibirá os nomes das cores.
   
   // Declara e inicializa um array de strings com os nomes das cores que serão exibidos na lista.
   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
      "Orange", "Pink", "Red", "White", "Yellow", "magenta"};
   
   // Declara e inicializa um array de objetos Color que correspondem aos nomes das cores no array colorNames.
   private static final Color[] colors = {Color.BLACK, Color.BLUE,
      Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, 
      Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, 
      Color.RED, Color.WHITE, Color.YELLOW, Color.magenta};
   
   private final JList<String> sizeJList; // Declara uma lista de strings (JList) que exibirá os tamanhos.
   
   // Declara e inicializa um array de strings com os nomes dos tamanhos que serão exibidos na lista.
   private static final String[] sizeNames = {"Small", "Medium", "Big"};

   // Construtor da classe ListFrame, responsável por configurar a janela e adicionar os componentes.
   public ListFrame()
   {
      super("List Test"); // Chama o construtor da superclasse JFrame e define o título da janela como "List Test".
      setLayout(new FlowLayout()); // Define o layout da janela como FlowLayout, que organiza os componentes em linha.

      // Inicializa a lista colorJList com o array de nomes de cores.
      colorJList = new JList<String>(colorNames); // Cria a lista de strings (JList) utilizando o array colorNames.
      colorJList.setVisibleRowCount(5); // Define que a lista exibirá 5 linhas por vez.
      
      // Configura a lista para permitir a seleção de apenas um item por vez.
      colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

      // Adiciona a lista colorJList dentro de um JScrollPane à janela, permitindo que a lista seja rolada se necessário.
      add(new JScrollPane(colorJList));
      
      // Inicializa a lista sizeJList com o array de nomes dos tamanhos.
      sizeJList = new JList<String>(sizeNames); // Cria a lista de strings (JList) utilizando o array sizeNames.
      sizeJList.setVisibleRowCount(5); // Define que a lista exibirá 5 linhas por vez.
      
      // Configura a lista para permitir a seleção de apenas um item por vez.
      sizeJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      
      // Adiciona a lista sizeJList dentro de um JScrollPane à janela.
      add(new JScrollPane(sizeJList));

      // Adiciona um ouvinte de eventos de seleção (ListSelectionListener) à lista de cores.
      colorJList.addListSelectionListener(
         new ListSelectionListener() // Cria uma classe interna anônima que implementa ListSelectionListener.
         {   
            // Método chamado quando um item da lista é selecionado.
            @Override
            public void valueChanged(ListSelectionEvent event)
            {
               switch(sizeJList.getSelectedIndex()){
                  case 0:
                  setSize(350,150);
                  break;

                  case 1:
                  setSize(550,350);
                  break;

                  case 2:
                  setSize(750,550);
                  break;
                  
                  default:
                  setSize(350,150);
                  break;
               };
               
            } 
         } 
      ); 
   } 
} // Fim da definição da classe ListFrame.
