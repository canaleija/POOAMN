/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private char sexo;
    private String nacionalidad;
    
    // constructor defecto
//    public Persona (){
//      this.nombre = "";
//      this.edad = 0;
//      this.sexo = 'f';
//      this.nacionalidad = "desconocida";
//    }
    
    public Persona (String nombre,int edad,
             char sexo,String nacionalidad){
     this.nombre = nombre;
     this.edad = edad;
     this.sexo = sexo;
     this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        String aux = "";
        aux+=this.nombre+" Edad: "+this.edad+" Nac: "+this.nacionalidad;
        return aux;
    }
    
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    
    
}
