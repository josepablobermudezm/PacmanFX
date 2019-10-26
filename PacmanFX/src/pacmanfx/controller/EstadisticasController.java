/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmanfx.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import static pacmanfx.controller.MenuController.PuntosTotales;
import pacmanfx.util.FlowController;

/**
 * FXML Controller class
 *
 * @author Jose Pablo Bermudez
 */
public class EstadisticasController extends Controller implements Initializable {

    @FXML
    private ImageView omg;
    @FXML
    private Label lblVolver;
    @FXML
    private Label lblTotalPuntos;
    @FXML
    private Label lblPuntosPartida;
    @FXML
    private Label lblPuntosPartidaVida;
    @FXML
    private Label lblVidasPerdidas;
    @FXML
    private Label lblNivel1;
    @FXML
    private Label lblNivel2;
    @FXML
    private Label lblNivel3;
    @FXML
    private Label lblNivel4;
    @FXML
    private Label lblNivel5;
    @FXML
    private Label lblNivel6;
    @FXML
    private Label lblNivel7;
    @FXML
    private Label lblNivel8;
    @FXML
    private Label lblNivel9;
    @FXML
    private Label lblNivel10;
    @FXML
    private Label lblTiempo1;
    @FXML
    private Label lblTiempo2;
    @FXML
    private Label lblTiempo3;
    @FXML
    private Label lblTiempo4;
    @FXML
    private Label lblTiempo5;
    @FXML
    private Label lblTiempo6;
    @FXML
    private Label lblTiempo7;
    @FXML
    private Label lblTiempo8;
    @FXML
    private Label lblTiempo9;
    @FXML
    private Label lblTiempo10;
    @FXML
    private Label lblFantasmasComidos;
    @FXML
    private Label lblTiempoTotalJuego;
    static public boolean estadisticas = false;
    int aux = 0, aux1 = 0, ContNivel1 = 0,ContNivel2 = 0, ContNivel3 = 0,ContNivel4 = 0, ContNivel5 = 0, ContNivel6 = 0, ContNivel7 = 0, ContNivel8 = 0, ContNivel9 = 0, ContNivel10 = 0;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        estadisticas = true;
        omg.setImage(new Image("/pacmanfx/resources/fondo8.jpg"));
        try {
            File f = new File(".");
            String dir = f.getAbsolutePath();
            String fileName = dir + "\\src\\pacmanfx\\resources\\TotalPuntosGanados.txt";
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                aux = Integer.parseInt(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            File f = new File(".");
            String dir = f.getAbsolutePath();
            String fileName = dir + "\\src\\pacmanfx\\resources\\MayorCantidadDePuntosPartida.txt";
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                aux1 = Integer.parseInt(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            File f = new File(".");
            String dir = f.getAbsolutePath();
            String fileName = dir + "\\src\\pacmanfx\\resources\\Partidas1.txt";
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                ContNivel1 = Integer.parseInt(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            File f = new File(".");
            String dir = f.getAbsolutePath();
            String fileName = dir + "\\src\\pacmanfx\\resources\\Partidas2.txt";
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                ContNivel2 = Integer.parseInt(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            File f = new File(".");
            String dir = f.getAbsolutePath();
            String fileName = dir + "\\src\\pacmanfx\\resources\\Partidas3.txt";
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                ContNivel3 = Integer.parseInt(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            File f = new File(".");
            String dir = f.getAbsolutePath();
            String fileName = dir + "\\src\\pacmanfx\\resources\\Partidas4.txt";
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                ContNivel4 = Integer.parseInt(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            File f = new File(".");
            String dir = f.getAbsolutePath();
            String fileName = dir + "\\src\\pacmanfx\\resources\\Partidas5.txt";
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                ContNivel5 = Integer.parseInt(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            File f = new File(".");
            String dir = f.getAbsolutePath();
            String fileName = dir + "\\src\\pacmanfx\\resources\\Partidas6.txt";
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                ContNivel6 = Integer.parseInt(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            File f = new File(".");
            String dir = f.getAbsolutePath();
            String fileName = dir + "\\src\\pacmanfx\\resources\\Partidas7.txt";
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                ContNivel7 = Integer.parseInt(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            File f = new File(".");
            String dir = f.getAbsolutePath();
            String fileName = dir + "\\src\\pacmanfx\\resources\\Partidas8.txt";
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                ContNivel8 = Integer.parseInt(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            File f = new File(".");
            String dir = f.getAbsolutePath();
            String fileName = dir + "\\src\\pacmanfx\\resources\\Partidas9.txt";
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                ContNivel9 = Integer.parseInt(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            File f = new File(".");
            String dir = f.getAbsolutePath();
            String fileName = dir + "\\src\\pacmanfx\\resources\\Partidas10.txt";
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                ContNivel10 = Integer.parseInt(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JugadorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblNivel1.setText(String.valueOf(ContNivel1));
        lblNivel2.setText(String.valueOf(ContNivel2));
        lblNivel3.setText(String.valueOf(ContNivel3));
        lblNivel4.setText(String.valueOf(ContNivel4));
        lblNivel5.setText(String.valueOf(ContNivel5));
        lblNivel6.setText(String.valueOf(ContNivel6));
        lblNivel7.setText(String.valueOf(ContNivel7));
        lblNivel8.setText(String.valueOf(ContNivel8));
        lblNivel9.setText(String.valueOf(ContNivel9));
        lblNivel10.setText(String.valueOf(ContNivel10));
        lblTotalPuntos.setText(String.valueOf(PuntosTotales + aux));
        lblPuntosPartida.setText(String.valueOf(aux1));
    }

    @Override
    public void initialize() {
        omg.setImage(new Image("/pacmanfx/resources/fondo8.jpg"));
    }

    @FXML
    private void Volver(MouseEvent event) {
        FlowController.getInstance().initialize();
        FlowController.getInstance().goViewInStage("Jugador", this.getStage());
    }

}
