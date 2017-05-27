/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Grafica {
    // definir atributos que pretendemos que describan al objeto
    private JFreeChart grafica;
    private  String titulo;
    private  XYSeriesCollection series;
    
    // constructor
    public Grafica (String titulo){
      this.titulo = titulo;
      this.series = new XYSeriesCollection();
      this.grafica = null;
    }
    
    public void agregarSerie(double[] datos,String nombreSerie){
       XYSeries serie = new XYSeries(nombreSerie);
       // agregar de forma dinamica los datos a la serie
       double i,j;
       for (int x=0; x<datos.length;x++){
           
          serie.add(x, datos[x]);
       
       }
       // agregamos la serie a la colección 
       series.addSeries(serie);
       
    }
       
    public void mostrarGrafica(){
     // instanciar un panel para poder mostrarla 
     this.grafica = ChartFactory.createXYLineChart(this.titulo,"x","y",series);
     
        ChartFrame frame = new ChartFrame(titulo, grafica);
        frame.pack();
        frame.setVisible(true);
    }
    
    
    
}
