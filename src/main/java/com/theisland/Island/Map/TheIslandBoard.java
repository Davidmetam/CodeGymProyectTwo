package com.theisland.Island.Map;

import com.theisland.Island.FactoryAnimalType.Animal;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TheIslandBoard {
    ExecutorService executorService = Executors.newFixedThreadPool(5);

    private static int filas;
    private static int columnas;
    static Location[][] map;

    public TheIslandBoard(int filas, int columnas) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        TheIslandBoard.filas = filas;
        TheIslandBoard.columnas = columnas;
        map = new Location[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                map[i][j] = new Location();
            }
        }
        executorService.execute(new Runnable() {

            public void getAnimalCount(){
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        Location location = map[i][j];
                        HashMap<Class<? extends Animal>, List<Animal>> animals = location.getAnimals();
                        for (Map.Entry<Class<? extends Animal>, List<Animal>> entry : animals.entrySet()){

                        }
                    }
                }
            }
            @Override
            public void run() {
                getAnimalCount();
            }
        });
    }

    public static int getFilas() {
        return filas;
    }

    public static int getColumnas() {
        return columnas;
    }

    public void life() {
        int partes = 4;
        int total = filas;
        int tamañoParte = total / partes;

        for (int i = 1; i <= partes; i++) {
            int inicio = (i - 1) + tamañoParte + 1;
            int fin = i + tamañoParte;
            Runnable runnable = new tareaLocalizaciones(inicio, fin);
            executorService.execute(runnable);

        }
    }

}

class tareaLocalizaciones implements Runnable {

    private int filasInicio;
    private int filasFin;

    public tareaLocalizaciones(int filasInicio, int filasFin) {
        this.filasInicio = filasInicio;
        this.filasFin = filasFin;
    }

    @Override
    public void run() {
        for (int i = filasInicio; i < filasFin; i++) {
            for (int j = 0; j < TheIslandBoard.getColumnas(); j++) {
                Location location = TheIslandBoard.map[i][j];
                location.run();
            }
        }
    }


    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        int turnos;
        TheIslandBoard theIsland = new TheIslandBoard(100, 20);
        System.out.println("Cuantos turnos desea ejecutar:");
        turnos = scanner.nextInt();
        for (int i = turnos; i == 0; i--) {
            theIsland.life();
        }

    }
}
