package application.recipient;

import java.awt.Button;

import application.system.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class PreferenceController extends Controller{
	
	@FXML
    private Label EmailOrPhone;
	
	@FXML
    private Label PreferenceTimes;
	
	@FXML
    private Text Email;
	
	@FXML
    private Text Phone;
	
	@FXML
    private Button Confirm;

}
