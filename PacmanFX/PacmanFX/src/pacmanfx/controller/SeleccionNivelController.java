/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmanfx.controller;

import java.applet.AudioClip;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import pacmanfx.util.FlowController;
import pacmanfx.util.hiloTiempo;

/**
 * FXML Controller class
 *
 * @author Jose Pablo Bermudez
 */
public class SeleccionNivelController extends Controller implements Initializable {

    @FXML
    private ImageView omg;
    @FXML
    private Label lblVolver;
    @FXML
    private ImageView img1;
    @FXML
    private ImageView img2;
    @FXML
    private ImageView img3;
    @FXML
    private ImageView img4;
    @FXML
    private ImageView img5;
    @FXML
    private ImageView img6;
    @FXML
    private ImageView img7;
    @FXML
    private ImageView img8;
    @FXML
    private ImageView img9;
    @FXML
    private ImageView img10;
    static public int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0, n10 = 0, dificultad = 0;
    @FXML
    private ImageView Lock2;
    @FXML
    private ImageView Lock3;
    @FXML
    private ImageView Lock4;
    @FXML
    private ImageView Lock5;
    @FXML
    private ImageView Lock6;
    @FXML
    private ImageView Lock7;
    @FXML
    private ImageView Lock8;
    @FXML
    private ImageView Lock9;
    @FXML
    private ImageView Lock10;
    private Image image2;
    private int totalPuntos;
    @FXML
    private ImageView GIF;
    @FXML
    private Label lbl1;
    @FXML
    private Label lbl2;
    @FXML
    private Label lbl3;
    @FXML
    private Label lbl4;
    @FXML
    private Label lbl5;
    @FXML
    private Label lbl6;
    @FXML
    private Label lbl7;
    @FXML
    private Label lbl8;
    @FXML
    private Label lbl9;

    public SeleccionNivelController() {
        this.image2 = new Image("/pacmanfx/resources/pacmanSegundaOportunidad.gif");
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize() {

    }

    @FXML
    private void Volver(MouseEvent event) {
        FlowController.getInstance().initialize();
        FlowController.getInstance().goViewInStage("Menu", this.getStage());
    }

    /*
     *  Los niveles tienen una condicicion antes para ver si estan desbloqueados 
     */
    @FXML
    private void Nivel1(MouseEvent event) {
        /*
         *  pongo la imagen de fondo en el frente para que no se vean los botones y demmas
         *  le cambio la imagen al fondo por un gif y cuando termina el tiempo llamo a la otra vista
         */
        omg.toFront();
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(omg.imageProperty(), image2)),
                new KeyFrame(Duration.seconds(1), new KeyValue(omg.imageProperty(), image2)),
                new KeyFrame(Duration.seconds(5), new KeyValue(omg.imageProperty(), null))
        );
        /*
         *  Audio de inicio del juego
         */
        Platform.runLater(() -> {
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/pacmanfx/audio/start_music.wav"));
            sonido.play();
        });
        timeline.play();
        timeline.setOnFinished(value -> {
            FlowController.getInstance().initialize();
            FlowController.getInstance().goViewInStage("Nivel1", this.getStage());
        });
    }

    @FXML
    private void Nivel2(MouseEvent event) {
        if (totalPuntos+MenuController.PuntosTotales >= 1000) {
            /*
             *  pongo la imagen de fondo en el frente para que no se vean los botones y demmas
             *  le cambio la imagen al fondo por un gif y cuando termina el tiempo llamo a la otra vista
             */
            omg.toFront();
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(1), new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(5), new KeyValue(omg.imageProperty(), null))
            );
            /*
             *  Audio de inicio del juego
             */
            Platform.runLater(() -> {
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/pacmanfx/audio/start_music.wav"));
                sonido.play();
            });
            timeline.play();
            timeline.setOnFinished(value -> {
                FlowController.getInstance().initialize();
                FlowController.getInstance().goViewInStage("Nivel2", this.getStage());
            });
        }
    }

    @FXML
    private void Nivel3(MouseEvent event) {
        if (totalPuntos+MenuController.PuntosTotales >= 2000) {
            /*
             *  pongo la imagen de fondo en el frente para que no se vean los botones y demmas
             *  le cambio la imagen al fondo por un gif y cuando termina el tiempo llamo a la otra vista
             */
            omg.toFront();
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(1), new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(5), new KeyValue(omg.imageProperty(), null))
            );
            /*
             *  Audio de inicio del juego
             */
            Platform.runLater(() -> {
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/pacmanfx/audio/start_music.wav"));
                sonido.play();
            });
            timeline.play();
            timeline.setOnFinished(value -> {
                FlowController.getInstance().initialize();
                FlowController.getInstance().goViewInStage("Nivel3", this.getStage());
            });
        }
    }

    @FXML
    private void Nivel4(MouseEvent event) {
        if (totalPuntos+MenuController.PuntosTotales >= 3000) {
            /*
             *  pongo la imagen de fondo en el frente para que no se vean los botones y demmas
             *  le cambio la imagen al fondo por un gif y cuando termina el tiempo llamo a la otra vista
             */
            omg.toFront();
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(1), new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(5), new KeyValue(omg.imageProperty(), null))
            );
            /*
             *  Audio de inicio del juego
             */
            Platform.runLater(() -> {
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/pacmanfx/audio/start_music.wav"));
                sonido.play();
            });
            timeline.play();
            timeline.setOnFinished(value -> {
                FlowController.getInstance().initialize();
                FlowController.getInstance().goViewInStage("Nivel4", this.getStage());
            });
        }
    }

    @FXML
    private void Nivel5(MouseEvent event) {
        if (totalPuntos+MenuController.PuntosTotales >= 4000) {
            /*
             *  pongo la imagen de fondo en el frente para que no se vean los botones y demmas
             *  le cambio la imagen al fondo por un gif y cuando termina el tiempo llamo a la otra vista
             */
            omg.toFront();
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(1), new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(5), new KeyValue(omg.imageProperty(), null))
            );
            /*
             *  Audio de inicio del juego
             */
            Platform.runLater(() -> {
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/pacmanfx/audio/start_music.wav"));
                sonido.play();
            });
            timeline.play();
            timeline.setOnFinished(value -> {
                FlowController.getInstance().initialize();
                FlowController.getInstance().goViewInStage("Nivel5", this.getStage());
            });
        }
    }

    @FXML
    private void Nivel6(MouseEvent event) {
        if (totalPuntos+MenuController.PuntosTotales >= 5000) {
            /*
             *  pongo la imagen de fondo en el frente para que no se vean los botones y demmas
             *  le cambio la imagen al fondo por un gif y cuando termina el tiempo llamo a la otra vista
             */
            omg.toFront();
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(1), new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(5), new KeyValue(omg.imageProperty(), null))
            );
            /*
             *  Audio de inicio del juego
             */
            Platform.runLater(() -> {
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/pacmanfx/audio/start_music.wav"));
                sonido.play();
            });
            timeline.play();
            timeline.setOnFinished(value -> {
                FlowController.getInstance().initialize();
                FlowController.getInstance().goViewInStage("Nivel6", this.getStage());
            });
        }
    }

    @FXML
    private void Nivel7(MouseEvent event) {
        if (totalPuntos+MenuController.PuntosTotales >= 6000) {
            /*
             *  pongo la imagen de fondo en el frente para que no se vean los botones y demmas
             *  le cambio la imagen al fondo por un gif y cuando termina el tiempo llamo a la otra vista
             */
            omg.toFront();
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(1), new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(5), new KeyValue(omg.imageProperty(), null))
            );
            /*
             *  Audio de inicio del juego
             */
            Platform.runLater(() -> {
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/pacmanfx/audio/start_music.wav"));
                sonido.play();
            });
            timeline.play();
            timeline.setOnFinished(value -> {
                FlowController.getInstance().initialize();
                FlowController.getInstance().goViewInStage("Nivel7", this.getStage());
            });
        }
    }

    @FXML
    private void Nivel8(MouseEvent event) {
        if (totalPuntos+MenuController.PuntosTotales >= 7000) {
            /*
             *  pongo la imagen de fondo en el frente para que no se vean los botones y demmas
             *  le cambio la imagen al fondo por un gif y cuando termina el tiempo llamo a la otra vista
             */
            omg.toFront();
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(1), new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(5), new KeyValue(omg.imageProperty(), null))
            );
            /*
             *  Audio de inicio del juego
             */
            Platform.runLater(() -> {
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/pacmanfx/audio/start_music.wav"));
                sonido.play();
            });
            timeline.play();
            timeline.setOnFinished(value -> {
                FlowController.getInstance().initialize();
                FlowController.getInstance().goViewInStage("Nivel8", this.getStage());
            });
        }
    }

    @FXML
    private void Nivel9(MouseEvent event) {
        if (totalPuntos+MenuController.PuntosTotales >= 8000) {
            /*
             *  pongo la imagen de fondo en el frente para que no se vean los botones y demmas
             *  le cambio la imagen al fondo por un gif y cuando termina el tiempo llamo a la otra vista
             */
            omg.toFront();
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(1), new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(5), new KeyValue(omg.imageProperty(), null))
            );
            /*
             *  Audio de inicio del juego
             */
            Platform.runLater(() -> {
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/pacmanfx/audio/start_music.wav"));
                sonido.play();
            });
            timeline.play();
            timeline.setOnFinished(value -> {
                FlowController.getInstance().initialize();
                FlowController.getInstance().goViewInStage("Nivel9", this.getStage());
            });
        }
    }

    @FXML
    private void Nivel10(MouseEvent event) {
        if (totalPuntos+MenuController.PuntosTotales >= 9000) {
            /*
             *  pongo la imagen de fondo en el frente para que no se vean los botones y demmas
             *  le cambio la imagen al fondo por un gif y cuando termina el tiempo llamo a la otra vista
             */
            omg.toFront();
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(1), new KeyValue(omg.imageProperty(), image2)),
                    new KeyFrame(Duration.seconds(5), new KeyValue(omg.imageProperty(), null))
            );
            /*
             *  Audio de inicio del juego
             */
            Platform.runLater(() -> {
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/pacmanfx/audio/start_music.wav"));
                sonido.play();
            });
            timeline.play();
            timeline.setOnFinished(value -> {
                FlowController.getInstance().initialize();
                FlowController.getInstance().goViewInStage("Nivel10", this.getStage());
            });
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        hiloTiempo.finalizado = true;
        hiloTiempo.finalizado2 = true;
        try {
            File f11 = new File(".");
            String dir11 = f11.getAbsolutePath();
            String fileName11 = dir11 + "\\src\\pacmanfx\\resources\\Dificultad.txt";
            File file11 = new File(fileName11);
            FileReader fr11 = new FileReader(file11);
            BufferedReader br11 = new BufferedReader(fr11);
            String line11;
            while ((line11 = br11.readLine()) != null) {
                dificultad = Integer.parseInt(line11);
            }
            File f = new File(".");
            String dir = f.getAbsolutePath();
            /*
             *   si la dificultad es 1 entonces leemoos los niveles completados en facil, si es 2 leemos los niveles completados en intermedio
             *   y si es 3 leemos los niveles completados en difícil
             */
            String fileName = (dificultad == 1) ? (dir + "\\src\\pacmanfx\\resources\\Nivel1Completado.txt")
                    : (dificultad == 2) ? (dir + "\\src\\pacmanfx\\resources\\IntNivel1Completado.txt")
                            : (dir + "\\src\\pacmanfx\\resources\\DifNivel1Completado.txt");
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                n1 = Integer.parseInt(line);
            }
            File f2 = new File(".");
            String dir2 = f2.getAbsolutePath();
            /*
             *   si la dificultad es 1 entonces leemoos los niveles completados en facil, si es 2 leemos los niveles completados en intermedio
             *   y si es 3 leemos los niveles completados en difícil
             */
            String fileName2 = (dificultad == 1) ? (dir2 + "\\src\\pacmanfx\\resources\\Nivel2Completado.txt")
                    : (dificultad == 2) ? (dir + "\\src\\pacmanfx\\resources\\IntNivel2Completado.txt")
                            : (dir + "\\src\\pacmanfx\\resources\\DifNivel2Completado.txt");
            File file2 = new File(fileName2);
            FileReader fr2 = new FileReader(file2);
            BufferedReader br2 = new BufferedReader(fr2);
            String line2;
            while ((line2 = br2.readLine()) != null) {
                n2 = Integer.parseInt(line2);
            }
            File f3 = new File(".");
            String dir3 = f3.getAbsolutePath();
            /*
             *   si la dificultad es 1 entonces leemoos los niveles completados en facil, si es 2 leemos los niveles completados en intermedio
             *   y si es 3 leemos los niveles completados en difícil
             */
            String fileName3 = (dificultad == 1) ? (dir3 + "\\src\\pacmanfx\\resources\\Nivel3Completado.txt")
                    : (dificultad == 2) ? (dir + "\\src\\pacmanfx\\resources\\IntNivel3Completado.txt")
                            : (dir + "\\src\\pacmanfx\\resources\\DifNivel3Completado.txt");
            File file3 = new File(fileName3);
            FileReader fr3 = new FileReader(file3);
            BufferedReader br3 = new BufferedReader(fr3);
            String line3;
            while ((line3 = br3.readLine()) != null) {
                n3 = Integer.parseInt(line3);
            }
            File f4 = new File(".");
            String dir4 = f4.getAbsolutePath();
            /*
             *   si la dificultad es 1 entonces leemoos los niveles completados en facil, si es 2 leemos los niveles completados en intermedio
             *   y si es 3 leemos los niveles completados en difícil
             */
            String fileName4 = (dificultad == 1) ? (dir4 + "\\src\\pacmanfx\\resources\\Nivel4Completado.txt")
                    : (dificultad == 2) ? (dir + "\\src\\pacmanfx\\resources\\IntNivel4Completado.txt")
                            : (dir + "\\src\\pacmanfx\\resources\\DifNivel4Completado.txt");
            File file4 = new File(fileName4);
            FileReader fr4 = new FileReader(file4);
            BufferedReader br4 = new BufferedReader(fr4);
            String line4;
            while ((line4 = br4.readLine()) != null) {
                n4 = Integer.parseInt(line4);
            }
            File f5 = new File(".");
            String dir5 = f5.getAbsolutePath();
            /*
             *   si la dificultad es 1 entonces leemoos los niveles completados en facil, si es 2 leemos los niveles completados en intermedio
             *   y si es 3 leemos los niveles completados en difícil
             */
            String fileName5 = (dificultad == 1) ? (dir + "\\src\\pacmanfx\\resources\\Nivel5Completado.txt")
                    : (dificultad == 2) ? (dir + "\\src\\pacmanfx\\resources\\IntNivel5Completado.txt")
                            : (dir + "\\src\\pacmanfx\\resources\\DifNivel5Completado.txt");
            File file5 = new File(fileName5);
            FileReader fr5 = new FileReader(file5);
            BufferedReader br5 = new BufferedReader(fr5);
            String line5;
            while ((line5 = br5.readLine()) != null) {
                n5 = Integer.parseInt(line5);
            }
            File f6 = new File(".");
            String dir6 = f6.getAbsolutePath();
            /*
             *   si la dificultad es 1 entonces leemoos los niveles completados en facil, si es 2 leemos los niveles completados en intermedio
             *   y si es 3 leemos los niveles completados en difícil
             */
            String fileName6 = (dificultad == 1) ? (dir6 + "\\src\\pacmanfx\\resources\\Nivel6Completado.txt")
                    : (dificultad == 2) ? (dir + "\\src\\pacmanfx\\resources\\IntNivel6Completado.txt")
                            : (dir + "\\src\\pacmanfx\\resources\\DifNivel6Completado.txt");
            File file6 = new File(fileName6);
            FileReader fr6 = new FileReader(file6);
            BufferedReader br6 = new BufferedReader(fr6);
            String line6;
            while ((line6 = br6.readLine()) != null) {
                n6 = Integer.parseInt(line6);
            }
            File f7 = new File(".");
            String dir7 = f7.getAbsolutePath();
            /*
             *   si la dificultad es 1 entonces leemoos los niveles completados en facil, si es 2 leemos los niveles completados en intermedio
             *   y si es 3 leemos los niveles completados en difícil
             */
            String fileName7 = (dificultad == 1) ? (dir7 + "\\src\\pacmanfx\\resources\\Nivel7Completado.txt")
                    : (dificultad == 2) ? (dir + "\\src\\pacmanfx\\resources\\IntNivel7Completado.txt")
                            : (dir + "\\src\\pacmanfx\\resources\\DifNivel7Completado.txt");
            File file7 = new File(fileName7);
            FileReader fr7 = new FileReader(file7);
            BufferedReader br7 = new BufferedReader(fr7);
            String line7;
            while ((line7 = br7.readLine()) != null) {
                n7 = Integer.parseInt(line7);
            }
            File f8 = new File(".");
            String dir8 = f8.getAbsolutePath();
            /*
             *   si la dificultad es 1 entonces leemoos los niveles completados en facil, si es 2 leemos los niveles completados en intermedio
             *   y si es 3 leemos los niveles completados en difícil
             */
            String fileName8 = (dificultad == 1) ? (dir8 + "\\src\\pacmanfx\\resources\\Nivel8Completado.txt")
                    : (dificultad == 2) ? (dir + "\\src\\pacmanfx\\resources\\IntNivel8Completado.txt")
                            : (dir + "\\src\\pacmanfx\\resources\\DifNivel8Completado.txt");
            File file8 = new File(fileName8);
            FileReader fr8 = new FileReader(file8);
            BufferedReader br8 = new BufferedReader(fr8);
            String line8;
            while ((line8 = br8.readLine()) != null) {
                n8 = Integer.parseInt(line8);
            }
            File f9 = new File(".");
            String dir9 = f9.getAbsolutePath();
            /*
                si la dificultad es 1 entonces leemoos los niveles completados en facil, si es 2 leemos los niveles completados en intermedio
                y si es 3 leemos los niveles completados en difícil
             */
            String fileName9 = (dificultad == 1) ? (dir9 + "\\src\\pacmanfx\\resources\\Nivel9Completado.txt")
                    : (dificultad == 2) ? (dir + "\\src\\pacmanfx\\resources\\IntNivel9Completado.txt")
                            : (dir + "\\src\\pacmanfx\\resources\\DifNivel9Completado.txt");
            File file9 = new File(fileName9);
            FileReader fr9 = new FileReader(file9);
            BufferedReader br9 = new BufferedReader(fr9);
            String line9;
            while ((line9 = br9.readLine()) != null) {
                n9 = Integer.parseInt(line9);
            }
            File f10 = new File(".");
            String dir10 = f10.getAbsolutePath();
            /*
                si la dificultad es 1 entonces leemoos los niveles completados en facil, si es 2 leemos los niveles completados en intermedio
                y si es 3 leemos los niveles completados en difícil
             */
            String fileName10 = (dificultad == 1) ? (dir10 + "\\src\\pacmanfx\\resources\\Nivel10Completado.txt")
                    : (dificultad == 2) ? (dir + "\\src\\pacmanfx\\resources\\IntNivel10Completado.txt")
                            : (dir + "\\src\\pacmanfx\\resources\\DifNivel10Completado.txt");
            File file10 = new File(fileName10);
            FileReader fr10 = new FileReader(file10);
            BufferedReader br10 = new BufferedReader(fr10);
            String line10;
            while ((line10 = br10.readLine()) != null) {
                n10 = Integer.parseInt(line10);
            }
            
            File f12 = new File(".");
            String dir12 = f12.getAbsolutePath();
            /*
             *   si la dificultad es 1 entonces leemoos los niveles completados en facil, si es 2 leemos los niveles completados en intermedio
             *   y si es 3 leemos los niveles completados en difícil
             */
            String fileName12 = dir12 + "\\src\\pacmanfx\\resources\\TotalPuntosGanados.txt";
            File file12 = new File(fileName12);
            FileReader fr12 = new FileReader(file12);
            BufferedReader br12 = new BufferedReader(fr12);
            String line12;
            while ((line12 = br12.readLine()) != null) {
                totalPuntos = Integer.parseInt(line12);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        }

        omg.setImage(new Image("/pacmanfx/resources/fondo8.jpg"));

        img1.setImage(new Image("/pacmanfx/resources/FondoNivel1.jpg"));

        if (totalPuntos+MenuController.PuntosTotales < 1000) {
            img2.setImage(new Image("/pacmanfx/resources/FondoNivel2Lock.jpg"));
            Lock2.setImage(new Image("/pacmanfx/resources/lock2.png"));
            lbl1.setVisible(true);
        } else {
            img2.setImage(new Image("/pacmanfx/resources/FondoNivel22.jpg"));
            lbl1.setVisible(false);
        }
        if (totalPuntos+MenuController.PuntosTotales < 2000) {
            img3.setImage(new Image("/pacmanfx/resources/FondoNivel3Lock.jpg"));
            Lock3.setImage(new Image("/pacmanfx/resources/lock2.png"));
            lbl2.setVisible(true);
        } else {
            img3.setImage(new Image("/pacmanfx/resources/FondoNivel3.jpg"));
            lbl2.setVisible(false);
        }
        if (totalPuntos+MenuController.PuntosTotales < 3000) {
            img4.setImage(new Image("/pacmanfx/resources/FondoNivel4Lock.jpg"));
            Lock4.setImage(new Image("/pacmanfx/resources/lock2.png"));
            lbl3.setVisible(true);
        } else {
            img4.setImage(new Image("/pacmanfx/resources/FondoNivel4.jpg"));
            lbl3.setVisible(false);
        }

        if (totalPuntos+MenuController.PuntosTotales < 4000) {
            img5.setImage(new Image("/pacmanfx/resources/FondoNivel5Lock.jpg"));
            Lock5.setImage(new Image("/pacmanfx/resources/lock2.png"));
            lbl4.setVisible(true);
        } else {
            img5.setImage(new Image("/pacmanfx/resources/FondoNivel5.jpg"));
            lbl4.setVisible(false);
        }
        if (totalPuntos+MenuController.PuntosTotales < 5000) {
            img6.setImage(new Image("/pacmanfx/resources/FondoNivel6Lock.jpg"));
            Lock6.setImage(new Image("/pacmanfx/resources/lock2.png"));
            lbl5.setVisible(true);
        } else {
            img6.setImage(new Image("/pacmanfx/resources/FondoNivel6.jpg"));
            lbl5.setVisible(false);
        }
        if (totalPuntos+MenuController.PuntosTotales < 6000) {
            img7.setImage(new Image("/pacmanfx/resources/FondoNivel7Lock.jpg"));
            Lock7.setImage(new Image("/pacmanfx/resources/lock2.png"));
            lbl6.setVisible(true);
        } else {
            img7.setImage(new Image("/pacmanfx/resources/FondoNivel7.jpg"));
            lbl6.setVisible(false);
        }
        if (totalPuntos+MenuController.PuntosTotales < 7000) {
            img8.setImage(new Image("/pacmanfx/resources/FondoNivel8Lock.jpg"));
            Lock8.setImage(new Image("/pacmanfx/resources/lock2.png"));
            lbl7.setVisible(true);
        } else {
            img8.setImage(new Image("/pacmanfx/resources/FondoNivel8.jpg"));
            lbl7.setVisible(false);
        }
        if (totalPuntos+MenuController.PuntosTotales < 8000) {
            img9.setImage(new Image("/pacmanfx/resources/FondoNivel9Lock.jpg"));
            Lock9.setImage(new Image("/pacmanfx/resources/lock2.png"));
            lbl8.setVisible(true);
        } else {
            img9.setImage(new Image("/pacmanfx/resources/FondoNivel9.jpg"));
            lbl8.setVisible(false);
        }
        if (totalPuntos+MenuController.PuntosTotales < 9000) {
            img10.setImage(new Image("/pacmanfx/resources/FondoNivel10Lock.jpg"));
            Lock10.setImage(new Image("/pacmanfx/resources/lock2.png"));
            lbl9.setVisible(true);
        } else {
            img10.setImage(new Image("/pacmanfx/resources/FondoNivel10.jpg"));
            lbl9.setVisible(false);
        }
    }
}
