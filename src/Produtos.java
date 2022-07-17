import java.util.Scanner;

public class Produtos {
//ATRIBUTOS DO OBJETO PRODUTOS
    private double car, totalparc, qtd, totalcar;
    Scanner sci = new Scanner (System.in);
    Scanner scd = new Scanner (System.in);
    Scanner scs = new Scanner (System.in);
    private double value;
//CONSTRUTORES DO OBJETO PRODUTOS
    public Produtos(double valor) {
        value = 0;
        this.value = valor;
    }
    public double listarProdutos(){
        return this.value;
    }
//METODOS DE INTERACAO DO OBJETO PRODUTOS
    public void colocarPreco(){
        System.out.println("Insira o novo valor do produto:");
        this.value = scd.nextDouble();
    }
    public void venda(double qtd) {
        this.qtd = qtd;
        this.car = this.car + this.value * this.qtd;
        this.totalparc = this.car;
    }
    public double parcialVenda() {
        return this.totalparc;
    }
    public double totalCar() {
        totalcar = parcialVenda();
        return this.totalcar;
    }
}
