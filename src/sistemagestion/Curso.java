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
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;  //Asociacion
    private List<Estudiante> estudiantes; //Asociacion
    
    public Curso(String codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }
    
    public void generarReporte(GeneradorReporte generador) {
        generador.generar(nombre, estudiantes.size());
        //dependencia: Curso depende de GeneradorReporte
    }
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    
    public void inscribirEstudiante(Estudiante estudiante){
        if(!estudiantes.contains(estudiante)){
            estudiantes.add(estudiante);
            estudiante.inscribirCurso(this); //Asociacion 
        }
        }
    public void desInscribirEstudiante(Estudiante estudiantes){}
    public void asignarProfesor(Profesor profesor){
        this.profesor = profesor;
        profesor.asignarCurso(this); //Asociacion 
        }
    
    public List<Estudiante> getEstudiantes(){
        return estudiantes;
    }
    
    @Override
    public String toString(){
        return codigo + ": " + nombre;
    }
    }
