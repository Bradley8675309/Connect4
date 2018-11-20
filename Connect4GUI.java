/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Core.Connect4ComputerPlayer;
import Core.Connect4Game;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 *
 * @author brads
 */
public class Connect4GUI extends Application{
    GridPane GUIGameBoard;
    Connect4Game game = new Connect4Game();
    Connect4ComputerPlayer compPlayer = new Connect4ComputerPlayer();
    
    @Override
    public void start(Stage stage) throws Exception {
        GridPane GUIGameBoard = new GridPane();
        GridPane pane = new GridPane();
        
        EventHandler<MouseEvent> selectComp = new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent e) { 
            pane.getChildren().clear();
            buildGameBoardComp(pane);
            } 
        };
        
        EventHandler<MouseEvent> selectHuman = new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent e) { 
            pane.getChildren().clear();
            buildGameBoardHuman(pane);
            } 
        };
        
        
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        
        Button playComp = new Button("Play VS Computer");
        Button playHuman = new Button("Play VS Human"); 
        
        playComp.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, selectComp);
        playHuman.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, selectHuman);
        
        pane.setPrefSize(500, 300);
        
        
        pane.add(playComp, 0, 0);
        pane.add(playHuman, 1, 0);
        
        
        Scene scene = new Scene(pane);
        stage.setTitle("Connect Four");
        stage.setScene(scene);
        stage.show();
    }
    
    
    
    public void buildGameBoardHuman(GridPane pane){
        Label displayField = new Label();
        int[][] gameBoard = game.getGameBoard();
        boolean invalidMove = false;
        
        pane.getChildren().clear();
        
        EventHandler<MouseEvent> eventHandler1 = new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent e) { 
            if(game.makeMove(0)){
                
                if(game.checkForWin()){
                    pane.getChildren().clear();
                    Label newLabel = new Label();
                    if(game.getPlayerTurn() == 1)
                        newLabel.setText("O WINS");
                    else if(game.getPlayerTurn() == 2)
                        newLabel.setText("X WINS");
                    pane.add(newLabel, 0, 7, 7, 1);
                }
                else{
                    game.changePlayerTurn();
                    buildGameBoardHuman(pane);
                }
                    
            }
            else
                displayField.setText("That Column is Full!");
            } 
        };
        EventHandler<MouseEvent> eventHandler2 = new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent e) { 
            if(game.makeMove(1)){
                if(game.checkForWin()){
                    pane.getChildren().clear();
                    Label newLabel = new Label();
                    if(game.getPlayerTurn() == 1)
                        newLabel.setText("O WINS");
                    else if(game.getPlayerTurn() == 2)
                        newLabel.setText("X WINS");
                    pane.add(newLabel, 0, 7, 7, 1);
                }
                else{
                    game.changePlayerTurn();
                    buildGameBoardHuman(pane);
                }
                    
            }
            else
                displayField.setText("That Column is Full!");
            } 
        };
        EventHandler<MouseEvent> eventHandler3 = new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent e) { 
            if(game.makeMove(2)){
                if(game.checkForWin()){
                    pane.getChildren().clear();
                    Label newLabel = new Label();
                    if(game.getPlayerTurn() == 1)
                        newLabel.setText("O WINS");
                    else if(game.getPlayerTurn() == 2)
                        newLabel.setText("X WINS");
                    pane.add(newLabel, 0, 7, 7, 1);
                }
                else{
                    game.changePlayerTurn();
                    buildGameBoardHuman(pane);
                }
                    
            }
            else
                displayField.setText("That Column is Full!");
            } 
        };
        EventHandler<MouseEvent> eventHandler4 = new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent e) { 
            if(game.makeMove(3)){
                if(game.checkForWin()){
                    pane.getChildren().clear();
                    Label newLabel = new Label();
                    if(game.getPlayerTurn() == 1)
                        newLabel.setText("O WINS");
                    else if(game.getPlayerTurn() == 2)
                        newLabel.setText("X WINS");
                    pane.add(newLabel, 0, 7, 7, 1);
                }
                else{
                    game.changePlayerTurn();
                    buildGameBoardHuman(pane);
                }
                    
            }
            else
                displayField.setText("That Column is Full!");
            } 
        };
        EventHandler<MouseEvent> eventHandler5 = new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent e) { 
            if(game.makeMove(4)){
                if(game.checkForWin()){
                    pane.getChildren().clear();
                    Label newLabel = new Label();
                    if(game.getPlayerTurn() == 1)
                        newLabel.setText("O WINS");
                    else if(game.getPlayerTurn() == 2)
                        newLabel.setText("X WINS");
                    pane.add(newLabel, 0, 7, 7, 1);
                }
                else{
                    game.changePlayerTurn();
                    buildGameBoardHuman(pane);
                }
                    
            }
            else
                displayField.setText("That Column is Full!");
            } 
        };
        EventHandler<MouseEvent> eventHandler6 = new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent e) { 
            if(game.makeMove(5)){
                if(game.checkForWin()){
                    pane.getChildren().clear();
                    Label newLabel = new Label();
                    if(game.getPlayerTurn() == 1)
                        newLabel.setText("O WINS");
                    else if(game.getPlayerTurn() == 2)
                        newLabel.setText("X WINS");
                    pane.add(newLabel, 0, 7, 7, 1);
                }
                else{
                    game.changePlayerTurn();
                    buildGameBoardHuman(pane);
                }
                    
            }
            else
                displayField.setText("That Column is Full!");
            } 
        };
        EventHandler<MouseEvent> eventHandler7 = new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent e) { 
            if(game.makeMove(6)){
                if(game.checkForWin()){
                    pane.getChildren().clear();
                    Label newLabel = new Label();
                    if(game.getPlayerTurn() == 1)
                        newLabel.setText("O WINS");
                    else if(game.getPlayerTurn() == 2)
                        newLabel.setText("X WINS");
                    pane.add(newLabel, 0, 7, 7, 1);
                }
                else{
                    game.changePlayerTurn();
                    buildGameBoardHuman(pane);
                }
                    
            }
            else
                displayField.setText("That Column is Full!");
            }
                    
        };
        
        
        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                Label newLabel = new Label();
                if(gameBoard[5-i][j] == 0)
                    newLabel.setText("     ");
                else if(gameBoard[5-i][j] == 1)
                    newLabel.setText("O");
                else if(gameBoard[5-i][j] == 2)
                    newLabel.setText("X");
                pane.add(newLabel, j, i);
            }
        }
        for(int i = 0; i < 7; i++){
            Button newButton = new Button(String.valueOf(i+1));
            
            switch (i) {
                case 0:
                    newButton.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandler1);
                    break;
                case 1:
                    newButton.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandler2);
                    break;
                case 2:
                    newButton.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandler3);
                    break;
                case 3:
                    newButton.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandler4);
                    break;
                case 4:
                    newButton.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandler5);
                    break;
                case 5:
                    newButton.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandler6);
                    break;
                case 6:
                    newButton.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandler7);
                    break;
                default:
                    break;
            }
            pane.add(newButton, i, 6);
           
        }
        
        
        if(game.getPlayerTurn() == 1)
            displayField.setText("Player O, select 1 through 7 to make a move.");
        else if(game.getPlayerTurn() == 2)
            displayField.setText("Player X, select 1 through 7 to make a move.");
        
        if(invalidMove)
            displayField.setText("Invalid move. Select 1 through 7.");
        
        pane.add(displayField, 0, 7, 7, 1);
    }
    
    public void buildGameBoardComp(GridPane pane){
        Label displayField = new Label();
        int[][] gameBoard = game.getGameBoard();
        boolean invalidMove = false;
        
        pane.getChildren().clear();
        
        EventHandler<MouseEvent> eventHandler1 = new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent e) { 
            if(game.makeMove(0)){
                
                if(game.checkForWin()){
                    pane.getChildren().clear();
                    Label newLabel = new Label();
                    if(game.getPlayerTurn() == 1)
                        newLabel.setText("O WINS");
                    else if(game.getPlayerTurn() == 2)
                        newLabel.setText("X WINS");
                    pane.add(newLabel, 0, 7, 7, 1);
                }
                else{
                    game.changePlayerTurn();
                    
                    boolean makeMove = false;
                    while(!makeMove){
                        if(game.makeMove(compPlayer.generateMove()-1))
                                makeMove = true;
                    }
                    
                    if(game.checkForWin()){
                        pane.getChildren().clear();
                        Label newLabel = new Label();
                        if(game.getPlayerTurn() == 1)
                            newLabel.setText("O WINS");
                        else if(game.getPlayerTurn() == 2)
                            newLabel.setText("X WINS");
                        pane.add(newLabel, 0, 7, 7, 1);
                    }
                    
                    game.changePlayerTurn();
                    buildGameBoardComp(pane);
                }
                    
            }
            else
                displayField.setText("That Column is Full!");
            } 
        };
        EventHandler<MouseEvent> eventHandler2 = new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent e) { 
            if(game.makeMove(1)){
                if(game.checkForWin()){
                    pane.getChildren().clear();
                    Label newLabel = new Label();
                    if(game.getPlayerTurn() == 1)
                        newLabel.setText("O WINS");
                    else if(game.getPlayerTurn() == 2)
                        newLabel.setText("X WINS");
                    pane.add(newLabel, 0, 7, 7, 1);
                }
                else{
                    game.changePlayerTurn();
                    boolean makeMove = false;
                    while(!makeMove){
                        if(game.makeMove(compPlayer.generateMove()-1))
                                makeMove = true;
                    }
                    if(game.checkForWin()){
                        pane.getChildren().clear();
                        Label newLabel = new Label();
                        if(game.getPlayerTurn() == 1)
                            newLabel.setText("O WINS");
                        else if(game.getPlayerTurn() == 2)
                            newLabel.setText("X WINS");
                        pane.add(newLabel, 0, 7, 7, 1);
                    }
                    
                    game.changePlayerTurn();
                    buildGameBoardComp(pane);
                }
                    
            }
            else
                displayField.setText("That Column is Full!");
            } 
        };
        EventHandler<MouseEvent> eventHandler3 = new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent e) { 
            if(game.makeMove(2)){
                if(game.checkForWin()){
                    pane.getChildren().clear();
                    Label newLabel = new Label();
                    if(game.getPlayerTurn() == 1)
                        newLabel.setText("O WINS");
                    else if(game.getPlayerTurn() == 2)
                        newLabel.setText("X WINS");
                    pane.add(newLabel, 0, 7, 7, 1);
                }
                else{
                    game.changePlayerTurn();
                    boolean makeMove = false;
                    while(!makeMove){
                        if(game.makeMove(compPlayer.generateMove()-1))
                                makeMove = true;
                    }
                    
                    
                    
                    if(game.checkForWin()){
                        pane.getChildren().clear();
                        Label newLabel = new Label();
                        if(game.getPlayerTurn() == 1)
                            newLabel.setText("O WINS");
                        else if(game.getPlayerTurn() == 2)
                            newLabel.setText("X WINS");
                        pane.add(newLabel, 0, 7, 7, 1);
                    }
                    game.changePlayerTurn();
                    buildGameBoardComp(pane);
                }
                    
            }
            else
                displayField.setText("That Column is Full!");
            } 
        };
        EventHandler<MouseEvent> eventHandler4 = new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent e) { 
            if(game.makeMove(3)){
                if(game.checkForWin()){
                    pane.getChildren().clear();
                    Label newLabel = new Label();
                    if(game.getPlayerTurn() == 1)
                        newLabel.setText("O WINS");
                    else if(game.getPlayerTurn() == 2)
                        newLabel.setText("X WINS");
                    pane.add(newLabel, 0, 7, 7, 1);
                }
                else{
                    game.changePlayerTurn();
                    boolean makeMove = false;
                    while(!makeMove){
                        if(game.makeMove(compPlayer.generateMove()-1))
                                makeMove = true;
                    }
                    
                    
                    
                    if(game.checkForWin()){
                        pane.getChildren().clear();
                        Label newLabel = new Label();
                        if(game.getPlayerTurn() == 1)
                            newLabel.setText("O WINS");
                        else if(game.getPlayerTurn() == 2)
                            newLabel.setText("X WINS");
                        pane.add(newLabel, 0, 7, 7, 1);
                    }
                    game.changePlayerTurn();
                    buildGameBoardComp(pane);
                }
                    
            }
            else
                displayField.setText("That Column is Full!");
            } 
        };
        EventHandler<MouseEvent> eventHandler5 = new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent e) { 
            if(game.makeMove(4)){
                if(game.checkForWin()){
                    pane.getChildren().clear();
                    Label newLabel = new Label();
                    if(game.getPlayerTurn() == 1)
                        newLabel.setText("O WINS");
                    else if(game.getPlayerTurn() == 2)
                        newLabel.setText("X WINS");
                    pane.add(newLabel, 0, 7, 7, 1);
                }
                else{
                    game.changePlayerTurn();
                    boolean makeMove = false;
                    while(!makeMove){
                        if(game.makeMove(compPlayer.generateMove()-1))
                                makeMove = true;
                    }
                    
                    if(game.checkForWin()){
                        pane.getChildren().clear();
                        Label newLabel = new Label();
                        if(game.getPlayerTurn() == 1)
                            newLabel.setText("O WINS");
                        else if(game.getPlayerTurn() == 2)
                            newLabel.setText("X WINS");
                        pane.add(newLabel, 0, 7, 7, 1);
                    }
                    game.changePlayerTurn();
                    buildGameBoardComp(pane);
                }
                    
            }
            else
                displayField.setText("That Column is Full!");
            } 
        };
        EventHandler<MouseEvent> eventHandler6 = new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent e) { 
            if(game.makeMove(5)){
                if(game.checkForWin()){
                    pane.getChildren().clear();
                    Label newLabel = new Label();
                    if(game.getPlayerTurn() == 1)
                        newLabel.setText("O WINS");
                    else if(game.getPlayerTurn() == 2)
                        newLabel.setText("X WINS");
                    pane.add(newLabel, 0, 7, 7, 1);
                }
                else{
                    game.changePlayerTurn();
                    boolean makeMove = false;
                    while(!makeMove){
                        if(game.makeMove(compPlayer.generateMove()-1))
                                makeMove = true;
                    }
                    
                    if(game.checkForWin()){
                        pane.getChildren().clear();
                        Label newLabel = new Label();
                        if(game.getPlayerTurn() == 1)
                            newLabel.setText("O WINS");
                        else if(game.getPlayerTurn() == 2)
                            newLabel.setText("X WINS");
                        pane.add(newLabel, 0, 7, 7, 1);
                    }
                    game.changePlayerTurn();
                    buildGameBoardComp(pane);
                }
                    
            }
            else
                displayField.setText("That Column is Full!");
            } 
        };
        EventHandler<MouseEvent> eventHandler7 = new EventHandler<MouseEvent>() { 
            @Override
            public void handle(MouseEvent e) { 
            if(game.makeMove(6)){
                if(game.checkForWin()){
                    pane.getChildren().clear();
                    Label newLabel = new Label();
                    if(game.getPlayerTurn() == 1)
                        newLabel.setText("O WINS");
                    else if(game.getPlayerTurn() == 2)
                        newLabel.setText("X WINS");
                    pane.add(newLabel, 0, 7, 7, 1);
                }
                else{
                    game.changePlayerTurn();
                    boolean makeMove = false;
                    while(!makeMove){
                        if(game.makeMove(compPlayer.generateMove()-1))
                                makeMove = true;
                    }
                    
                    if(game.checkForWin()){
                        pane.getChildren().clear();
                        Label newLabel = new Label();
                        if(game.getPlayerTurn() == 1)
                            newLabel.setText("O WINS");
                        else if(game.getPlayerTurn() == 2)
                            newLabel.setText("X WINS");
                        pane.add(newLabel, 0, 7, 7, 1);
                    }
                    game.changePlayerTurn();
                    buildGameBoardComp(pane);
                }
                    
            }
            else
                displayField.setText("That Column is Full!");
            }
                    
        };
        
        
        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                Label newLabel = new Label();
                if(gameBoard[5-i][j] == 0)
                    newLabel.setText("     ");
                else if(gameBoard[5-i][j] == 1)
                    newLabel.setText("O");
                else if(gameBoard[5-i][j] == 2)
                    newLabel.setText("X");
                pane.add(newLabel, j, i);
            }
        }
        for(int i = 0; i < 7; i++){
            Button newButton = new Button(String.valueOf(i+1));
            
            switch (i) {
                case 0:
                    newButton.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandler1);
                    break;
                case 1:
                    newButton.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandler2);
                    break;
                case 2:
                    newButton.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandler3);
                    break;
                case 3:
                    newButton.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandler4);
                    break;
                case 4:
                    newButton.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandler5);
                    break;
                case 5:
                    newButton.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandler6);
                    break;
                case 6:
                    newButton.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandler7);
                    break;
                default:
                    break;
            }
            pane.add(newButton, i, 6);
           
        }
        
        
        if(game.getPlayerTurn() == 1)
            displayField.setText("Player O, select 1 through 7 to make a move.");
        else if(game.getPlayerTurn() == 2)
            displayField.setText("Player X, select 1 through 7 to make a move.");
        
        if(invalidMove)
            displayField.setText("Invalid move. Select 1 through 7.");
        
        pane.add(displayField, 0, 7, 7, 1);
    }
}
