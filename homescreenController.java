package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

public class homescreenController {
    RenjiePoker r;
    @FXML void handleSubmitButtonAction(ActionEvent event){
        for(int i = 0; i < 52; i++){
            System.out.println(r.mainDeck.deck[i]);
        }
    }

    @FXML protected void handlePlayButtonAction(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gamescreen.fxml"));
        Stage primaryStage = Main.primaryStage;
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
        r = new RenjiePoker("Dylan");
    }
    @FXML protected void handleTestTurnButtonAction(ActionEvent event){
        r.testTurn();
    }
}
