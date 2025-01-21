package Demo;

import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;

public class Board extends GridPane {
    private int size;
    private Label[][] cells;

    public Board(int size) {
        this.size = size;
        cells = new Label[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Label cell = new Label(" ");
                cell.setMinSize(50, 50);
                cell.setStyle("-fx-border-color: red; -fx-alignment: center;");
                cell.setAlignment(Pos.CENTER);
                cells[i][j] = cell;
                this.add(cell, j, i);
            }
        }
    }

    public void setCell(char val, int x, int y, String numberColor) {
        if (x >= 0 && x < size && y >= 0 && y < size) {
            cells[x][y].setText(String.valueOf(val));
            cells[x][y].setStyle("-fx-border-color: red; -fx-alignment: center; -fx-background-color: " + numberColor + ";");
        }
    }

    public void resetCell(int x, int y) {
        if (x >= 0 && x < size && y >= 0 && y < size) {
            cells[x][y].setText(" ");
            cells[x][y].setStyle("-fx-border-color: red; -fx-alignment: center; -fx-background-color: red;");
        }
    }
}

