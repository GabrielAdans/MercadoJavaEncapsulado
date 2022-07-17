import java.util.Scanner;
import java.text.DecimalFormat;

class main {
//DECLARAÇÃO DE VARIÁVEIS
    public static void main (String[] args) {
        int Q = 0, Z = 0, X = 0, D = 0, u, prod, cad, item, forpag, pass;
        Produtos prd = new Produtos(0);
        Produtos cafe = new Produtos(8.99);
        Produtos acucar = new Produtos(5.49);
        Produtos leite = new Produtos(6.98);
        Produtos pao = new Produtos(0.6);
        double car = 0, qtd = 0;
        Scanner sci = new Scanner (System.in);
        Scanner scd = new Scanner (System.in);
        Scanner scs = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
//INICIO DO EXECUTAVEL
//ESCOLHA DO TIPO DE USUARIO
            while (Q!=2) {
                System.out.println("BEM VINDO AO SUPERMERCADO QHGR, O MELHOR E MAIS COMPLETO DO VALE DO SAO FRANCISCO!\nEscolha sua forma de entrada:\n1-Cliente\n2-Operador");
                u = sci.nextInt();
                switch (u) {
//INICIO DA INTERACAO COMO CLIENTE
                    case 1:
                        System.out.println("Ola, navegue com comodidade por nossa gondola digital e escolha quais itens adicionar ao seu carrinho!");
                        while (X != 1) {
                            System.out.println("Escolha um item para adicionar ao carrinho de compras:\n1-Cafe:  R$"+cafe.listarProdutos()+"\n2-Acucar:  R$"+acucar.listarProdutos()+"\n3-Leite:   R$"+leite.listarProdutos()+"\n4-Pao:  R$"+pao.listarProdutos());
                            item = sci.nextInt();
                            System.out.println("Quantas unidades deste produto deseja adicionar ao carrinho?");
                            qtd = scd.nextDouble();
//ESCOLHA DO ITEM E ADICAO AO CARRINHO DE COMPRAS
                            switch (item) {
                                case 1:
                                    cafe.venda(qtd);
                                    cafe.parcialVenda();
                                    car = car + cafe.parcialVenda();
                                    System.out.println("Seu carrinho: " + df.format(car));
                                    break;
                                case 2:
                                    acucar.venda(qtd);
                                    acucar.parcialVenda();
                                    car = car + acucar.parcialVenda();
                                    System.out.println("Seu carrinho: " + df.format(car));
                                    break;
                                case 3:
                                    leite.venda(qtd);
                                    leite.parcialVenda();
                                    car = car + leite.parcialVenda();
                                    System.out.println("Seu carrinho: " + df.format(car));
                                    break;
                                case 4:
                                    pao.venda(qtd);
                                    pao.parcialVenda();
                                    car = car + pao.parcialVenda();
                                    System.out.println("Seu carrinho: " + df.format(car));
                                    break;
                                default:
                                    System.out.println("Ops! Ainda nao trabalhamos com esse produto!");
                                    break;
                            }
                            System.out.println("Deseja finalizar sua compra?\n1-Sim\n2-Nao");
                            X = sci.nextInt();
                        }
//TOTAL DA COMPRA E OPCAO DE CADASTRO DE CLIENTE PARA OFERTA DE DESCONTOS
                        System.out.println("O valor total da sua compra e " + df.format(car) + ". Voce sabia que pode ter descontos em toda a nossa rede? E muito facil! Basta completar seu cadastro para ter acesso aos melhores descontos em suas compras! Gostaria de se cadastrar?\n1-Sim\n2-Nao");
                        cad = sci.nextInt();
                        if (cad == 1) {
                            System.out.println("Digite seu nome:");
                            String nome = scs.nextLine();
                            System.out.println("Digite seu CPF:");
                            String CPF = scs.nextLine();
                            car = car - (car * 0.12);
                            System.out.println("Veja so como foi facil! Ja esta funcionando! O valor da sua compra, agora COM DESCONTO e de " + df.format(car) + "\nQual sera a forma de pagamento?\n1-Dinheiro\n2-Pix\n3-Debito\n4-Credito");
                            forpag = sci.nextInt();
                            switch (forpag) {
                                case 1:
                                    System.out.println("Seu pagamento sera efetuado em dinheiro");
                                    Q=2;
                                    break;
                                case 2:
                                    System.out.println("Seu pagamento sera efetuado no Pix");
                                    Q=2;
                                    break;
                                case 3:
                                    System.out.println("Seu pagamento sera via debito");
                                    Q=2;
                                    break;
                                case 4:
                                    System.out.println("Seu pagamento sera via credito");
                                    Q=2;
                                    break;
                                default:
                                    System.out.println("Opcao invalida");
                                    break;
                            }
                        } else {
//CLIENTE DECIDE NAO SE CADASTRAR
                            System.out.println("Qual sera a forma de pagamento?\n1-Dinheiro\n2-Pix\n3-Debito\n4-Credito");
                            forpag = sci.nextInt();
                            switch (forpag) {
                                case 1:
                                    System.out.println("Seu pagamento sera efetuado em dinheiro");
                                    Q=2;
                                    break;
                                case 2:
                                    System.out.println("Seu pagamento sera efetuado no Pix");
                                    Q=2;
                                    break;
                                case 3:
                                    System.out.println("Seu pagamento sera via debito");
                                    Q=2;
                                    break;
                                case 4:
                                    System.out.println("Seu pagamento sera via credito");
                                    Q=2;
                                    break;
                                default:
                                    System.out.println("Opcao invalida");
                                    break;
                            }
                        }
                        break;
//INICIO DA INTERACAO COMO ADM
                    case 2:
                        while (Z != 2) {
                            System.out.println("Digite a senha do administrador");
                            pass = sci.nextInt();
                            if (pass == 1234) {
                                while (D != 2) {
                                    System.out.println("Produtos disponiveis:\n1-Cafe:  R$"+cafe.listarProdutos()+"\n2-Acucar:  R$"+acucar.listarProdutos()+"\n3-Leite:   R$"+leite.listarProdutos()+"\n4-Pao:  R$"+pao.listarProdutos());
                                    prod = sci.nextInt();
//ALTERACAO DE PRECOS CONDICIONADO A SENHA ADM
                                    switch (prod) {
                                        case 1:
                                            cafe.colocarPreco();
                                            System.out.println("Continuar alterando os valores?\n1-Sim\n2-Nao");
                                            D = sci.nextInt();
                                            break;
                                        case 2:
                                            acucar.colocarPreco();
                                            System.out.println("Continuar alterando os valores?\n1-Sim\n2-Nao");
                                            D = sci.nextInt();
                                            break;
                                        case 3:
                                            leite.colocarPreco();
                                            System.out.println("Continuar alterando os valores?\n1-Sim\n2-Nao");
                                            D = sci.nextInt();
                                            break;
                                        case 4:
                                            pao.colocarPreco();
                                            System.out.println("Continuar alterando os valores?\n1-Sim\n2-Nao");
                                            D = sci.nextInt();
                                            break;
                                        default:
                                            System.out.println("Escolha uma opcao valida");
                                            break;
                                    }
                                    System.out.println("Deseja continuar no sistema como operador?\n1-Sim\n2-Nao");
                                    Z = sci.nextInt();
                                }
                            } else {
                                System.out.println("Senha incorreta. Por favor, tente novamente.");
                            }
                            System.out.println("Deseja continuar no sistema com as alteracoes feitas?\n1-Sim\n2-Nao");
                            Q = sci.nextInt();
                        }
                }
            }
//MENSAGEM FINAL DO EXECUTAVEL
            System.out.println("Obrigado por escolher o QHGR! Volte sempre!\n*Todos os direitos reservados*");
    }
}