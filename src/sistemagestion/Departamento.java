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

    public Departamento (String nombre){
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public List<Profesor> getProfesores() {
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
    
    public void contratarProfesor(Profesor profesor){
        if(!profesores.contains(profesor)) {
            profesores.add(profesor);
        }
    }
    public void despedirProfesor(String nombreProfesor){
        profesores.removeIf(p -> p.getNombre().equalsIgnoreCase(nombreProfesor));
    }
    public void ofrecerCurso(Curso curso){
        cursos.add(curso);
    }
    
    public void eliminarCurso(String codigoCurso){
        cursos.removeIf(c -> c.getCodigo().equalsIgnoreCase(codigoCurso));
    }
}
