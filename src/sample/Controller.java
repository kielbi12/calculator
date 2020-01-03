package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Set;


public class Controller implements Initializable {

    @FXML
    public TextField textField;
    @FXML
    public Button zero;
    @FXML
    public Button one;
    @FXML
    public Button two;
    @FXML
    public Button three;
    @FXML
    public Button four;
    @FXML
    public Button five;
    @FXML
    public Button six;
    @FXML
    public Button seven;
    @FXML
    public Button eight;
    @FXML
    public Button nine;
    @FXML
    public Button clear;
    @FXML
    public Button delete;

    @FXML
    public void handleAction(ActionEvent action) {

        if (action.getSource() instanceof Button) {
            Button button = (Button) action.getSource();
            if (textField.getText().equals("0")) {
                textField.setText("");
                textField.setText(textField.getText() + button.getText());
            } else {
                textField.setText(textField.getText() + button.getText());
            }
        }
    }

    @FXML
    public void clearTextField(ActionEvent action) {
        if (action.getSource() == clear) {
            String clear = "0";
            textField.setText(clear);
        }
    }

    @FXML
    public void deleteOneCharFromTextField(ActionEvent action) {
        if (action.getSource() == delete) {
            String text = textField.getText();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.deleteCharAt(text.length());
            String newText = stringBuilder.toString();
            textField.setText(newText);
        }
    }


//    @FXML
//    public void handleAction(ActionEvent action) {
//
//        if (action.getSource() == one) {
//            if (textLabel.getText().equals("0")) {
//                textLabel.setText("");
//                textLabel.setText(textLabel.getText() + one.getText());
//            } else {
//                textLabel.setText(textLabel.getText() + one.getText());
//            }
//        }
//        if (action.getSource() == two) {
//            if (textLabel.getText().equals("0")) {
//                textLabel.setText("");
//                textLabel.setText(textLabel.getText() + two.getText());
//            } else {
//                textLabel.setText(textLabel.getText() + two.getText());
//            }
//        }
//        if (action.getSource() == three) {
//            if (textLabel.getText().equals("0")) {
//                textLabel.setText("");
//                textLabel.setText(textLabel.getText() + three.getText());
//            } else {
//                textLabel.setText(textLabel.getText() + three.getText());
//            }
//        }
//        if (action.getSource() == four) {
//            if (textLabel.getText().equals("0")) {
//                textLabel.setText("");
//                textLabel.setText(textLabel.getText() + four.getText());
//            } else {
//                textLabel.setText(textLabel.getText() + four.getText());
//            }
//        }
//        if (action.getSource() == five) {
//            if (textLabel.getText().equals("0")) {
//                textLabel.setText("");
//                textLabel.setText(textLabel.getText() + five.getText());
//            } else {
//                textLabel.setText(textLabel.getText() + five.getText());
//            }
//        }
//        if (action.getSource() == six) {
//            if (textLabel.getText().equals("0")) {
//                textLabel.setText(textLabel.getText() + six.getText());
//            } else {
//                textLabel.setText(textLabel.getText() + six.getText());
//            }
//        }
//        if (action.getSource() == seven) {
//            if (textLabel.getText().equals("0")) {
//                textLabel.setText(textLabel.getText() + seven.getText());
//            } else {
//                textLabel.setText(textLabel.getText() + seven.getText());
//            }
//        }
//        if (action.getSource() == eight) {
//            if (textLabel.getText().equals("0")) {
//                textLabel.setText(textLabel.getText() + eight.getText());
//            } else {
//                textLabel.setText(textLabel.getText() + eight.getText());
//            }
//
//        }
//        if (action.getSource() == nine) {
//            if (textLabel.getText().equals("0")) {
//                textLabel.setText(textLabel.getText() + nine.getText());
//            } else {
//                textLabel.setText(textLabel.getText() + nine.getText());
//            }
//        }
//        if (action.getSource() == zero) {
//            if (textLabel.getText().equals("0")) {
//                textLabel.setText(textLabel.getText() + zero.getText());
//            } else {
//                textLabel.setText(textLabel.getText() + zero.getText());
//            }
//        }
//
//    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
