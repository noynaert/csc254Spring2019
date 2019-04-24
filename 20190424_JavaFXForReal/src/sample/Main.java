package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    static int clickCount = 0;
    static Label message = new Label("Starting!");
    static Button clickBait = new Button("Click Me!");
    static TextArea playByPlay = new TextArea("");
    static Button reset = new Button("Reset");
    //static TextArea playerA = new TextArea();

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane root = new GridPane();
        primaryStage.setTitle("Dumb Buttons and Stuff");
        primaryStage.setScene(new Scene(root, 300, 275));
        root.setHgap(5);
        root.setVgap(5);

        //Adding to the Root
        root.add(message, 0, 0);
        root.add(clickBait, 0, 1);
        root.add(playByPlay, 0, 7);
        root.add(reset, 0,2);
        //root.add(playerA,0,5,1,3);

        //add an anonymous label
        root.add(new Label("Play by Play"), 0, 6);
        changeMessage();

        //Add listeners to buttons
        MyDumbMouseOver mouseOver = new MyDumbMouseOver();
        clickBait.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseOver);
        reset.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseOver);
        clickBait.addEventHandler(MouseEvent.MOUSE_EXITED, new MyDumbMouseOut());
        reset.addEventHandler(MouseEvent.MOUSE_EXITED,new MyDumbMouseOut());
        clickBait.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent mouseEvent) {
                    clickCount++;
                    Button source = (Button)mouseEvent.getSource();
                    playByPlay.appendText(source.getText() + " was Clicked\n");
                    changeMessage();
            }
        } );
        reset.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                clickCount = 0;
                playByPlay.appendText("Reset was clicked\n");
                changeMessage();
            }
        });

        primaryStage.show();
    }

    public static void changeMessage(){
        String s = String.format("Button has been clicked %2d times", clickCount);
        message.setText(s);
    }

    public static void main(String[] args) {
        launch(args);
    }

    class MyDumbMouseOver implements EventHandler<MouseEvent> {

        @Override
        public void handle(MouseEvent mouseEvent) {
            Button source = (Button) mouseEvent.getSource();
            playByPlay.appendText(source.getText() + " Over\n");
            source.setStyle("-fx-border-color: red");
        }
    }
    class MyDumbMouseOut implements EventHandler<MouseEvent> {

        @Override
        public void handle(MouseEvent mouseEvent) {
            Button source = (Button) mouseEvent.getSource();
            playByPlay.appendText(source.getText() + " Left\n");
            source.setStyle("-fx-border-color: black");
        }
    }
}
