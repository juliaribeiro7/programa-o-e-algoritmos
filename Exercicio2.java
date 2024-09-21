/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
    public class Exercicio2 {


    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Peça e leia a idade e verifique se a pessoa tem mais de 21 anos
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade > 21) {
            System.out.println("Voce tem mais de 21 anos.");
        } else {
            System.out.println("Voce tem menos de 21 anos.");
        }

        // Peça e leia o salário e informe se é maior que três vezes o salário mínimo
        System.out.print("Digite seu salario: ");
        double salario = scanner.nextDouble();
        double salarioMinimo = 1212.00; // assume o salário mínimo é R$ 1212,00
        if (salario > 3 * salarioMinimo) {
            System.out.println("Seu salário e maior que tres vezes o salario minimo.");
        } else {
            System.out.println("Seu salario e menor ou igual a tres vezes o salario minimo.");
        }

        // Peça e leia a altura e verifique se é maior que 1,75m
        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();
        if (altura > 1.75) {
            System.out.println("Sua altura e maior que 1,75m.");
        } else {
            System.out.println("Sua altura e menor ou igual a 1,75m.");
        }

        // Peça e leia o peso e informe se é maior que 70kg
        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();
        if (peso > 70) {
            System.out.println("Seu peso e maior que 70kg.");
        } else {
            System.out.println("Seu peso e menor ou igual a 70kg.");
        }

        // Peça e leia o sobrenome e verifique se é igual ao sobrenome "Silva"
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        if (sobrenome.equals("Silva")) {
            System.out.println("Seu sobrenome e Silva.");
        } else {
            System.out.println("Seu sobrenome não e Silva.");
        }

        // Peça e leia o gênero e informe se é igual a "F"
        System.out.print("Digite seu gênero (M ou F): ");
        char genero = scanner.next().charAt(0);
        if (genero == 'F') {
            System.out.println("Seu genero e feminino.");
        } else {
            System.out.println("Seu gênero e masculino.");
        }
    }
}   
