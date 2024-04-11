/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionaria2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rulli
 */
public class Financeiro {
     private List<Venda> vendas;

    public Financeiro() {
        vendas = new ArrayList<>();
    }

    // Método para registrar uma venda
    public void registrarVenda(Venda venda) {
        vendas.add(venda);
        System.out.println("Venda registrada com sucesso!");
        System.out.println("Cliente: " + venda.getCliente().getNome());
        System.out.println("Item: " + venda.getItem().getClass().getSimpleName());
        System.out.println("Valor: " + venda.getValor());
    }

    // Método para imprimir todas as vendas
    public void imprimirVendas() {
        for (Venda venda : vendas) {
            System.out.println(venda);
        }
    }
}
