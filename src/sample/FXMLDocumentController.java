package sample;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


class Film{
    public String tittel;
    public double utLeiePris;
    public Person leidAv;

    // konstruktør inn her

}

class Person{
    public String navn;
    public String telefonnr;

    // konstruktør inn her
}

class FilmUtleie{

    // instansier arrayet her

    public FilmUtleie() {

        // legg inn filmene som skal være til utleie her
        // to filmer holder
    }

    public String leiUt(String navn, String telefonnr, String tittel){
        // sjekk om filmen finnes og at den ikke er leid ut (at leidAv er null)
        // returner meldinger om det var vellykket utleie
        // om ikke filmen fantes
        // eller om filmen fantes men den var utleid

        return "";

    }

    public String leverInn(String tittel){
        // sjekk om filmen finnes og at den er utleid (at det er et personobjekt på leidAv)
        // dersom dette nullstill person-pekeren i filmen og returner at den ble levert
        // returner feilmelding dersom filmen ikke finnes
        // returner også feilmelding dersom filmen finnes med ikke er utleid

        return "";

    }

    @Override
    public String toString(){
        // løp igjennom hele registrert og formater

        return "";

    }
}


public class FXMLDocumentController {

    // instansier Filmutleien her

    @FXML
    public TextField txtKundeNavn;

    @FXML
    public TextField txtKundeTelefon;

    @FXML
    public TextField txtFilmTittel;

    @FXML
    public Label lblOversikt;

    @FXML
    public void leiUt(ActionEvent event) {
        // kall leiUt og legg resultatet i oversikts-labelen
    }

    @FXML
    public void leverInn(ActionEvent event) {
        // kall lever inn og legg resultatet i oversikts-labelen
    }

    @FXML
    public void visUtleie(ActionEvent event) {
        // kall toString metoden og legg resultatet i oversikts-labelen
    }
}