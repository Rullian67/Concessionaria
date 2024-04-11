/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionaria2;

/**
 *
 * @author rulli
 */
abstract class Veiculo implements Compravel {
     private Marca marca;
    private String modelo;

    public Veiculo(Marca marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
     @Override
    public String toString() {
        return "Veículo: Marca: " + marca + ", Modelo: " + modelo + "";
    }

    // Método abstrato para calcular o preço
    public abstract double calcularPreco();
}
