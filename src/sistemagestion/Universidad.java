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
public class Universidad {
    List<Departamento> departamentos;
    
    public void agregarDepartamento(String nombre){
        departamentos.add(new Departamento(nombre));
    }
    public void eliminarDepartamento(String nombre){
        departamentos.removeIf(dep -> dep.getNombre().equals(nombre));
    }
    
    public void mostrarDepartamentos(String nombre){
        for (Departamento dep : departamentos){
            System.out.println("- " + dep.getNombre);
        }
    }
    
    public List<Profesor> obtenerTodosProfesores(){}
}
