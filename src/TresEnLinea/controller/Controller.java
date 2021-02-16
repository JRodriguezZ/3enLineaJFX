package TresEnLinea.controller;

import TresEnLinea.Jugador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.nio.charset.StandardCharsets;
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

    int torn = 0;
    String x = "X";
    String o = "O";

    public void tirada(ActionEvent actionEvent) {
        torn++;
        ToggleButton b = (ToggleButton) actionEvent.getSource();

        if (torn %2 == 0){

            do {
                if (b.getText().equals("")) {
                    b.setText("O");
                }
            } while (!b.getText().equals(""));
            tornDisplay.setText("Torn del jugador 1");
        } else {
            if (b.getText().equals("")) {
            b.setText("X");
        }
            tornDisplay.setText("Torn del jugador 2");
        }
    }

    public void startNovaPartida(ActionEvent actionEvent) {

        Jugador j1 = new Jugador(nomJugador1.toString());

        Jugador j2 = new Jugador(nomJugador2.toString());

        torn = 0;

        casella00.setText("");
        casella10.setText("");
        casella20.setText("");
        casella01.setText("");
        casella11.setText("");
        casella21.setText("");
        casella02.setText("");
        casella12.setText("");
        casella22.setText("");
    }
}
