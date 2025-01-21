package Demo;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

class Direction extends VBox {
    private Button upButton, downButton, leftButton, rightButton;

    public Direction() {
        upButton = new Button("Up");
        downButton = new Button("Down");
        leftButton = new Button("Left");
        rightButton = new Button("Right");

        this.getChildren().addAll(upButton, leftButton, rightButton, downButton);
        this.setStyle("-fx-border-color: gold; -fx-padding: 10; -fx-spacing: 10;");
    }

    public Button getButtonUp() {
        return upButton;
    }

    public Button getButtonDown() {
        return downButton;
    }

    public Button getButtonLeft() {
        return leftButton;
    }

    public Button getButtonRight() {
        return rightButton;
    }
}
