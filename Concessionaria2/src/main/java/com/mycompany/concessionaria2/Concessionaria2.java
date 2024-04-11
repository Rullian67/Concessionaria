/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.concessionaria2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rulli
 */
public class Concessionaria2 {

    public static void main(String[] args) {
          
       // Criando uma instância de Cliente
        Cliente cliente1 = new Cliente("João", "123.456.789-00");
        Cliente cliente2 = new Cliente("Matheus", "123.257.789-11");
        cliente1.toString();
        cliente2.toString();

        
        // Criando uma instância de Marca
        Marca marca1 = new Marca("Toyota \n");
        Marca marca2 = new Marca ("Honda  \n");

        // Criando uma instância de Carro
        System.out.println("\n");
        Carro carro = new Carro( marca1, "Corolla", 80);
        
        // Criando uma instância de Moto
        Moto moto = new Moto( marca2, "BMW", 250);

        // Criando uma instância de Venda
        Venda venda = new Venda(cliente1, carro);
  
         // Criando uma instância de Financeiro e registrando a venda
        Financeiro financeiro = new Financeiro();
        financeiro.registrarVenda(venda);
        financeiro.imprimirVendas();
        financeiro.toString();
        
        // Criando uma instância de Venda
        Venda venda2 = new Venda(cliente2,moto );
  
         // Criando uma instância de Financeiro e registrando a venda
        Financeiro financeiro2 = new Financeiro();
        financeiro2.registrarVenda(venda2);
        financeiro2.imprimirVendas();
         financeiro.toString();
         
         
         Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o preço do carro para teste de Venda: ");
            double preco = scanner.nextDouble();

            if (preco <= 0) {
                throw new IllegalArgumentException("O preço do carro deve ser maior que zero.");
            }

            System.out.println("Carro vendido pelo preço de: R$" + preco);
        } catch (InputMismatchException e) {
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
        
      
    }
}