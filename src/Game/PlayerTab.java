package Game;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class PlayerTab extends VBox {
    private String nameRoles[];
    private Direction direction;
    private RoleChoice roles;

    public PlayerTab(String nameRoles[]) {
        super();

        this.nameRoles = nameRoles;
        Region spring = new Region();
        VBox.setVgrow(spring, Priority.ALWAYS);
        spring.setMaxHeight(150);

        direction = new Direction();
        roles = new RoleChoice(nameRoles);

        direction.setStyle("-fx-border-width: 3; -fx-border-color: gold; -fx-border-radius: 5;");
        direction.setMaxWidth(200);

        this.setStyle("-fx-border-width: 3; -fx-border-color: green; -fx-border-radius: 5;");
        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(roles, spring,direction);
    }

    public void setRole(int i){
        roles.setRole(i);
    }

    public void setRoleChoiceDisable(boolean b){
        roles.setDisable(b);
    }

    public Button getButtonUp(){
        return direction.getButtonUp();
    }

    public Button getButtonDown(){
        return direction.getButtonDown();
    }

    public Button getButtonLeft(){
        return direction.getButtonLeft();
    }

    public Button getButtonRight(){
        return direction.getButtonRight();
    }
}
