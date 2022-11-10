/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dario
 */
public class UtilidadesMargaritas {

    private static Random aleatorio = new Random();
    private static Scanner teclado = new Scanner(System.in);

    // Generador de tiradas del dado
    public static int dadoTirado() {
        int resultadoDado = 0;

        resultadoDado = aleatorio.nextInt(1, 6 + 1);
        return resultadoDado;

    }

    // Se ve si se empieza con me quiere o con no me quiere
    public static boolean meQuiereONo(int dadoTirado) {

        boolean meQuiere = true;

        switch (dadoTirado) {
            case 1:
                System.out.println("La tirada fue 1 y empieza con no me quiere");
                meQuiere = false;
                break;

            case 2:
                System.out.println("La tirada fue 2 y empieza con me quiere");
                meQuiere = true;
                break;

            case 3:
                System.out.println("Has sacado 3 así que se repite");
                dadoTirado = aleatorio.nextInt(1, 6 + 1);

                switch (dadoTirado) {
                    case 1:
                        System.out.println("La tirada fue 1 y empieza con no me quiere");
                        meQuiere = false;
                        break;

                    case 2:
                        System.out.println("La tirada fue 2 y empieza con me quiere");
                        meQuiere = true;
                        break;

                    case 3:
                        System.out.println("Has vuelto a sacar 3 y empieza con no me quiere");
                        meQuiere = false;
                        break;

                    case 4:
                        System.out.println("La tirada fue 2 y empieza con me quiere");
                        meQuiere = true;
                        break;

                    case 5:
                        System.out.println("La tirada fue 5 y empieza con no me quiere");
                        meQuiere = false;
                        break;

                    case 6:
                        System.out.println("La tirada fue 2 y empieza con me quiere");
                        meQuiere = true;
                        break;
                    default:
                }
                break;

            case 4:
                System.out.println("La tirada fue 4 y empieza con me quiere");
                meQuiere = true;
                break;

            case 5:
                System.out.println("La tirada fue 5 y empieza con no me quiere");
                meQuiere = false;
                break;

            case 6:
                System.out.println("La tirada fue 6 y empieza con me quiere");
                meQuiere = true;
                break;
            default:
        }

        return meQuiere;

        // FORMA DE LA QUE NO ME HA SALIDO BIEN
//        if (dadoTirado % 2 == 0) {
//
//            System.out.println("La tirada fue " + dadoTirado + " y empieza con me quiere");
//            meQuiere = true;
//            return meQuiere;
//
//        } else if (dadoTirado % 2 != 0) {
//
//            System.out.println("La tirada fue " + dadoTirado + " y empieza con no me quiere");
//            meQuiere = false;
//            return meQuiere;
//
//        } else if (dadoTirado == 3) {
//            System.out.println("Has sacado 3, así que vuelves a tirar el dado");
//            dadoTirado = aleatorio.nextInt(1, 6 + 1);
//            return meQuiere;
//        }
//        return meQuiere;
    }

    // Leer el número de margaritas a evaluar
    public static int leerNumeroMargaritas() {
        int numeroMargaritas = 0;
        boolean repetir = true;

        do {

            System.out.println("Introduce el número de margaritas del 1 al 10");

            try {
                numeroMargaritas = teclado.nextInt();
                repetir = false;
            } catch (InputMismatchException ime) {
                System.out.println("No has introducido el número correctamente");
                // Limpio búffer
                teclado.nextLine();
            }

        } while (repetir);
        return numeroMargaritas;

    }

    // Leer hojas margarita
    public static int leerHojasMargarita(int leerNumeroMargaritas) {
        int hojasMargarita = 0;
        boolean repetir2 = true;

        do {
            System.out.println("¿Cuántas hojas tiene la margarita?");

            try {
                hojasMargarita = teclado.nextInt();
                repetir2 = false;
            } catch (InputMismatchException ime) {
                System.out.println("No has introducido el número correctamente");
                // Limpio búffer
                teclado.nextLine();

            }
        } while (repetir2);
        return hojasMargarita;

        // FORMA DE LA QUE NO ME HA SALIDO BIEN
        //        for (int i = 1; leerNumeroMargaritas < 10; i++) {
        //
        //            System.out.println("¿Cuántas hojas tiene la margarita Nº" + i + "?");
        //
        //            hojasMargarita = teclado.nextInt();
        //
        //        }
        //
        //        return hojasMargarita;
    }

    // Se calcula el resultado final
    public static String resultadoFinal(boolean meQuiereONo, int leerHojasMargarita) {
        String resultadoFinal = "";

        if (meQuiereONo = true && leerHojasMargarita % 2 == 0) {

            resultadoFinal = "no me quiere";

        } else if (meQuiereONo = true && leerHojasMargarita % 2 != 0) {

            resultadoFinal = "me quiere";

        } else if (meQuiereONo = false && leerHojasMargarita % 2 == 0) {

            resultadoFinal = "me quiere";

        } else if (meQuiereONo = false && leerHojasMargarita % 2 != 0) {

            resultadoFinal = "no me quiere";

        }

        return resultadoFinal;

    }

}
