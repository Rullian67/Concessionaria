/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionaria2;

/**
 *
 * @author rulli
 */
public class Carro extends Veiculo{
    private int quantidadeDeCV;

    public Carro(Marca marca, String modelo, int quantidadeDeCV) {
        super(marca, modelo);
        this.quantidadeDeCV = quantidadeDeCV;
    }

    public int quantidadeDeCV() {
        return quantidadeDeCV;
    }

    public void quantidadeDeCV(int quantidadeDeCV) {
        this.quantidadeDeCV = quantidadeDeCV;
    }

    // Implementação do método calcularPreco
    @Override
    public double calcularPreco() {
     double precoBase = 50000.0; 
     // Margem de lucro da concessionária
    double margemLucro = 0.2;
    
     double precoFinal = precoBase + (precoBase* margemLucro);

    return precoFinal;
    }
    public String toString() {
        return super.toString() + ", Número de Cavalos: " + quantidadeDeCV;
    }
}
