module Mod3CT {
	opens application to javafx.fxml;
	exports application;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
}