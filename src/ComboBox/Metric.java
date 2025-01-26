package ComboBox;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class Metric extends BorderPane {
    public Metric() {
        super();

        VBox left = createHbox("Metric");
        VBox right = createHbox("Imperial");

        Image arrowImage = new Image(getClass().getResourceAsStream("Icon/images.png"));
        Image arrowImage2 = new Image(getClass().getResourceAsStream("Icon/images_right.png"));

        ImageView arrowIcon = new ImageView(arrowImage);
        ImageView arrowIcon2 = new ImageView(arrowImage2);

        arrowIcon.preserveRatioProperty().set(true);
        arrowIcon2.setPreserveRatio(true);

        arrowIcon.fitWidthProperty().bind(widthProperty().multiply(0.2));
        arrowIcon.fitHeightProperty().bind(heightProperty().multiply(0.2));

        arrowIcon2.fitWidthProperty().bind(widthProperty().multiply(0.2));
        arrowIcon2.fitHeightProperty().bind(heightProperty().multiply(0.2));

        Button update = new Button("", arrowIcon);
        Button update2 = new Button("", arrowIcon2);

        update.setMaxWidth(Double.MAX_VALUE);
        update2.setMaxWidth(Double.MAX_VALUE);

        VBox center = new VBox(update, update2);
        center.setSpacing(10);

        setLeft(left);
        setRight(right);
        setCenter(center);
    }

    private VBox createHbox(String title) {
        VBox hbox = new VBox();
        hbox.setPadding(new Insets(5, 5, 5, 5));
        hbox.setSpacing(10); // Ajout de l'espacement entre les éléments

        hbox.prefWidthProperty().bind(this.widthProperty().multiply(0.45));
        hbox.maxWidthProperty().bind(this.widthProperty().multiply(0.45));

        Label label = new Label(title);

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(" ");
        comboBox.maxWidthProperty().bind(hbox.widthProperty().multiply(0.7));

        Label label1 = new Label("0,00");
        label1.setStyle("-fx-border-color: black; -fx-background-color: gray");
        label1.setAlignment(Pos.CENTER_RIGHT);
        label1.setMaxWidth(Double.MAX_VALUE);

        hbox.getChildren().addAll(label, comboBox, label1);
        return hbox;
    }
}
