package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controller {
	private Random rand = new Random();
	@FXML
	TextField textField;
	@FXML 
	Pane myPane;

	
	public void dateTime(ActionEvent e) {	//get current date and time, format into a string, and write the string to the text box
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateAndTime = now.format(formatter);
		textField.setText(formattedDateAndTime);
	}
	public void write(ActionEvent e) throws IOException { //use buffered writer to write date and time to file
		BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"));
		writer.write(textField.getText());
		writer.close();
	}
	public void changeShadeOfGreen(ActionEvent e) { //change background color to shade of green
		double green = rand.nextDouble();
		Color randomGreen = Color.rgb(0, (int)(green * 255), 0);
		myPane.setBackground(new Background(new BackgroundFill(randomGreen, null, null)));
	}
	public void quit(ActionEvent e) {
		Platform.exit();
		
	}
	
	
}
