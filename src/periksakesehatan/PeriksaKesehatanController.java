/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periksakesehatan;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import java.lang.String;

/**
 * FXML Controller class
 *
 * @author BangKho
 */
public class PeriksaKesehatanController implements Initializable {

    @FXML
    private JFXTextArea hasil;
    @FXML
    private JFXTextArea saran;
    @FXML
    private JFXTextField fieldnama;
    @FXML
    private JFXTextField fieldtinggi;
    @FXML
    private JFXTextField fieldbb;
    @FXML
    private JFXRadioButton rdlk;
    @FXML
    private ToggleGroup kelamin;
    @FXML
    private JFXRadioButton rdpr;
    @FXML
    private JFXButton proses;
    @FXML
    private JFXButton hapus;
    @FXML
    private Label kg;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void prosesCek(ActionEvent event) {
        String Hasil;
        String Saran;
        int ideal;
        String nama = fieldnama.getText();
        int tinggi = parseInt(fieldtinggi.getText().toString());
        int berat = parseInt(fieldbb.getText().toString());
        
        if(rdlk.isSelected()){
            ideal = tinggi - 105;
            String i=String.valueOf(ideal);
            if(ideal==berat){
                Saran = "Bagus!!! Tetap jagalah berat badan Anda\n"
                        + "dan tetap makan makanan bergisi serta \n"
                        + "tetap Olahraga teratur.";
                Hasil = "Berat badan Anda Ideal";
            } else if(berat<ideal){
                Saran = "Anda Kekurangan berat badan, \n"
                        + "Cobalah menambah Porsi makanan bergizi,\n"
                        + " Perbanyaklah memakan serat dan karbohidrat.";
                Hasil = "Berat badan Anda Underweight";
            } else{
                Saran = "Anda Kelebihan berat badan \n"
                        + "Cobalah diet secara teratur, Berolahraga,\n"
                        + " dan menjaga pola makan Anda.";
                Hasil = "Berat badan Anda Overweight";
            }
            kg.setText(i);
            hasil.setText(nama+", "+Hasil);
            saran.setText(Saran);
        } else if(rdpr.isSelected()){
            ideal = tinggi - 110;
            String i=String.valueOf(ideal);
            if(ideal==berat){
                Saran = "Bagus!!! Tetap jagalah berat badan Anda\n"
                        + "dan tetap makan makanan bergisi serta \n"
                        + "tetap Olahraga teratur.";
                Hasil = "Berat badan Anda Ideal";
            } else if(berat<ideal){
                Saran = "Anda Kekurangan berat badan, \n"
                        + "Cobalah menambah Porsi makanan bergizi,\n"
                        + " Perbanyaklah memakan serat dan karbohidrat.";
                Hasil = "Berat badan Anda Underweight";
            } else{
                Saran = "Anda Kelebihan berat badan \n"
                        + "Cobalah diet secara teratur, Berolahraga,\n"
                        + " dan menjaga pola makan Anda.";
                Hasil = "Berat badan Anda Overweight";
            }
            kg.setText(i);
            hasil.setText(nama+", "+Hasil);
            saran.setText(Saran);
        }
    }

    @FXML
    private void clear(ActionEvent event) {
        fieldnama.setText("");
        fieldtinggi.setText("");
        fieldbb.setText("");
        hasil.setText("");
        saran.setText("");
        rdlk.setSelected(false);
        rdpr.setSelected(false);
        kg.setText("");
    }
    
}
