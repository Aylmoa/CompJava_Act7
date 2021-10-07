package com.company;
import java.util.ArrayList;

public class Calculos {
    private int numero;
    public ArrayList<Integer> pogi = new ArrayList<Integer>();

    public Calculos() {}

    public Calculos(int num) {
        this.numero = num;
        Primos();//Calcula al inicializarse los numeros primos
    }

    public ArrayList<Integer> Primos() {//Metodo que junta los numeros que son primos dentro de un ArrayList
        for (int i = 0; i < numero; i++) {
            if (esPrimo(i) == 0) {//Si se obtiene un 0 en el metodo esPrimo es primo
                pogi.add((Integer) i);
            }
        }
        return pogi;
    }

    private int esPrimo(int num) {//Metodo que hace el caluclo para determinar si es numero primo o no
        if (num == 0 || num == 1 || num == 4) return 1;
        for (int j = 2; j < num / 2; j++) {
            if (num % j == 0) return 1;//El 1 sirve para saber si no es primo
        }
        return 0;
    }

    public ArrayList<Integer> fibo() {//Guarda el resultado de la secuencia de fibonacci en un ArrayList
        ArrayList<Integer> nacci = new ArrayList<>();
        for (int i = 0; i < numero; i++) {
            nacci.add(fibonacii(i)) ;}
        return nacci;
    }

    private int fibonacii(int n) {//Calcula la secuencia de fibonacci
        if (n==0 || n==1) {
            return n;
        } else
            return fibonacii(n - 1)+fibonacii(n-2);
    }

    public void mostrarNum() {//Metodo que muestra las listas
        Object[] primos=this.pogi.toArray();//Cambia de Arraylist a array para facilitar como lo muestro
        System.out.println("---Numeros Primos---");
        for (int i = 0; i < primos.length; i++) {
            System.out.println(primos[i]);
        }
        System.out.println("---Secuencia de Fibonacci");
        Object[] ita=this.fibo().toArray();//Cambia de Arraylist a array para facilitar como lo muestro
        for (int i = 0; i < ita.length; i++) {
            System.out.println(ita[i]);
        }
    }
}