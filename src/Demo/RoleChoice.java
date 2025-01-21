package Demo;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

class RoleChoice extends VBox {
    private RadioButton[] roleButtons;
    private ToggleGroup toggleGroup;

    public RoleChoice(String[] roles) {
        toggleGroup = new ToggleGroup();
        roleButtons = new RadioButton[roles.length];

        for (int i = 0; i < roles.length; i++) {
            roleButtons[i] = new RadioButton(roles[i]);
            roleButtons[i].setToggleGroup(toggleGroup);
            this.getChildren().add(roleButtons[i]);
        }
    }

    public void setRole(int i) {
        if (i >= 0 && i < roleButtons.length) {
            roleButtons[i].setSelected(true);
        }
    }

    public String[] getRoles() {
        String[] roles = new String[roleButtons.length];
        for (int i = 0; i < roleButtons.length; i++) {
            roles[i] = roleButtons[i].getText();
        }
        return roles;
    }
}
