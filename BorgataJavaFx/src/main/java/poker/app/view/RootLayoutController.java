package poker.app.view;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import domain.GameRuleDomainModel;
import enums.eGame;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.stage.FileChooser;
import poker.app.MainApp;
import pokerBase.Rule;

import logic.GameRuleBLL;

/**
 * The controller for the root layout. The root layout provides the basic
 * application layout containing a menu bar and space where other JavaFX
 * elements can be placed.
 * 
 * @author Marco Jakob
 */
public class RootLayoutController implements Initializable {

	// Reference to the main application
	private MainApp mainApp;

	@FXML
	private MenuBar mb;

	@FXML
	private Menu m;
	
	@FXML
	private Menu about;
	
	@FXML
	private Menu close;

	@FXML
	private ToggleGroup tglGames;
	
	@FXML
	private eGame gme;
	
	private String strRuleName;

	public String getRuleName()
	{	
		return strRuleName;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		ToggleGroup tg = new ToggleGroup();
		
		for (GameRuleDomainModel gr : GameRuleBLL.getRules()) {
			
			RadioMenuItem mi = new RadioMenuItem();
			String strRuleName = gr.getRULENAME();
			mi.setToggleGroup(tg);
			mi.setText(strRuleName);
			
			if (gr.getDEFAULTGAME() == 1)
			{
				mi.setSelected(true);
			}
			m.getItems().add(mi);
		}

	}

	/**
	 * Is called by the main application to give a reference back to itself.
	 * 
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		for (MenuItem r: m.getItems()) {
				final String tglstring = r.getText();
				r.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle (ActionEvent e) {
					System.out.println("Toggled: " +tglstring);
					setRule(tglstring);
					strRuleName = tglstring;
					System.out.println(getRuleName());
					}
				});

		this.mainApp = mainApp;
	}
	}

	public void setRule(String s) {
		for (eGame x : eGame.values()) {
			if (x.toString().equals(s)) {
				gme = x;
				PokerTableController.setRle(new Rule(gme));
			}
		}
	}
	
	/**
	 * Opens an about dialog.
	 */
	@FXML
	private void handleAbout() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Poker Game");
		alert.setHeaderText("About");
		alert.setContentText("Author: Bert Gibbons");

		alert.showAndWait();
	}

	/**
	 * Closes the application.
	 */
	@FXML
	private void handleExit() {
		System.exit(0);
	}


	public ToggleGroup getTglGames() {
		return tglGames;
	}
	
	

	public void setTglGames(ToggleGroup tglGames) {
		this.tglGames = tglGames;
	}

	

}