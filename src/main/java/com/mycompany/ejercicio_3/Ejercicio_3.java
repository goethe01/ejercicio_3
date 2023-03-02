/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_3;
import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Horas, RazonH, SalaBruto;
        float PorRetenFuente,SalaNeto,RetenFuente;
        
        Horas = entrada.nextInt();
        RazonH = entrada.nextInt();
        PorRetenFuente = entrada.nextFloat();
        
        SalaBruto = Horas*RazonH;
        RetenFuente = (PorRetenFuente*SalaBruto)/100;
        SalaNeto = SalaBruto-RetenFuente;
        
        System.out.println("EL SALARIO BRUTO ES DE: "+SalaBruto);
        System.out.println("LA RETENCION EN LA FUETE ES DE: "+RetenFuente);
        System.out.println("EL SALARIO NETO DEL TRABAJADOR ES DE: "+SalaNeto);
    }
}
