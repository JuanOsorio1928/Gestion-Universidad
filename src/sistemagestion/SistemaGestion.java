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
        universidad.agregarDepartamento("Fumanas");
        
        //Se muestran los departamentos
        System.out.println("Departamentos de la universidad: ");
        universidad.mostrarDepartamentos();
        
        ing.despedirProfesor("Pepito Perez");
        
        System.out.println("Despues de despedir a pepito: ");
            for(Profesor p : ing.getProfesores()){
                System.out.println("- " + p);
            }
        
        universidad = null; //simulando que fue borrada 
        System.gc();  //Limpia memoria(departamentos borrados)
        System.out.println("La universidad fue eliminada con exito.");
        
    }
    
}
