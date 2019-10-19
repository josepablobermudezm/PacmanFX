/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmanfx.controller;

import com.sun.prism.paint.Color;
import java.awt.BasicStroke;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import pacmanfx.model.Nodo;
import pacmanfx.model.Arista;
import pacmanfx.model.pacMan2D;
import pacmanfx.util.FlowController;

/**
 * FXML Controller class
 *
 * @author Jose Pablo Bermudez
 */
public class Nivel1Controller extends Controller implements Initializable {

    double x = 447, y = 406, velx = 0, vely = 0;
    int code = 39/*por default a la derecha*/, cont = 0, gameStatus = 0, MouseX = 0, MouseY = 0,
            xAux = 434, yAux = 392, jAux = 14, iAux = 14, aux = 39, aux2 = 0, cont1 = 0, cont2 = 0, cont4 = 0, vidas = 6, cont3 = 0, contPuntos = 0,
            cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0, cont9 = 0, cont10 = 0;
    static boolean up = false, down = false, left = false, right = false, value = false, mapa2 = false, Nivel1 = true, Nivel2 = false, Nivel3 = false, Nivel4 = false,
            Nivel5 = false, Nivel6 = false, Nivel7 = false, Nivel8 = false, Nivel9 = false, Nivel10 = false;
    String nivel = "Nivel 1";

    private ArrayList<Nodo> nodos = new ArrayList();
    private ArrayList<Arista> aristas = new ArrayList();
    private pacMan2D pacman;
    char Mapa[][]
            = {{'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X', 'X', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
            {'X', ' ', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X'},
            {'X', ' ', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X'},
            {'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
            {'X', ' ', 'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X'},
            {'X', ' ', ' ', ' ', ' ', ' ', 'X', 'X', ' ', ' ', ' ', ' ', ' ', 'X', 'X', 'X', ' ', ' ', ' ', ' ', ' ', 'X', 'X', ' ', ' ', ' ', ' ', ' ', 'X'},
            {'X', ' ', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X'},
            {'X', ' ', 'X', 'X', 'X', ' ', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X'},
            {'/', ' ', ' ', ' ', ' ', ' ', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', ' ', ' ', ' ', ' ', ' ', '/'},
            {'X', ' ', 'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', '*', '*', '*', '*', '*', '*', '*', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X'},
            {'X', ' ', 'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', '*', '*', '*', '*', '*', '*', '*', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X'},
            {'X', ' ', 'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', '*', '*', '*', '*', '*', '*', '*', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X'},
            {'X', ' ', ' ', ' ', ' ', ' ', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', ' ', ' ', ' ', ' ', ' ', 'X'},
            {'X', ' ', 'X', 'X', 'X', ' ', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', '@', ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X'},
            {'X', ' ', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X'},
            {'X', ' ', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X'},
            {'X', ' ', 'X', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X', 'X', ' ', 'X'},
            {'X', ' ', ' ', ' ', ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', ' ', ' ', ' ', ' ', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}};
    //vector de char, para cambiar un nivel lo que se hace es cargar este vector sobre la matriz ya existente
    char Mapa2[][]
            = {{'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X'},
            {'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X'},
            {'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X'},
            {'X', 'X', ' ', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', ' ', 'X', 'X'},
            {'X', 'X', ' ', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', ' ', 'X', 'X'},
            {'X', 'X', ' ', 'X', ' ', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X', ' ', 'X', ' ', 'X', 'X'},
            {'X', 'X', ' ', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', ' ', 'X', 'X'},
            {'X', 'X', ' ', 'X', ' ', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X', ' ', 'X', ' ', 'X', 'X'},
            {'/', ' ', ' ', ' ', ' ', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', ' ', ' ', ' ', ' ', '/'},
            {'X', 'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', '*', '*', '*', '*', '*', '*', '*', 'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', '*', '*', '*', '*', '*', '*', '*', 'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', '*', '*', '*', '*', '*', '*', '*', 'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', 'X'},
            {'X', ' ', ' ', ' ', ' ', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', ' ', ' ', ' ', ' ', 'X'},
            {'X', ' ', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '@', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X', ' ', 'X'},
            {'X', ' ', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', ' ', 'X'},
            {'X', ' ', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', 'X', ' ', 'X'},
            {'X', ' ', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X', ' ', 'X'},
            {'X', ' ', ' ', ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', ' ', ' ', ' ', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}};

    @FXML
    private AnchorPane root;
    @FXML
    private BorderPane border;

    @Override
    public void initialize() {

    }

    private void pasar(ActionEvent event) {
        FlowController.getInstance().goViewInWindow("Menu");
    }

    @FXML
    private void Movimiento(KeyEvent event) {

    }
    private Nodo nodoAux = null;
    private static boolean encontrado = false;
    private EventHandler<KeyEvent> moverPacman = event -> {
        if (event.getCode() == event.getCode().DOWN) {
            xAux = (int) pacman.getpMan().getCenterX() - 14;
            yAux = (int) pacman.getpMan().getCenterY();
            while (xAux < (int) pacman.getpMan().getCenterX() + 14 && nodoAux == null) {
                while (yAux <645) {
                    if (nodos.stream().filter(nodo -> (int) nodo.getPoint2D().getX() == xAux && (int) nodo.getPoint2D().getY() == yAux).findAny().isPresent()) {
                        nodoAux = nodos.stream().filter(nodo -> (int) nodo.getPoint2D().getX() == xAux && (int) nodo.getPoint2D().getY() == yAux).findAny().get();
                    }
                    if (nodoAux != null) {
                        yAux = 646;
                        break;
                    }
                    yAux++;
                }
                
                if (nodoAux != null) {
                    xAux = (int) pacman.getpMan().getCenterX() + 14 ;
                    break;
                }
                yAux = (int) pacman.getpMan().getCenterY();
                xAux++;
            }
            down();

            aux = 40;
            if (nodoAux != null) {
                pacman.getpMan().setRotate(90);
                Timeline timeline = new Timeline();

                KeyValue kv = new KeyValue(pacman.getpMan().layoutXProperty(), -(nodoAux.getPoint2D().getX() - ((pacman.getpMan().getCenterX()) / 2)) - 20);

                KeyValue kvy = new KeyValue(pacman.getpMan().layoutYProperty(), (nodoAux.getPoint2D().getY() - ((pacman.getpMan().getCenterY()) / 2)) + 20);
                KeyFrame kf = new KeyFrame(Duration.millis(1000), kv);
                KeyFrame kfy = new KeyFrame(Duration.millis(1000), kvy);
                timeline.getKeyFrames().addAll(kfy);
                timeline.play();
                nodoAux = null;
            }
        }
        if (event.getCode() == event.getCode().LEFT) {
            left();
            xAux = (int) pacman.getpMan().getCenterX();
            yAux = (int) pacman.getpMan().getCenterY() - 14;

            while (yAux < (int) pacman.getpMan().getCenterX() + 14 && nodoAux == null) {
                while (xAux >= 0) {
                    if (nodos.stream().filter(nodo -> (int) nodo.getPoint2D().getX() == xAux && (int) nodo.getPoint2D().getY() == yAux).findAny().isPresent()) {
                        nodoAux = nodos.stream().filter(nodo -> (int) nodo.getPoint2D().getX() == xAux && (int) nodo.getPoint2D().getY() == yAux).findAny().get();
                    }
                    if (nodoAux != null) {
                        xAux = -1;
                        break;
                    }
                    xAux--;
                }
                if (nodoAux != null) {
                    xAux = (int) pacman.getpMan().getCenterX() + 14;
                    break;
                }

                xAux = (int) pacman.getpMan().getCenterX();
                yAux++;
            }

            if (nodoAux != null) {
                pacman.getpMan().setRotate(-180);
                Timeline timeline = new Timeline();

                KeyValue kv = new KeyValue(pacman.getpMan().layoutXProperty(), -(nodoAux.getPoint2D().getX() - ((pacman.getpMan().getCenterX()) / 2)) - 20);

                KeyValue kvy = new KeyValue(pacman.getpMan().layoutYProperty(), (nodoAux.getPoint2D().getY() - ((pacman.getpMan().getCenterY()) / 2)));
                KeyFrame kf = new KeyFrame(Duration.millis(1000), kv);
                KeyFrame kfy = new KeyFrame(Duration.millis(1000), kvy);
                timeline.getKeyFrames().addAll(kf);
                timeline.play();
                nodoAux = null;
            }
            aux = 37;

        }
        if (event.getCode() == event.getCode().UP) {
            up();
            pacman.getpMan().setRotate(-90);
            aux = 38;

        }
        if (event.getCode() == event.getCode().RIGHT) {
            right();
            pacman.getpMan().setRotate(0);
            aux = 39;
        }

        /*pacman.getpMan().setLayoutY(pacman.getpMan().getLayoutY());
        pacman.getpMan().setLayoutX(pacman.getpMan().getLayoutX() +);*/
        if (nodoAux != null) {
            Timeline timeline = new Timeline();

            KeyValue kv = new KeyValue(pacman.getpMan().layoutXProperty(), -(nodoAux.getPoint2D().getX() - ((pacman.getpMan().getCenterX()) / 2)) - 20);

            KeyValue kvy = new KeyValue(pacman.getpMan().layoutYProperty(), (nodoAux.getPoint2D().getY() - ((pacman.getpMan().getCenterY()) / 2)));
            KeyFrame kf = new KeyFrame(Duration.millis(1000), kv);
            KeyFrame kfy = new KeyFrame(Duration.millis(1000), kvy);
            timeline.getKeyFrames().addAll(kf);
            timeline.play();
        }

    };

    public void up() {
        vely = -1.5;
        velx = 0;
    }

    public void down() {
        vely = 1.5;
        velx = 0;
    }

    public void left() {
        velx = -1.5;

        vely = 0;
    }

    public void right() {
        velx = 1.5;
        vely = 0;
    }

    public void CrearMapa() {

        try {
            File f = new File(".");
            String dir = f.getAbsolutePath();
            System.out.println(dir);
            //para que esto funcione en visualCode es necesario seleccionarlo desde src y usar este código
            /*File f = new File(".");
            String dir = f.getAbsolutePath();
            BufferedReader reader = new BufferedReader(new FileReader(dir + "\\pacmanfx\\resources\\Arista.txt"));*/
            BufferedReader reader = new BufferedReader(new FileReader(dir + "\\src\\pacmanfx\\resources\\Nodos.txt"));
            String line = null;
            Integer i = 0;
            while ((line = reader.readLine()) != null) {
                String[] parts;
                parts = line.split("\\$");
                Double posx = Double.valueOf(parts[0]);
                Double posy = Double.valueOf(parts[1]);

                Nodo nodo = new Nodo(posx, posy);
                Circle circle = new Circle(posx, posy, 4, Paint.valueOf("GREEN"));
                this.root.getChildren().add(circle);

                i++;
                nodos.add(nodo);
            }
        } catch (IOException ex) {

        }
        try {
            //para que esto funcione en visualCode es necesario seleccionarlo desde src y usar este código
            /*File f = new File(".");
            String dir = f.getAbsolutePath();
            BufferedReader reader = new BufferedReader(new FileReader(dir + "\\pacmanfx\\resources\\Arista.txt"));*/
            File f = new File(".");
            String dir = f.getAbsolutePath();
            BufferedReader reader = new BufferedReader(new FileReader(dir + "\\src\\pacmanfx\\resources\\Arista.txt"));
            String line = null;

            while ((line = reader.readLine()) != null) {
                String[] parts;
                parts = line.split("\\$");
                Double posx = Double.valueOf(parts[0]);
                Double posy = Double.valueOf(parts[1]);
                Double posx2 = Double.valueOf(parts[2]);
                Double posy2 = Double.valueOf(parts[3]);

                Arista arista = new Arista(posx, posy, posx2, posy2);
                Line linea = new Line(posx, posy, posx2, posy2);
                linea.setStroke(Paint.valueOf("RED"));
                linea.setStrokeWidth(3.00);
                this.root.getChildren().add(linea);
                arista.agregarNodos(nodos);
                aristas.add(arista);
            };
        } catch (IOException | NumberFormatException e) {
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 29; j++) {
                if (Mapa[i][j] == 'X') {//pared
                    Rectangle rec = new Rectangle(j * 31, i * 28, 31, 28);
                    rec.setFill(Paint.valueOf("#2E3782"));
                    root.getChildren().add(rec);//tamaño y posición del cada uno de los rectangulos
                } else if (Mapa[i][j] == '@') {//pacman

                    //System.out.print("@");
                    pacman = new pacMan2D((Double) x, (Double) y, 13.0, 15.0, (aux == 39) ? 30.0 : (aux == 37) ? 210.0 : (aux == 38) ? 120.0 : 300.0, 300.0);
                    pacman.getpMan().setFocusTraversable(true);
                    pacman.getpMan().setOnKeyReleased(moverPacman);

                    root.getChildren().add(pacman.getpMan());//*/
                    //x, y son las posiciones del pacman, van a ir cambiando dependiendo de que tecla se use
                } else if (Mapa[i][j] == ' ') {//espacio en blanco
                    Circle circle = new Circle(j * 31 + 12, i * 29 + 5, 3, Paint.valueOf("YELLOW"));
                    root.getChildren().add(circle);//tamaño y posición del cada uno de los rectangulos
                }
                if (Mapa[i][j] == 'X' && i == 9 && j == 14) {//pared

                    Rectangle rec1 = new Rectangle(j * 31, i * 28, 31, 28);
                    rec1.setFill(Paint.valueOf("BLACK"));
                    Rectangle rec = new Rectangle(j * 31, i * 28 + 10, 31, 4);
                    rec.setFill(Paint.valueOf("WHITE"));
                    root.getChildren().add(rec1);
                    root.getChildren().add(rec);
                }
                if (Mapa[i][j] == ' ') {
                    //   contPuntos++;
                }
            }
        }

        Label label = new Label("Puntos:");
        label.setLayoutX(20);
        label.setLayoutY(585);
        label.setId("puntos");
        root.getChildren().add(label);
        Label puntaje = new Label("0");
        puntaje.setLayoutX(20);
        puntaje.setLayoutY(585);
        puntaje.setId("puntos");
        //Agregaar lo de puntaje
        root.getChildren().add(puntaje);

        for (int i = 0; i < vidas; i++) {
            Arc arc = new Arc(675 + cont3, 605, 13.0, 15.0, 30, 300);
            arc.setFill(Paint.valueOf("YELLOW"));
            arc.setType(ArcType.ROUND);
            root.getChildren().add(arc);
            cont3 += 30;
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        CrearMapa();
    }
}
