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
public class Profesor {
    private String nombre;
    private String especialidad;
    private List<Curso> cursosImpartidos; //Asociacion directa
    
    public Profesor(String nombre, String especialidad){
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursosImpartidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List getCursosImpartidos() {
        return cursosImpartidos;
    }

    public void setCursosImpartidos(List cursosImpartidos) {
        this.cursosImpartidos = cursosImpartidos;
    }
    
    public void asignarCurso(Curso curso){
        if (!cursosImpartidos.contains(curso)){
            cursosImpartidos.add(curso);
        }
    }
    
    public void eliminarCurso(String codigoCurso){
        cursosImpartidos.removeIf(c -> c.getCodigo().equalsIgnoreCase(codigoCurso));
    }
    
    @Override
    public String toString(){
        return nombre + " (" + especialidad + ") ";
    }
}
