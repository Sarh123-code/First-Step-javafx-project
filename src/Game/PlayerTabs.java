package Game;

import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class PlayerTabs extends TabPane {
    private Tab tabs[];
    private PlayerTab playerTab[];

    public PlayerTabs(String playerNames[], String roleNames[]){
        super();
        tabs = new Tab[playerNames.length];
        playerTab = new PlayerTab[roleNames.length];

        for(int i = 0; i < playerNames.length; i++){
            tabs[i] = new Tab(i + " : "+playerNames[i]);
            playerTab[i] = new PlayerTab(roleNames);
            tabs[i].setContent(playerTab[i]);
            this.getTabs().add(tabs[i]);
        }
        this.setStyle("-fx-border-width: 3; -fx-border-color: blue; -fx-border-radius: 5;");
    }

    public void setSelected(int i){
        this.getSelectionModel().select(i);
    }

    public void setPlayerRole(int i, int role){
        setSelected(i);
        playerTab[i].setRole(role);
    }

    public void setPlayerRoleChoiceDisable(int i, boolean b){
        setSelected(i);
        playerTab[i].setRoleChoiceDisable(b);
    }

    Button getPlayerButtonUP(int i){
        setSelected(i);
        return playerTab[i].getButtonUp();
    }

    Button getPlayerButtonDown(int i){
        setSelected(i);
        return playerTab[i].getButtonDown();
    }

    Button getPlayerButtonLeft(int i){
        setSelected(i);
        return playerTab[i].getButtonLeft();
    }

    Button getPlayerButtonRight(int i){
        setSelected(i);
        return playerTab[i].getButtonRight();
    }
}
