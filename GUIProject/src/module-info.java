module GUIProject {
	requires javafx.controls;
	requires java.desktop;
	requires javafx.fxml;
	
	opens hust.soict.dsai.javafx to javafx.graphics, javafx.fxml;
}
