package Ramp;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class RampUp extends HBox {

    public RampUp(int size) {
        super();
        setAlignment(Pos.BOTTOM_LEFT);
        setSpacing(0); // Important: Remove default spacing between HBox elements

        int margin = 0;
        for (int i = 0; i < size; i++) {
            for (int l = 0; l < 10; l++) {
                VBox vbox = new VBox(new Label("" + i), new Label("" + l));
                vbox.setMaxHeight(34);
                vbox.setStyle("-fx-font-size: 13; -fx-border-color: black");
                margin++;

                HBox.setMargin(vbox, new Insets(0, 0, margin, 0)); // Calculate margin based on index l

                getChildren().add(vbox);
            }
        }
    }
}