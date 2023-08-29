/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2exc5;

/**
 *
 * @author oazambranoa
 */

/*Enunciado
Ejercicio resuelto Nº 10
Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los
siguientes datos:
• Número de inscripción
• Nombres
• Patrimonio.
• Estrato social.
La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio
es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3%
sobre el patrimonio. Hacer un algoritmo que muestre:
• Número de inscripción.
• Nombres.
• Pago de matrícula. 

*/

import java.util.Scanner;

public class Actividad2Exc5 {

    public static void main(String[] args) {
        int insNumber, socialSt;
        double stPatrimonio, pagMat;
        String stName;
        
        System.out.println("Ingrese el(los) nombre(s) del estudiante: ");
        Scanner nombreEstu = new Scanner(System.in);
        stName = nombreEstu.nextLine();
        
        System.out.println("Ingrese el numero de inscripcion: ");
        Scanner numeroIns = new Scanner(System.in);
        insNumber = numeroIns.nextInt();
        
        System.out.println("Ingrese el patrimonio total: ");
        Scanner patrimonio = new Scanner(System.in);
        stPatrimonio = patrimonio.nextDouble();
        
        System.out.println("Ingrese el estrato social: ");
        Scanner estrato = new Scanner(System.in);
        socialSt = estrato.nextInt();
        
        pagMat = 50000;
        
        if ((stPatrimonio > 2000000) && (socialSt > 3)){
            pagMat = pagMat + (0.03 * stPatrimonio);      
        }
        
        System.out.println("El estudiante con numero de inscripcion " + insNumber + " y nombre " + stName + ", debe pagar $" + pagMat);
    }
}
