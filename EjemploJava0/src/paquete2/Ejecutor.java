/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Edificio;
import paquete1.Vehiculo;
import paquete1.Empresa;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio central");
        edf1.establecerCostos(20000);
        edf1.calcularCostoPredio();
        
        Edificio edf2 = new Edificio("Edificio norte");
        edf2.establecerCostos(30000);
        edf2.calcularCostoPredio();
        Edificio edf3 = new Edificio("Edificio sur");
        edf3.establecerCostos(10000);
        edf3.calcularCostoPredio();
        Edificio edf4 = new Edificio("Edificio secundario");
        edf4.establecerCostos(5000);
        edf4.calcularCostoPredio();
        
        Edificio [] listaEdificios = {edf1, edf2, edf3, edf4};
        // double c = listaEdificios[2].obtenerCosto();
        //System.out.println(c);
        
        // Crear una arreglo de 5 elementos de tipo Vehiculo
        Vehiculo v1 = new Vehiculo("Auto","LBB0011",10000);
        Vehiculo v2 = new Vehiculo("Camioneta","LCB0011",20000);
        Vehiculo v3 = new Vehiculo("Auto","LBD0012",6000);
        Vehiculo v4 = new Vehiculo("Camioneta","LCC0011",10000);
        Vehiculo v5 = new Vehiculo("Camioneta","LDC0011",25000);
        
        Vehiculo [] listaVehiculos = {v1,v2,v3,v4,v5};
        
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        Empresa miempresa = new Empresa();
        miempresa.establecerNombre("Empresa de Hojas");
        miempresa.establecerEdificios(listaEdificios);
        miempresa.establecerVehiculos(listaVehiculos);
        miempresa.establecerCostosBienesInmuebles();
        miempresa.establecerCostoVehiculos();
        miempresa.calcularCostoTotalBienes();
        miempresa.establecerCostoTotalPagoPredio();
        // Imprimir el costo de los bienes inmuebles de la empresa  
        // System.out.printf("%.2f\n", miempresa.obtenerCostosBienesInmuebles());
        System.out.printf("%s\n", miempresa);
    }
}
