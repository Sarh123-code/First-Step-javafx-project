package Game;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

public class RoleChoice extends VBox {
    private String roles[];
    private RadioButton buttons[];

    public RoleChoice(String roles []) {
        super();
        this.roles = roles;
        buttons = new RadioButton[roles.length];

        ToggleGroup group = new ToggleGroup();

        for(int i = 0; i < roles.length; i++) {
            buttons[i] = new RadioButton(roles[i]);
            buttons[i].setToggleGroup(group);
            buttons[i].setStyle("-fx-padding: 10;");
            this.getChildren().add(buttons[i]);
        }

    }

    public void setRole(int i){
        buttons[i].setSelected(true);
    }

    public String [] getRoles(){
        return roles;
    }

    public RadioButton[] getButtons(){
        return buttons;
    }
}
