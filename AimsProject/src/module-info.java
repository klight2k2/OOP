/**
 * 
 */
/**
 * @author quang.phamminh2
 *
 */
module AimsProject {
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.fxml;
	requires javafx.swing;
	requires javafx.controls;
	requires javafx.base;
	requires java.naming;
	opens hust.soict.dsai.aims.screen to javafx.graphics,javafx.fxml;
	opens hust.soict.dsai.aims.media to javafx.graphics,javafx.fxml,javafx.base;
}