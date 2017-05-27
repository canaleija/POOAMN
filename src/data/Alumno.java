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
public class Alumno extends Persona {
    
    private String matricula;
    private Materia[] materias;
    private String escuela;
    
    public Alumno (){
      super("",0,'m',"");
      this.matricula ="000000";
      this.materias = new Materia[5];
      this.escuela = "";
    }
    
    public Alumno (String matricula, Materia[] materias, String escuela){
      super("",0,'m',"");
      this.matricula =matricula;
      this.materias = materias;
      this.escuela =escuela;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the materias
     */
    public Materia[] getMaterias() {
        return materias;
    }

    /**
     * @param materias the materias to set
     */
    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    /**
     * @return the escuela
     */
    public String getEscuela() {
        return escuela;
    }

    /**
     * @param escuela the escuela to set
     */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    
    
    
    
}
