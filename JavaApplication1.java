/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */


    /**
     */
public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor total da fatura: ");
        double valorTotal = scanner.nextDouble();
        System.out.print("Digite o número de parcelas: ");
        int numParcelas = scanner.nextInt();
        System.out.print("Digite o percentual de desconto por pagamento antecipado (%): ");
        double descontoAntecipado = scanner.nextDouble();
        System.out.print("Digite o percentual de multas por atraso (%): ");
        double multaAtraso = scanner.nextDouble();

        // Cálculo do valor total com desconto
        double desconto = (valorTotal * descontoAntecipado) / 100;
        double valorTotalComDesconto = valorTotal - desconto;

        // Cálculo do valor de cada parcela com multa
        double valorParcelaComMulta = valorTotalComDesconto / numParcelas;
        double multaPorParcela = (valorParcelaComMulta * multaAtraso) / 100;

        // Impressão dos resultados
        System.out.printf("Valor total com desconto: R$ %.2f%n", valorTotalComDesconto);
        System.out.printf("Valor de cada parcela com multa: R$ %.2f (R$ %.2f de multa)%n", valorParcelaComMulta, multaPorParcela);
    }
}
