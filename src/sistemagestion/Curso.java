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
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;  //Asociacion
    private List<Estudiante> estudiantes; //Asociacion
    
    public void generarReporte(generadorReporte generador) {
        //dependencia: Curso depende de GeneradorReporte
    }
}
