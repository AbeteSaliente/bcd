package it.edu.iisgubbio.github;

import java.util.Hashtable;

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
		
		pConv.setOnAction(e->Converti());
	}
	
	public void Converti() {
		String vett[] = tNum.getText().split("");
		String num = "";
		
		Hashtable <String,String> convBCD =  new Hashtable <String,String>();
		
		convBCD.put("0", "0000");
		convBCD.put("1", "0001");
		convBCD.put("2", "0010");
		convBCD.put("3", "0011");
		convBCD.put("4", "0100");
		convBCD.put("5", "0101");
		convBCD.put("6", "0110");
		convBCD.put("7", "0111");
		convBCD.put("8", "1000");
		convBCD.put("9", "1001");
		
		for(int i = 0; i < vett.length; i++) {
			num += convBCD.get(vett[i]);
		}
		
		lRisu.setText(num);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
