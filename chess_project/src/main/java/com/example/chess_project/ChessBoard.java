//Mohammad_Danesh_Project_Liu_ist_auch_da
//EJFNOEFNSJNFIJNSFJNSEF
//HEBFHFJSNEFJSFJSEF
//NSEJFSJNFPJSNFPSJEF
//EFNSIJNFJSFNPNEFIP
//FNJNJNJ
// MKMEKMFKEFOEFKEFOKEFOKEFOKEOFK
package com.example.chess_project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Glow;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ChessBoard extends Application {
    GridPane gridPane = new GridPane();
    Scene scene = new Scene(gridPane, 400, 400);
    ArrayList<Button> field = new ArrayList<>();
    public String cache;
    ArrayList<EventHandler<ActionEvent>> crhandler = new ArrayList<EventHandler<ActionEvent>>();
    EventHandler<ActionEvent> black_pawn = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {

        }
    };
    EventHandler<ActionEvent> empty_field = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {

        }
    };
    EventHandler<ActionEvent> black_rook = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {

        }
    };
    EventHandler<ActionEvent> black_knight = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {

        }
    };
    EventHandler<ActionEvent> black_bishop = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {

        }
    };
    EventHandler<ActionEvent> black_queen = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {

        }
    };
    EventHandler<ActionEvent> black_king = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {

        }
    };
    EventHandler<ActionEvent> white_pawn = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {

        }
    };
    EventHandler<ActionEvent> white_rook = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {

        }
    };
    EventHandler<ActionEvent> white_knight = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {

        }
    };
    EventHandler<ActionEvent> white_bishop = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {

        }
    };
    EventHandler<ActionEvent> white_queen = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {

        }
    };
    EventHandler<ActionEvent> white_king = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {

        }
    };

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setResizable(true);
        scene.getStylesheets().add("file:src//main//java//com//example//chess_project//style.css");
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(1);
        gridPane.setVgap(1);
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Button button = new Button();
                button.setId((row * 8) + (col) + "");
                button.setPrefSize(50, 50);
                if ((row + col) % 2 == 0) {
                    button.setStyle("-fx-background-color: burlywood;");
                } else {
                    button.setStyle("-fx-background-color: sienna;");
                }
                final int currentRow = row;
                final int currentCol = col;
                start_pieces(row, col, button, currentRow, currentCol);
                gridPane.add(button, col, row);
            }
        }
        System.out.println("HAHAHAHAHAHAH");
        System.out.println("IFJFIRJIRJFIJRIFRIJFIRJFIRFJIRJFIRJFIRJFIRJIRJFIRJFIJRFIJRFIJRFIJRFIRFIJRFIJRFIJRFIJRFIJRF");
        primaryStage.setTitle("Chessboard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void start_pieces(int row, int col, Button button, int currentRow, int currentCol) {
        Glow glow = new Glow();
        glow.setLevel(0.3);
        this.black_pawn = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handleevent(button, glow);
            }
        };
        this.black_rook = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handleevent(button, glow);
            }
        };
        this.black_knight = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handleevent(button, glow);
            }
        };
        this.black_bishop = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handleevent(button, glow);
            }
        };
        this.black_queen = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handleevent(button, glow);
            }
        };
        this.black_king = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handleevent(button, glow);
            }
        };
        this.white_pawn = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handleevent(button, glow);
            }
        };
        this.white_rook = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handleevent(button, glow);
            }
        };
        this.white_knight = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handleevent(button, glow);
            }
        };
        this.white_bishop = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handleevent(button, glow);
            }
        };
        this.white_queen = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handleevent(button, glow);
            }
        };
        this.white_king = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handleevent(button, glow);
            }
        };
        this.empty_field = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println(button);
                /*

                System.out.println(button);
                field.get(cache-1).getStyleClass().remove(currentpiece);
                field.get(cache-1).setEffect(null);
                field.get(cache-1).setOnAction(empty_field);
                button.getStyleClass().add(currentpiece);
                button.setOnAction(null);
                button.setOnAction(black_pawn);
                crbutton.clear();
                crhandler.clear();

                 */
                if(field.size()!=0) {
                    field.get(0).setEffect(null);
                    GridPane.setConstraints(button, Integer.parseInt(field.get(0).getId()) % 8, Integer.parseInt(field.get(0).getId()) / 8);
                    cache = button.getId();
                    if ((Integer.parseInt(field.get(0).getId()) % 8 + Integer.parseInt(field.get(0).getId()) / 8) % 2 == 0) {
                        button.setStyle("-fx-background-color: burlywood;");
                    } else {
                        button.setStyle("-fx-background-color: sienna;");
                    }
                    GridPane.setConstraints(field.get(0), Integer.parseInt(button.getId()) % 8, Integer.parseInt(button.getId()) / 8);
                    if ((Integer.parseInt(button.getId()) % 8 + Integer.parseInt(button.getId()) / 8) % 2 == 0) {
                        field.get(0).setStyle("-fx-background-color: burlywood;");
                    } else {
                        field.get(0).setStyle("-fx-background-color: sienna;");
                    }
                    button.setId(field.get(0).getId());
                    field.get(0).setId(cache);
                    field.clear();
                }
            }
        };
        if (row == 1) {
            button.getStyleClass().add("black_pawn");
            Pieces piece = new pawn(currentRow, currentCol);
            button.setOnAction(black_pawn);
        } else if (row == 6) {
            button.getStyleClass().add("white_pawn");
            Pieces piece = new pawn(currentRow, currentCol);
            button.setOnAction(white_pawn);
        } else if ((row == 0 && col == 0) || (row == 0 && col == 7)) {
            button.getStyleClass().add("black_rook");
            Pieces piece = new rook(currentRow, currentCol);
            button.setOnAction(black_rook);
        } else if ((row == 0 && col == 1) || (row == 0 && col == 6)) {
            button.getStyleClass().add("black_knight");
            Pieces piece = new knight(currentRow, currentCol);
            button.setOnAction(black_knight);
        } else if ((row == 0 && col == 2) || (row == 0 && col == 5)) {
            button.getStyleClass().add("black_bishop");
            Pieces piece = new bishop(currentRow, currentCol);
            button.setOnAction(black_bishop);
        } else if ((row == 0 && col == 3)) {

            button.getStyleClass().add("black_queen");
            Pieces piece = new queen(currentRow, currentCol);
            button.setOnAction(black_queen);
        } else if ((row == 0 && col == 4)) {

            button.getStyleClass().add("black_king");
            Pieces piece = new king(currentRow, currentCol);
            button.setOnAction(black_king);
        } else if ((row == 7 && col == 0) || (row == 7 && col == 7)) {

            button.getStyleClass().add("white_rook");
            Pieces piece = new rook(currentRow, currentCol);
            button.setOnAction(white_rook);
        } else if ((row == 7 && col == 1) || (row == 7 && col == 6)) {

            button.getStyleClass().add("white_knight");
            Pieces piece = new knight(currentRow, currentCol);
            button.setOnAction(white_knight);
        } else if ((row == 7 && col == 2) || (row == 7 && col == 5)) {

            button.getStyleClass().add("white_bishop");
            Pieces piece = new bishop(currentRow, currentCol);
            button.setOnAction(white_bishop);
        } else if ((row == 7 && col == 3)) {
            button.getStyleClass().add("white_queen");
            Pieces piece = new queen(currentRow, currentCol);
            button.setOnAction(white_queen);
        } else if ((row == 7 && col == 4)) {
            button.getStyleClass().add("white_king");
            Pieces piece = new king(currentRow, currentCol);
            button.setOnAction(white_king);
        } else {
            button.setOnAction(empty_field);
        }
    }

    private void handleevent(Button button, Glow glow) {
    /*
                    crbutton.clear();
                    crhandler.clear();
                    button.setEffect(glow);
                    System.out.println(button);
                    currentpiece = "black_pawn";
                    cache= Integer.parseInt(button.getId());
                    crhandler.add(black_pawn);
                    button.setOnAction(null);
     */
        if (field.size() != 0) {
            if(field.get(0).getId().equals(button.getId())){
                field.get(0).setEffect(null);
                field.clear();
            }else {
                field.get(0).setEffect(null);
                String thisbuttonid = button.getId();
                gridPane.getChildren().remove(button);
                GridPane.setConstraints(field.get(0), Integer.parseInt(thisbuttonid) % 8, Integer.parseInt(thisbuttonid) / 8);
                if ((Integer.parseInt(thisbuttonid) % 8 + Integer.parseInt(thisbuttonid) / 8) % 2 == 0) {
                    field.get(0).setStyle("-fx-background-color: burlywood;");
                } else {
                    field.get(0).setStyle("-fx-background-color: sienna;");
                }
                Button empty = new Button();
                empty.setId(field.get(0).getId());
                empty.setPrefSize(50, 50);
                empty.setOnAction(empty_field);
                if ((Integer.parseInt(field.get(0).getId()) % 8 + Integer.parseInt(field.get(0).getId()) / 8) % 2 == 0) {
                    empty.setStyle("-fx-background-color: burlywood;");
                } else {
                    empty.setStyle("-fx-background-color: sienna;");
                }
                gridPane.add(empty, Integer.parseInt(field.get(0).getId()) % 8, Integer.parseInt(field.get(0).getId()) / 8);
                field.get(0).setId(thisbuttonid);
                field.clear();
            }
        } else {
            System.out.println(button);
            button.setEffect(glow);
            field.add(button);
        }
    }


    public static void main(String[] args) {
        launch(args);
    }

}
