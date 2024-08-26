import java.awt.*; // Importa java.awt
import java.awt.event.*;// Importa java.awt.event
import javax.swing.*; // Importa javax.swing

public class Calculator extends JFrame{
    private final JTextField textField1; 
    private final JTextField textField2; 
    private final JLabel label1;
    private final JLabel label2;
    private final JButton btnCalcular;
    private final JLabel lblNotificacao;

    public Calculator() {
        super("Calculadora de Soma");//Vai dar o titulo la em cima de Calculadora de soma
        setLayout(new GridLayout(3, 2, 5, 5)); //Define o layout

        label1 = new JLabel("Digite o número 1:", SwingConstants.RIGHT); //vai definir a label 1 como digite o número 1
        add(label1);//adiciona Label2
        textField1 = new JTextField(10); //tamanho da coluna
        add(textField1); //adiciona textField1

        label2 = new JLabel("Digite o número 2:", SwingConstants.RIGHT);//vai definir a label 2 como digite o número 2
        add(label2);//adiciona Label2
        textField2 = new JTextField(10);//tamanho da coluna
        add(textField2); //adiciona textField2

        btnCalcular = new JButton("Calcular"); //Aqui vai colocar o nome do botão de calcular
        add(btnCalcular);
        lblNotificacao = new JLabel("Resultado: ?");//Aqui vai dar o nome da notificação de resultado
        add(lblNotificacao); //Adiciona LblNotificacao

        TextFieldHandler handler = new TextFieldHandler();
        btnCalcular.addActionListener(handler); //adiciona o leitor de ação
    } 

    private class TextFieldHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (textField1.getText().trim().isEmpty()) {
                lblNotificacao.setText("O campo 1 está vazio!");//Aparecer a notificação que o campo 1 está vazio
                textField1.requestFocus();
            } else if (textField2.getText().trim().isEmpty()) {
                lblNotificacao.setText("O campo 2 está vazio!");//Aparecer a notificação que o campo 1 está vazio
                textField2.requestFocus();
            } else {
                try { //tente
                    int numero1 = Integer.parseInt(textField1.getText()); // Aqui vai pedir para o usuario digitar um numero inteiro
                    int numero2 = Integer.parseInt(textField2.getText()); // Aqui vai pedir para o usuario digitar outro numero inteiro
                    
                    
                    int soma = numero1 + numero2; //Aqui vai fazer a soma dos dois numeros inteiros e ficara guardado em soma
                    
                    
                    lblNotificacao.setText(String.format("Resultado: %d", soma)); // Aqui vai mostrar o "resultado" oque ficou guardado em soma
                } catch (NumberFormatException e) {
                    
                    lblNotificacao.setText("<html><body>Ops! Parece que foi digitado algo errado. Por favor, revise a digitação, apenas números inteiros são permitidos.</body></html>"); //Aqui se você tiver feito errado e não colocar um numero inteiro vai aparecer a notificação que você digitou errado e que so e permitido numeros inteiros
                }
            }
        }
    }   

    public static void main(String[] args) { 
        Calculator calculator = new Calculator(); 
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Aqui vai dar a opção de saida
        calculator.setSize(450, 150); //Aqui vai definir o tamanho que a calculadora vai aparecer
        calculator.setVisible(true);  //Sem isso aqui a calculadora não ficaria visivel
    } 
}
 