/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestion;

/**
 *
 * @author Juan Osorio
 */
public class SistemaGestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad universidad = new Universidad("Universidad Nacional");
        
        //Se crean los departamentos
        universidad.agregarDepartamento("Ingenieria");
        Departamento ing = universidad.getDepartamentos().get(0);
        
        Profesor profe1 = new Profesor("Nestor Bolivar", "Programacion");
        Profesor profe2 = new Profesor("Pepito Perez", "Calculo");
        
        ing.contratarProfesor(profe1);
        ing.contratarProfesor(profe2);
        universidad.agregarDepartamento("Fumanas");
        
        //Se muestran los profes
        System.out.println("Profesores de ingenieria: ");
            for(Profesor p : ing.getProfesores()){
                System.out.println("- " + p);
            }
        
        ing.despedirProfesor("Pepito Perez");
        
        System.out.println("Despues de despedir a pepito: ");
            for(Profesor p : ing.getProfesores()){
                System.out.println("- " + p);
            }
            
        Curso poo = new Curso("A1000", "Programacion Orientada A Objetos");
            poo.asignarProfesor(profe1);
            
            Estudiante est1 = new Estudiante("20251000", "Juan Osorio");
            Estudiante est2 = new Estudiante("20251001", "Pepe Pepe");
            
            poo.inscribirEstudiante(est1);
            poo.inscribirEstudiante(est2);
        System.out.println("Estudiantes en el curso: " + poo.getNombre() + " :");
        for(Estudiante e : poo.getEstudiantes()){
            System.out.println("- " + e);
        }
        
        System.out.println("Cursos del estudiante: " + est1.getNombre() + ":");
        for(Curso c : est1.getCursosInscritos()) {
            System.out.println("- " + c);
        }
       /* universidad = null; //simulando que fue borrada 
        System.gc();  //Limpia memoria(departamentos borrados)
        System.out.println("La universidad fue eliminada con exito.");*/
    }
    
}
