/**
*public:declaração que "exporta" e permite que a classe/método/variavel seja importada/reutilizada em outras classes/objetos
*class:declaração de classe (que pode se tornar um objeto)
*Hello World:nome da classe,seguindo o padrão de nomenclatura PascalCase
{ ("abre chave"):serve para declarar o inicio de um bloco de codigos/ações
}("fecha chave")serve para declarar o fim de um bloco de códigos/ações
*/



public class HelloWorld { //Aqui e criada a classe HelloWorld
    public static void main(String[] args){
        /**
         * static:declaração de metodo somente de leitura,o qual não podera ser editado,pelo uso de @Override
         * void: modo protegido de um método, o qual não retornará qualquer valor
         * main: nome do metodo "executor"
         * ( (abre parênteses):serve para declarar o inicio das declarações de parâmetros de um método/função
         * ) (fecha parênteses): serve para declarar o fim das declarações de paramêtros de um método/função
         * @param args
         * System:invoca a classe de sistema
         * .(ponto)serve como operador de invocação de método
         * out:Invoca a sublasse de saída do sistema
         * ;(ponto e virgula):serve para encerrar uma linha de código
         */
                System.out.println("Hello World");

    }
    
    
}