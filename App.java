
    public class App {
        public static void main(String[] args) {
            // a) Criando 8 objetos
            Objeto obj1 = new Objeto("001", "Televisão LED", 1500.00);
            Objeto obj2 = new Objeto("002", "Sofá 3 lugares", 2000.00);
            Objeto obj3 = new Objeto("003", "Mesa de jantar", 800.00);
            Objeto obj4 = new Objeto("004", "Cama Queen", 1200.00);
            Objeto obj5 = new Objeto("005", "Guarda-roupa", 1800.00);
            Objeto obj6 = new Objeto("006", "Geladeira", 2500.00);
            Objeto obj7 = new Objeto("007", "Fogão 4 bocas", 900.00);
            Objeto obj8 = new Objeto("008", "Máquina de lavar", 1300.00);
    
            // b) Criando 2 caixas
            Caixa caixa1 = new Caixa("100", "João Silva", 3);
            Caixa caixa2 = new Caixa("101", "Maria Santos", 5);
    
            // c) Adicionando objetos às caixas
            // Primeira caixa - 3 objetos
            caixa1.adicionarObjeto(obj1);
            caixa1.adicionarObjeto(obj2);
            caixa1.adicionarObjeto(obj3);
    
            // Segunda caixa - 5 objetos
            caixa2.adicionarObjeto(obj4);
            caixa2.adicionarObjeto(obj5);
            caixa2.adicionarObjeto(obj6);
            caixa2.adicionarObjeto(obj7);
            caixa2.adicionarObjeto(obj8);
    
            // d) Imprimindo etiquetas e calculando valor total
            System.out.println("--Sistema de Entiquetagem--\n");
          
            //Entiquetagem da primeira caixa
            System.out.println("Caixa 1:");
            System.out.println("Numero Serie:" + caixa1.getNumeroSerie());
            System.out.println("Nome Funcionario Responsavel:" + caixa1.getNomeFuncionarioResponsavel());
            System.out.println("Valor de Itens:"+ caixa1.getValorTotalItens());

            //Entiquetagem da caixa segunda caixa
            System.out.println("Caixa 2:");
            System.out.println("Numero Serie:" + caixa2.getNumeroSerie());
            System.out.println("Nome Funcionario Responsavel:" + caixa2.getNomeFuncionarioResponsavel());
            System.out.println("Valor de Itens:"+ caixa2.getValorTotalItens());
            //Exibindo valor total dos objetos
            System.out.println("Valor total dos objetos: " + (caixa1.getValorTotalItens() + caixa2.getValorTotalItens()));
        }
    }
//Emile Vargas Bordin 
//nota 6
//Espero que esteja correto, observei bastante o Objeto.java e o App.java e acho que consegui fazer o necessario para o programa imprimir o pedido.