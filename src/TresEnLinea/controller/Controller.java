package TresEnLinea.controller;

import TresEnLinea.Jugador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ToggleButton casella00, casella10, casella20, casella01, casella11, casella21, casella02, casella12, casella22;

    @FXML
    private TextField nomJugador1, nomJugador2;

    @FXML
    private MenuItem menuItemReinciar, menuItemTancar, menuItemFosc, menuItemClar, menuItemClassificacio, menuItemGuia, menuItemSobre;

    @FXML
    private Label tornDisplay;

    @FXML
    private Button botoNovaPartida;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void tirada(ActionEvent actionEvent) {

        casella00.setText("X");
    }

    public void startNovaPartida(ActionEvent actionEvent) {
        String nomJugador = nomJugador1.toString();

        Jugador j1 = new Jugador(nomJugador);
        casella00.setText("");
    }
}
