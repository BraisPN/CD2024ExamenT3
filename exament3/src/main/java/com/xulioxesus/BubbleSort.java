package com.xulioxesus;

/**
 * Clase en la que tenemos un metodo de ordenacion de burbuja.
 */
public class BubbleSort {

    /**
     * Este método ordena una lista de números.
     * @param listaNumeros Lista de números a ordenar
     * @param cantidade Cantidad de números de la lista
     */
    public void ordenar(int[] listaNumeros, int cantidade) {
        for (int i = 0; i < cantidade - 1; i++) {
            boolean intercambiado = false;
            for (int j = 0; j < cantidade - i - 1; j++) {
                if (listaNumeros[j] > listaNumeros[j + 1]) {
                    int auxiliar = listaNumeros[j];
                    listaNumeros[j] = listaNumeros[j + 1];
                    listaNumeros[j + 1] = auxiliar;
                    intercambiado = true;
                }
            }
            if (!intercambiado) {
                break;
            }
        }
    }
}
