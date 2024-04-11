/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionaria2;

/**
 *
 * @author rulli
 */
public class Venda {
     private Cliente cliente;
    private Compravel item;
    private double valor;

    public Venda(Cliente cliente, Compravel item) {
        this.cliente = cliente;
        this.item = item;
        this.valor = item.calcularPreco();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Compravel getItem() {
        return item;
    }

    public void setItem(Compravel item) {
        this.item = item;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Venda: Cliente: " + cliente + ", Item: " + item + ", Valor: " + valor + "";
    }
}
