/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooamn;

import data.Alumno;
import data.Grafica;
import data.Materia;
import data.Persona;

/**
 *
 * @author Roberto Cruz Leija
 */
public class POOAMN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Grafica grafica1 = new Grafica("GRafica de Disp.");
//        Grafica grafica2 = new Grafica("GRafica de Disp.2");
//        double datos[] = new double[]{2,3,4,5,6};
//        double datos2[] = new double[]{24,34,44,54,64};
//       
//                
//        grafica1.agregarSerie(datos,"a");
//        grafica1.agregarSerie(datos2,"b");
//        grafica1.mostrarGrafica();
//        grafica2.agregarSerie(datos,"a");
//        grafica2.agregarSerie(datos2,"b");
//        grafica2.mostrarGrafica();

//       Persona juan = new Persona();
//       Persona maria = new Persona("Maria Mercedes", 17, 'f',"Mexicana");
//       System.out.println();
//       juan.setNombre("Juan Alberto");
//       juan.setSexo('m');
//       juan.setEdad(23);
//       juan.setNacionalidad("Aleman");
//       System.out.println(maria.getNombre()+" Edad: "+maria.getEdad() );
//       System.out.println(juan.toString());
      Materia[] materias = new Materia[2];
      materias[0]= new Materia("AMN","Juan Camaney","11:30 a 14:30");
      materias[1]= new Materia("Ingenieria De Software","Juan Camaney","11:30 a 14:30");
     
      Alumno laura = new Alumno("it452017-56t", materias, "UNID");
      laura.setNombre("Laura Garza");
      laura.setNacionalidad("Francesa");
      laura.setEdad(34);
      
      System.out.println();
       
    }
    
}
