
/*
 * Javautveckling 2018
 */
package calculator_alm;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Calculator_ALM extends Application {

    Calculate calc = new Calculate();
    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDiv;
    Button btnFact;
    Button btnEnumber;
    Button btnPi;
    Button btnPower;

    @Override
    public void start(Stage primaryStage) {

        BorderPane bp = new BorderPane();

        Label label = new Label();
        label.setFont(Font.font("verdana", FontWeight.NORMAL, FontPosture.REGULAR, 20));

        label.setMinSize(175, 75);
        label.setTextAlignment(TextAlignment.RIGHT);

        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");

        Button btnC = new Button("C");
        Button btnE = new Button("=");

        btnFact = new Button("x!");
        btnEnumber = new Button("e");
        btnPi = new Button("π");
        btnPower = new Button("x^y");
        btnAdd = new Button("+");
        btnSub = new Button("-");
        btnMul = new Button("*");
        btnDiv = new Button("/");

        btn0.setMinSize(75, 75);
        btn1.setMinSize(75, 75);
        btn2.setMinSize(75, 75);
        btn3.setMinSize(75, 75);
        btn4.setMinSize(75, 75);
        btn5.setMinSize(75, 75);
        btn6.setMinSize(75, 75);
        btn7.setMinSize(75, 75);
        btn8.setMinSize(75, 75);
        btn9.setMinSize(75, 75);

        btnC.setMinSize(75, 75);
        btnE.setMinSize(75, 75);

        btnAdd.setMinSize(75, 75);
        btnSub.setMinSize(75, 75);
        btnMul.setMinSize(75, 75);
        btnDiv.setMinSize(75, 75);
        btnFact.setMinSize(75, 75);
        btnEnumber.setMinSize(75, 75);
        btnPi.setMinSize(75, 75);
        btnPower.setMinSize(75, 75);
        
        btn0.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btn1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btn2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btn3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btn4.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btn5.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btn6.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btn7.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btn8.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btn9.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btnE.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btnC.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btnAdd.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btnSub.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btnMul.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btnDiv.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btnFact.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btnEnumber.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btnPi.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        btnPower.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

        //Actionlisteners for numbers        
        btn0.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                temp += "0";

                label.setText(temp);
            }
        });

        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                temp += "1";

                label.setText(temp);
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                temp += "2";

                label.setText(temp);
            }
        });

        btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                temp += "3";

                label.setText(temp);
            }
        });

        btn4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                temp += "4";

                label.setText(temp);
            }
        });

        btn5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                temp += "5";

                label.setText(temp);
            }
        });

        btn6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                temp += "6";

                label.setText(temp);
            }
        });

        btn7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                temp += "7";

                label.setText(temp);
            }
        });

        btn8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                temp += "8";

                label.setText(temp);
            }
        });

        btn9.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                temp += "9";

                label.setText(temp);
            }
        });
        btnAdd.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                label.setText(temp + " + ");
                disableOperandButtons();
                btnPi.setDisable(false);
                btnEnumber.setDisable(false);
            }
        });
        btnSub.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                label.setText(temp + " - ");
                disableOperandButtons();
                btnPi.setDisable(false);
                btnEnumber.setDisable(false);
            }
        });
        btnDiv.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                label.setText(temp + " / ");
                disableOperandButtons();
                btnPi.setDisable(false);
                btnEnumber.setDisable(false);
            }
        });
        btnMul.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                label.setText(temp + " * ");
                disableOperandButtons();
                btnPi.setDisable(false);
                btnEnumber.setDisable(false);
            }
        });

        btnC.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                label.setText("");
                enableOperatorButtons();
            }
        });

        btnE.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                double firstNumber = calc.getNumbersFromString(label.getText())[0];
                double secondNumber = calc.getNumbersFromString(label.getText())[1];
                String function = calc.returnFunctionFromString(label.getText());
                String svaret = calc.calculate(firstNumber, function, secondNumber);

                label.setText(svaret);
                enableOperatorButtons();
            }
        });

        btnPi.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                temp += "3.14159265";

                label.setText(temp);
                btnEnumber.setDisable(true);
                btnPi.setDisable(true);
                
            }
        });

        btnEnumber.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                temp += "2.71828182";

                label.setText(temp);
                btnEnumber.setDisable(true);
                btnPi.setDisable(true);
                
            }
        });

        btnFact.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                temp += "!";

                label.setText(temp);
                btnPi.setDisable(false);
                btnEnumber.setDisable(false);
            }
        });
        
        btnPower.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                temp += " ^ ";

                label.setText(temp);
                btnPi.setDisable(false);
                btnEnumber.setDisable(false);
            }
        });

        GridPane root = new GridPane();

        root.add(btn1, 0, 0);
        root.add(btn2, 1, 0);
        root.add(btn3, 2, 0);
        root.add(btn4, 0, 1);
        root.add(btn5, 1, 1);
        root.add(btn6, 2, 1);
        root.add(btn7, 0, 2);
        root.add(btn8, 1, 2);
        root.add(btn9, 2, 2);

        root.add(btnC, 0, 3);
        root.add(btn0, 1, 3);
        root.add(btnE, 2, 3);

        btnE.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (label.getText().contains("!")) {
                    label.setText(calc.factorial(label.getText()));
                } else {
                    double firstNumber = calc.getNumbersFromString(label.getText())[0];
                    double secondNumber = calc.getNumbersFromString(label.getText())[1];
                    String function = calc.returnFunctionFromString(label.getText());
                    String svaret = calc.calculate(firstNumber, function, secondNumber);

                    label.setText(svaret);
                    enableOperatorButtons();
                } 
            }
        });

        root.add(btnFact, 5, 0);
        root.add(btnEnumber, 5, 1);
        root.add(btnPi, 5, 2);
        root.add(btnPower, 5, 3);
        root.add(btnAdd, 4, 0);
        root.add(btnSub, 4, 1);
        root.add(btnMul, 4, 2);
        root.add(btnDiv, 4, 3);

        bp.setTop(label);
        bp.setCenter(root);

        Scene scene = new Scene(bp, 375, 375);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void disableOperandButtons() {
        btnAdd.setDisable(true);
        btnSub.setDisable(true);
        btnMul.setDisable(true);
        btnDiv.setDisable(true);
        btnFact.setDisable(true);
        btnPower.setDisable(true);
    }

    private void enableOperatorButtons() {
        btnAdd.setDisable(false);
        btnSub.setDisable(false);
        btnMul.setDisable(false);
        btnDiv.setDisable(false);
        btnFact.setDisable(false);
        btnPi.setDisable(false);
        btnPower.setDisable(false);
        btnEnumber.setDisable(false);
    }

}
