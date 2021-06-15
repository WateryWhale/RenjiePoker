package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class gamescreenController {
    static RenjiePoker r = new RenjiePoker("Dylan");
    @FXML void handleDealButtonAction(ActionEvent event){


    }
    @FXML void handleSubmitButtonAction(javafx.event.ActionEvent event){
        for(int i = 0; i < 52; i++){
            System.out.println(r.mainDeck.deck[i]);
        }
    }


}
