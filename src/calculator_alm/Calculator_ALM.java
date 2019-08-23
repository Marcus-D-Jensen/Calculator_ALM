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
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class Calculator_ALM extends Application {
    
    Calculate calc = new Calculate();
    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDiv;
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane bp = new BorderPane();
        
        Label label = new Label();
        
        label.setMinSize(150, 50);
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
        
        btnAdd = new Button("+");
        btnSub = new Button("-");
        btnMul = new Button("*");
        btnDiv = new Button("/");
        
        btn0.setMinSize(50, 50);
        btn1.setMinSize(50, 50);
        btn2.setMinSize(50, 50);
        btn3.setMinSize(50, 50);
        btn4.setMinSize(50, 50);
        btn5.setMinSize(50, 50);
        btn6.setMinSize(50, 50);
        btn7.setMinSize(50, 50);
        btn8.setMinSize(50, 50);
        btn9.setMinSize(50, 50);
        
        btnC.setMinSize(50, 50);
        btnE.setMinSize(50, 50);
        
        btnAdd.setMinSize(50, 50);
        btnSub.setMinSize(50, 50);
        btnMul.setMinSize(50, 50);
        btnDiv.setMinSize(50, 50);
        
        
        
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
            }
        });
        btnSub.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                label.setText(temp + " - ");
                disableOperandButtons();
            }
        });
        btnDiv.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                label.setText(temp + " / ");
                disableOperandButtons();
            }
        });
        btnMul.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText();
                label.setText(temp + " * ");
                disableOperandButtons();
            }
        });
        
        
        btnC.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                label.setText("");
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
                double firstNumber=calc.getNumbersFromString(label.getText())[0];
                double secondNumber=calc.getNumbersFromString(label.getText())[1];
                String function = calc.returnFunctionFromString(label.getText());
                String svaret = calc.calculate(firstNumber, function, secondNumber);
                
                label.setText(svaret);
            }
        });
        root.add(btnAdd, 4, 0);
        root.add(btnSub, 4, 1);
        root.add(btnMul, 4, 2);
        root.add(btnDiv, 4, 3);
        
        bp.setTop(label);
        bp.setCenter(root);
       
        Scene scene = new Scene(bp, 300, 250);
        
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
    }
    
}