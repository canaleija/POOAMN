/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooamn;

import data.Grafica;

/**
 *
 * @author Roberto Cruz Leija
 */
public class POOAMN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Grafica grafica1 = new Grafica("GRafica de Disp.");
        double datos[][] = new double[5][2];
        datos[0][0] = 3;
        datos[0][1] = 4;
        datos[1][0] = 12;
        datos[1][1] = 34;
        
        grafica1.agregarSerie(datos,"a");
    }
    
}
