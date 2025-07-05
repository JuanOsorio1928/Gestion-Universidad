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
        universidad.agregarDepartamento("Ciencias");
        universidad.agregarDepartamento("Fumanas");
        
        //Se muestran los departamentos
        System.out.println("Departamentos de la universidad: ");
        universidad.mostrarDepartamentos();
        
        universidad = null; //simulando que fue borrada 
        System.gc();  //Limpia memoria(departamentos borrados)
        System.out.println("La universidad fue eliminada con exito.");
        
    }
    
}
