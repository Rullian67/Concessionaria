/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionaria2;

/**
 *
 * @author rulli
 */
public class Moto extends Veiculo{
     private int cilindradas;

    public Moto(Marca marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    // Implementação do método calcularPreco
    @Override
    public double calcularPreco() {
       double precoBase = 20000.0; 
     // Margem de lucro da concessionária
    double margemLucro = 0.2;
    
     double precoFinal = precoBase + (precoBase* margemLucro);

    return precoFinal;
    }
    @Override
    public String toString() {
        return super.toString() + ", Cilindradas: " + cilindradas;
    }
}
