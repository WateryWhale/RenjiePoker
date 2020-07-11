package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {
    RenjiePoker r;
    @FXML void handleSubmitButtonAction(ActionEvent event){
        for(int i = 0; i < 52; i++){
            System.out.println(r.mainDeck.deck[i]);
        }
    }

    @FXML protected void handlePlayButtonAction(ActionEvent event){
        r = new RenjiePoker("Dylan");
    }
    @FXML protected void handleTestTurnButtonAction(ActionEvent event){
        r.testTurn();
    }
}
