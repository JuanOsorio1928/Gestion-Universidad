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
public class Universidad {
    private String nombre;
    private List<Departamento> departamentos;
    
    public Universidad(String nombre){
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }
    
    public void agregarDepartamento(String nombre){
        departamentos.add(new Departamento(nombre));
    }
    public void eliminarDepartamento(String nombre){
        departamentos.removeIf(dep -> dep.getNombre().equals(nombre));
    }
    
    public void mostrarDepartamentos(){
        for (Departamento dep : departamentos){
            System.out.println("- " + dep.getNombre());
        }
    }
    
    public List<Profesor> obtenerTodosProfesores(){
        List<Profesor> todos = new ArrayList<>();
        for (Departamento d: departamentos){
            todos.addAll(d.getProfesores());
        }
        return todos;
    }
}
