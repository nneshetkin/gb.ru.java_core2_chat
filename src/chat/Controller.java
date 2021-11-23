package chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
   @FXML
    TextArea mainTextArea;
   @FXML
    TextField interTextArea ;
   public void btnClick(ActionEvent actionEvent){
       mainTextArea.appendText(interTextArea.getText()+"\n");
       interTextArea.clear();
   }

    public void PreesEnter(ActionEvent actionEvent) {
        mainTextArea.appendText(interTextArea.getText()+"\n");
        interTextArea.clear();
    }
}
