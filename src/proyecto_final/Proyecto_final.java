/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_final;
import java.util.Scanner;
public class Proyecto_final {

    public static void main(String[] args) {
        //Declaramos las variables necesarias
        double compra1, compra2, compra3, compra_total, promedio;
        String nombre;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingresa nombre del cliente: ");
        nombre=lectura.next();
        System.out.println("Ingresa valor compra 1: ");
        compra1=lectura.nextDouble();
        System.out.println("Ingresa valor compra 2: ");
        compra2=lectura.nextDouble();
        System.out.println("Ingresa valor compra 3: ");
        compra3=lectura.nextDouble();
        //Primer linea de verificacion
        System.out.println("VERIFICANDO SI SE ACTUALIZA EL REPOSITORIO DE GITHUB");        
        //Procesando datos
        compra_total=compra1+compra2+compra3;
        promedio=compra_total/3;
        //Resultados
        System.out.println("La compra total es: "+compra_total);
        System.out.println("El promedio de compra es: "+promedio);
    }
    
}
