/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sumaDeSalarios = 0;
        Double  SEM = 0.0925;
        Double IVM = 0.0508;
        Double rebajoSEM;
        Double rebajoIVM;
        Double rebajos;
        
        System.out.println("Bienvenidos ");
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int numEmpleados= sc.nextInt();
        
        for (int i = 1; i <= numEmpleados; i++) {
            System.out.print("Salario del empleado " + i + ": ");
            double salario = sc.nextDouble();
            sumaDeSalarios += salario;  
        }
        rebajoSEM = sumaDeSalarios * SEM;
        rebajoIVM = sumaDeSalarios * IVM;
        rebajos = (rebajoSEM+rebajoIVM);
        
        
                
        System.out.println("La empresa deberá abonar a la CCSS el monto de " + rebajos + " por concepto de SEM y IVM");
    }
    
}
