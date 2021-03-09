/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempiojavafxconvertitore;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Alessandra Vetrugno
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private ComboBox<String> cmbConversioni;
    @FXML
    private TextField txtIniziale;
    
    private GestioneConversioni manager;
    @FXML
    private Label label1;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        double valore = Double.valueOf(txtIniziale.getText());
        System.out.println(manager);
        manager.getItems();
        String s = cmbConversioni.getValue();
        double convertito = manager.faiConversione(s, valore);
        label.setText(" " + convertito);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        manager = new GestioneConversioni();
        
        manager.add(new Convertitore("Euro", "Dollaro", 1.10));
        manager.add(new Convertitore("Euro", "Lek", 122.45));
        manager.add(new Convertitore("Euro", "Leu", 4.78));
        manager.add(new Convertitore("Euro", "Rublo Russo", 70.41));
        manager.add(new Convertitore("Euro", "Sterline", 0.85));
        manager.add(new Convertitore("Euro", "Yen", 119.85));
        manager.add(new Convertitore("Dollaro", "Euro", 1.0936));
        manager.add(new Convertitore("Lek", "Euro", 0.0082));
        manager.add(new Convertitore("Leu", "Euro", 0.21));
        manager.add(new Convertitore("Yen", "Euro", 0.0083));
        manager.add(new Convertitore("Sterline", "Euro", 1.16));
        manager.add(new Convertitore("Rublo Russo", "Euro", 0.014));
        manager.add(new Convertitore("Rublo Russo", "Dollaro canadese", 0.123));
        cmbConversioni.getItems().addAll(manager.getItems());
        
    }    
    
}
