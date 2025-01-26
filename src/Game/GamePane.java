package Game;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;

public class GamePane extends BorderPane {
    private Board board;
    private PlayerTabs playerTabs;
    private Button reset, quit;

    public GamePane(int size, String playerNames[], String roleNames[]) {
        super();

        Label newLabel = new Label("Plateau de Jeu");
        reset = new Button("Reset");
        quit= new Button("Quit");
        board = new Board(size);
        playerTabs = new PlayerTabs(playerNames, roleNames);

        Region espaceur = new Region();
        Region space = new Region();
        VBox.setVgrow(espaceur, Priority.ALWAYS);
        HBox.setHgrow(space, Priority.ALWAYS);
        HBox buttons = new HBox(reset, space,quit);
        VBox leftPane = new VBox(newLabel, board, espaceur,buttons);

        //pour que les deux parties soient de la même taille
        leftPane.prefWidthProperty().bind(this.widthProperty().divide(2));
        playerTabs.prefWidthProperty().bind(this.widthProperty().divide(2));
        //CSS
        quit.setMaxWidth(100);
        reset.setMaxWidth(100);

        leftPane.setPadding(new Insets(10, 5, 10, 5));
        leftPane.setAlignment(Pos.CENTER);


        setLeft(leftPane);
        setCenter(playerTabs);
    }

    public void selectTab(int tab) {
        playerTabs.setSelected(tab);
    }

    public void setRole(int tab, int role) {
        playerTabs.setPlayerRole(tab, role);
    }

    public void disableRole(int role, boolean b){
        playerTabs.setPlayerRoleChoiceDisable(role, b);
    }

    public void addChar(int caseNumberx, int caseNumbery, char c){
        board.setCell(c, caseNumberx, caseNumbery, "#00FFFF");
    }

    public void resetCell(int caseNumberx, int caseNumbery){
        board.resetCell(caseNumberx, caseNumbery);
    }

    public Button getResetButton(){
        return reset;
    }

    public Button getQuitButton(){
        return quit;
    }

    public Button getPlayerButtonUp(int i){
        return playerTabs.getPlayerButtonUP(i);
    }

    public Button getPlayerButtonDown(int i){
        return playerTabs.getPlayerButtonDown(i);
    }

    public Button getPlayerButtonLeft(int i){
        return playerTabs.getPlayerButtonLeft(i);
    }

    public Button getPlayerButtonRight(int i){
        return playerTabs.getPlayerButtonRight(i);
    }
}
