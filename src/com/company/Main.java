package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cual es el numero qu desea que se obtengan sus `rimos y su susesion de fibonacci?: ");
        Calculos muestra = new Calculos(sc.nextInt());//Lee el numero n para hacer las secuencias
        muestra.mostrarNum();//Metodo que muestra las dos listas con los resultados
    }
}