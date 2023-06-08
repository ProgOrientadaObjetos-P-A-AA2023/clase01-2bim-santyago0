/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {
    public static void main(String[] args) {
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean condicion = true;
        while(condicion) {
            System.out.printf("\n%s\n\n%s\n%s\n%s\n\n%s",
                    "--Menú de Opciones--",
                    "1) Ingresar un Estudiante Distancia",
                    "2) Ingresar un Estudiante Presencial",
                    "3) Salir",
                    "Elija una opción: ");
            
            int opcion;
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch(opcion) {
                case 1:
                    System.out.println("Ingrese nombres");
                    String nombres = entrada.nextLine();
                    System.out.println("Ingrese apellidos");
                    String apellidos = entrada.nextLine();
                    System.out.println("Ingrese identificación");
                    String identificacion = entrada.nextLine();
                    System.out.println("Ingrese edad");
                    int edad = entrada.nextInt();
                    System.out.println("Ingrese número de asignaturas");
                    int asignaturas = entrada.nextInt();
                    System.out.println("Ingrese costo asignatura");
                    double costoAsignatura = entrada.nextDouble();
                    EstudianteDistancia estudianteD = new EstudianteDistancia();

                    estudianteD.establecerNombresEstudiante(nombres);
                    estudianteD.establecerApellidoEstudiante(apellidos);
                    estudianteD.establecerEdadEstudiante(edad);
                    estudianteD.establecerIdentificacionEstudiante(
                            identificacion);
                    estudianteD.establecerNumeroAsginaturas(asignaturas);
                    estudianteD.establecerCostoAsignatura(costoAsignatura);
                    estudianteD.calcularMatriculaDistancia();

                    System.out.printf("\n%s\n", estudianteD);
                    break;
                case 2:
                    System.out.println("Ingrese nombres");
                    nombres = entrada.nextLine();
                    System.out.println("Ingrese apellidos");
                    apellidos = entrada.nextLine();
                    System.out.println("Ingrese identificación");
                    identificacion = entrada.nextLine();
                    System.out.println("Ingrese edad");
                    edad = entrada.nextInt();
                    System.out.println("Ingrese número de creditos");
                    asignaturas = entrada.nextInt();
                    System.out.println("Ingrese costo credito");
                    costoAsignatura = entrada.nextDouble();
                    EstudiantePresencial estudianteP = 
                            new EstudiantePresencial();

                    estudianteP.establecerNombresEstudiante(nombres);
                    estudianteP.establecerApellidoEstudiante(apellidos);
                    estudianteP.establecerEdadEstudiante(edad);
                    estudianteP.establecerIdentificacionEstudiante(
                            identificacion);
                    estudianteP.establecerNumeroCreditos(asignaturas);
                    estudianteP.establecerCostoCredito(costoAsignatura);
                    estudianteP.calcularMatriculaPresencial();

                    System.out.printf("\n%s\n", estudianteP);
                    break;
                case 3:
                    System.err.println("Saliendo del programa...");
                    condicion = false;
                    break;
                default:
                    System.out.println("Opción incorrecta...");
            }
        }
        
    }
}
