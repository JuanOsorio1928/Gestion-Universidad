/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;

import java.util.List;
/**
 *
 * @author Juan Osorio
 */
public class Estudiante {
    private String nombre; 
    private String codigo;
    private List<Curso> cursosInscritos; //Asociacion 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(List cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }
}
