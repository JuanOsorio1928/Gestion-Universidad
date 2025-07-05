/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Juan Osorio
 */
public class Departamento {
    private String nombre; 
    private List<Profesor> profesores; //agregacion
    private List<Curso> cursos; 

    public String getNombre() {
        return nombre;
    }

    public List getProfesores() {
        return profesores;
    }

    public List getCursos() {
        return cursos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesores(List profesores) {
        this.profesores = profesores;
    }

    public void setCursos(List cursos) {
        this.cursos = cursos;
    }
    
    
}
