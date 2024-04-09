package it.edu.iisgubbio.github;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class conversioneBCD_verifica extends Application {
	
	TextField tNum = new TextField();
	Button pConv = new Button("Converti");
	Label lRisu = new Label("Risultato");
	
	public void start(Stage finestra) {
		GridPane griglia = new GridPane();
		Scene scena = new Scene(griglia, 300, 150);
		finestra.setScene(scena);
		finestra.setTitle("Conversione BCD verifica");
		finestra.show();
		
		griglia.add(tNum, 0, 0);
		griglia.add(pConv, 0, 1);
		griglia.add(lRisu, 0, 2);
		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10);
		griglia.setVgap(10);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
