package com.theisland.Island.Map;

import java.lang.reflect.InvocationTargetException;

public class TheIsland {
    Location[][] map;

    public TheIsland(int x, int y) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        map = new Location[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                map[i][j] = new Location();
            }
        }
    }


    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        TheIsland theIsland = new TheIsland(200, 20);
        System.out.println("");
    }
}
