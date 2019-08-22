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
import javafx.scene.layout.StackPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author Marcus D Jensen
 */
public class Calculator_ALM extends Application {
    
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
        
        
        
        
        btn0.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String temp = label.getText(); 
                temp += "0";
                
                label.setText(temp);
            }
        });
        
        GridPane root = new GridPane();
        root.add(label, 0, 0);
        root.add(btn1, 0, 1);
        root.add(btn2, 1, 1);
        root.add(btn3, 2, 1);
        root.add(btn4, 0, 2);
        root.add(btn5, 1, 2);
        root.add(btn6, 2, 2);
        root.add(btn7, 0, 3);
        root.add(btn8, 1, 3);
        root.add(btn9, 2, 3);
        
        root.add(btnC, 0, 4);
        root.add(btn0, 1, 4);
        root.add(btnE, 2, 4);
        
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
    
}
