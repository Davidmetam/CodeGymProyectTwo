package com.theisland.Island.Map;

public class BoardSettings {
    private Board board;
    static class Board{
        private int rows;
        private int columns;

        public int getRows() {
            return rows;
        }

        public void setRows(int rows) {
            this.rows = rows;
        }

        public int getColumns() {
            return columns;
        }

        public void setColumns(int columns) {
            this.columns = columns;
        }
    }
}
