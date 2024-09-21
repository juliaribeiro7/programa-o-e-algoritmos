/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exercicio3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        if (nome.equals("julia")) {
            System.out.println("Pessoa com nome igual");
        } else {
            System.out.println("Pessoa com nome diferente");
        }
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade == 17) {
            System.out.println("Pessoa com idade igual");
        } else {
            System.out.println("Pessoa com idade diferente");
        }
        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();
        if (peso == 56) {
            System.out.println("Pessoa com peso igual");
        } else {
            System.out.println("Pessoa com peso diferente");
        }
        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();
        if (altura == 1.55) {
            System.out.println("Pessoa com altura igual");
        } else {
            System.out.println("Pessoa com altura diferente");
        }
        System.out.print("Para qual time voce torce?");
        String time = scanner.next();
        if (time.equals("Palmeiras")) {
            System.out.println("Pessoa com time igual");
        } else {
            System.out.println("Pessoa com time diferente");
        }
        System.out.print("Digite seu animal favorito: ");
        String animalFavorito = scanner.next();
        if (animalFavorito.equals("Cachorro")) {
            System.out.println("Pessoa com animal favorito igual");
        } else {
            System.out.println("Pessoa com animal favorito diferente");
        }
        System.out.print("Digite sua cor favorita: ");
        String corFavorita = scanner.next();
        if (corFavorita.equals("preto")) {
            System.out.println("Pessoa com cor favorita igual");
        } else {
            System.out.println("Pessoa com cor favorita diferente");
        }
        int contador = 0;
        if (nome.equals("julia")) contador++;
        if (idade == 17) contador++;
        if (peso == 56) contador++;
        if (altura == 1.55) contador++;
        if (time.equals("Palmeiras")) contador++;
        if (animalFavorito.equals("Cachorro")) contador++;
        if (corFavorita.equals("Preto")) contador++;

        if (contador >= 3) {
            System.out.println("Voce e bem parecida/o comigo!");
        }

    }
    
}
