/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Margaritas {

    public static void main(String[] args) {

        // Se declaran las variables
        Scanner teclado = new Scanner(System.in);
        String repeticion;
        int dado;
        int numMargaritas;
        int hojasDeMargaritas;
        boolean meQuiereSiONo;
        String resultado;

        do {

            numMargaritas = UtilidadesMargaritas.leerNumeroMargaritas();
            System.out.println("Numero margaritas " + numMargaritas);

            hojasDeMargaritas = UtilidadesMargaritas.leerHojasMargarita(numMargaritas);
            System.out.println("Tiene " + hojasDeMargaritas + " hojas");

            dado = UtilidadesMargaritas.dadoTirado();
            System.out.println("Has tirado el dado y ha salido " + dado);

            meQuiereSiONo = UtilidadesMargaritas.meQuiereONo(dado);

            resultado = UtilidadesMargaritas.resultadoFinal(meQuiereSiONo, hojasDeMargaritas);
            System.out.println("El resultado final es " + resultado);

            // Una vez terminado se pregunta si se quiere repetir o no
            do {

                System.out.println("¿Quieres repetir?, escribe si o no");
                repeticion = teclado.nextLine();

            } while (!repeticion.equalsIgnoreCase("si") && !repeticion.equalsIgnoreCase("no"));

            // El programa se repite mientras se quiera repetir   
        } while (repeticion.equalsIgnoreCase("si"));

        // Si no se quiere repetir el programa se despide
        if (repeticion.equalsIgnoreCase("no")) {

            System.out.println("ADIOS");

        }

    }

}
