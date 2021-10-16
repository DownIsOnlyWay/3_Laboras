package com.company;

public class Main {

    public static void main(String[] args) {
        int[] masyvas = {-20, 20, -1, 88, 45, -8, 10, 5, 9, 10};
        System.out.println("Pradinis Masyvas: ");
        spausdinimas(masyvas);
        lygSkaiciuVidurkis(masyvas);
        sukeitimas(masyvas, min(masyvas), max(masyvas));

        System.out.println("Masyvas po didziausio ir maziausio skaiciaus sukeitimo: ");
        spausdinimas(masyvas);

    }

    public static void lygSkaiciuVidurkis(int[] masyvas) {
        double vid;

        vid = suma(masyvas) / kiekis(masyvas);
        ;
        System.out.println("Lygyniu skaiciu vidurkis:  " + vid);
    }

    public static int suma(int[] masyvas) {
        int suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] % 2 == 0)
                suma += masyvas[i];
        }
        return suma;
    }

    public static int kiekis(int[] masyvas) {
        int kiek = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] % 2 == 0)
                kiek++;
        }
        return kiek;
    }

    public static int min(int[] masyvas) {
        int minskaicius = 999999;
        int minIndex = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] < minskaicius) {
                minskaicius = masyvas[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int max(int[] masyvas) {
        int maxSkaicius = -9999999;
        int maxIndex = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > maxSkaicius) {
                maxSkaicius = masyvas[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int[] sukeitimas(int[] masyvas, int min, int max) {

        int elementas = masyvas[min];
        masyvas[min] = masyvas[max];
        masyvas[max] = elementas;
        return masyvas;
    }

    public static void spausdinimas(int[] masyvas) {
        for (int i = 0; i < masyvas.length; i++)
            System.out.print(masyvas[i] + " ");
        System.out.println();
    }
}
