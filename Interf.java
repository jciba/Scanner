import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.WeakEventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.paint.Paint;
import javafx.stage.FileChooser;

import javax.swing.*;
import java.io.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;


import static java.awt.Color.RED;
import static java.lang.Thread.*;

/**
 * Created by Kuba on 08/02/2017.
 */
public class Interf extends Application{

    Button button1 = new Button();
    Button button2 = new Button();
    Button button3 = new Button();
    Button button4 = new Button();

    Text text1 = new Text("PORT SCANNER");
    Text text2 = new Text("IP");
    Text text3 = new Text("STATUS");
    Text text4 = new Text("FILE");
    Text text5 = new Text("READABLE FILE");
    Text text6 = new Text("SERIALIZED FILE");
    TextField ip = new TextField();
    Pane pane1 = new Pane();
    Pane pane2 = new Pane();
    Pane pane3 = new Pane();
    Pane pane4 = new Pane();
    Pane pane5 = new Pane();
    Pane pane6 = new Pane();
    Pane pane7 = new Pane();
    Pane pane8 = new Pane();
    Pane pane9 = new Pane();
    Pane pane10 = new Pane();
    Pane pane11 = new Pane();
    Pane pane12 = new Pane();


    Pane apane = new Pane();
    VBox wpane = new VBox();
    MenuBar menu = new MenuBar();
    Menu file = new Menu();
    Menu about = new Menu();
    Menu search = new Menu();
    Menu sort = new Menu();
    Circle circle = new Circle();
    Scene scene = new Scene(wpane);
    Try tr = new Try();

    String path1,path2,path3;


    public void buttons(){
        button1.setText(". . .");
        button2.setText(". . .");
        button3.setText(". . .");
        button4.setText("START");



        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Stage stage = new Stage();

                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Choose path");
                File file = fileChooser.showSaveDialog(stage);
                path1=file.getAbsolutePath();
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Stage stage = new Stage();

                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Choose path");
                File file = fileChooser.showSaveDialog(stage);
                path2=file.getAbsolutePath();
            }
        });
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Stage stage = new Stage();

                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Choose path");
                File file = fileChooser.showSaveDialog(stage);
                path3=file.getAbsolutePath();
            }
        });

       button4.setOnMouseClicked(new EventHandler<MouseEvent>() {
           @Override
           public void handle(MouseEvent event) {
               circle.setFill(Color.GREEN);
               //try {
                  // wait(2000);
               //} catch (InterruptedException e) {
                //   e.printStackTrace();
               //}
               x();
           }

       });



    }

    public void stage(){
        Pane pane = new Pane();

    }

    public void text(){

    }
    public void panes(){
        pane1.getChildren().addAll(text1);
        pane2.getChildren().addAll(text2);
        pane3.getChildren().addAll(ip);
        pane4.getChildren().addAll(text3);
        pane5.getChildren().addAll(circle);
        pane6.getChildren().addAll(text4);
        pane7.getChildren().addAll(button1);
        pane8.getChildren().addAll(text5);
        pane9.getChildren().addAll(button2);
        pane10.getChildren().addAll(text6);
        pane11.getChildren().addAll(button3);
        pane12.getChildren().addAll(button4);



        pane1.setLayoutY(40);
        pane1.setLayoutX(120);

        pane2.setLayoutY(100);
        pane2.setLayoutX(10);

        pane3.setLayoutY(80);
        pane3.setLayoutX(150);

        pane4.setLayoutY(150);
        pane4.setLayoutX(10);

        pane5.setLayoutY(145);
        pane5.setLayoutX(315);

        pane6.setLayoutY(200);
        pane6.setLayoutX(10);

        pane7.setLayoutY(180);
        pane7.setLayoutX(300);

        pane8.setLayoutY(260);
        pane8.setLayoutX(10);

        pane9.setLayoutY(240);
        pane9.setLayoutX(300);

        pane10.setLayoutY(320);
        pane10.setLayoutX(10);

        pane11.setLayoutY(300);
        pane11.setLayoutX(300);

        pane12.setLayoutY(360);
        pane12.setLayoutX(180);





        apane.getChildren().addAll(pane1,pane2,pane3,pane4,pane5,pane6,pane7,pane8,pane9,pane10,pane11,pane12);
        wpane.getChildren().addAll(menu,apane);
    }
    public void menu(){
        menu.getMenus().addAll(file,about,search,sort);
        file.setText("file");
        about.setText("about");
        search.setText("search");
        sort.setText("sort");

        javafx.scene.control.MenuItem exit = new javafx.scene.control.MenuItem("Exit");
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(2);
            }
        });
        javafx.scene.control.MenuItem about1 = new javafx.scene.control.MenuItem("About");
        about.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage = new Stage();
                HBox box = new HBox();
                Text text = new Text("Created by Jakub Ciba");
                box.getChildren().addAll(text);
                box.setAlignment(Pos.CENTER);
                Scene scene = new Scene(box);
                stage.setScene(scene);
                stage.show();
            }
        });
        javafx.scene.control.MenuItem search1 = new javafx.scene.control.MenuItem("search");
        search.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter port number"));

                int z = tr.search(x);
                JOptionPane.showMessageDialog(null,"port: "+x +" " +z);
            }
        });
        javafx.scene.control.MenuItem sort1 = new javafx.scene.control.MenuItem("Sort");
        sort1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Search search = new Search();
                search.sort(tr.tab);
            }
        });
        file.getItems().addAll(exit);
        about.getItems().addAll(about1);
        search.getItems().addAll(search1);
        sort.getItems().addAll(sort1);
    }
    public void circle(){
        circle.setRadius(10);
        circle.setFill(Color.RED);
    }


    public void start(Stage stage){
        buttons();
        menu();
        circle();
        text();
        panes();
        menu.prefWidthProperty().bind(stage.widthProperty());
        stage.setMaxHeight(500);
        stage.setMaxWidth(400);
        stage.setMinWidth(400);
        stage.setMinHeight(500);
        stage.setScene(scene);

        stage.show();

   }
    public void x(){

        tr.ip=ip.getText();
        tr.path=path1;
        tr.thread(tr.ip,tr.path);
        Save save = new Save();
        save.saveToFile(tr.getTab(),path2);
        save.serialize(tr,path3);

    }

    public static void main(String args[]){

        launch();

    }
}
