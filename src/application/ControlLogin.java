package application;


import javax.swing.JOptionPane;

import businesslogic.User;
import facade.Facade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControlLogin {
	
    @FXML
    private Button btnCo;

    @FXML
    private TextField pass;

    @FXML
    private TextField username;
    
    @FXML
    public void clickbuton(ActionEvent event){
    	
    	String uname = username.getText();
		String pwd= pass.getText();
		
    	if(uname.length()!=0 && pwd.length()!=0){
    		
			if (Facade.login(uname,pwd)){
				JOptionPane.showMessageDialog(null, "Connection reussie!");
			}
			else{
				JOptionPane.showMessageDialog(null,"Login ou mot de passe incorrect");
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs s'il vous plait");
		}
    	if(Facade.isConnected()){
    		JOptionPane.showMessageDialog(null, "session effective!");
    	}
    	else{
    		JOptionPane.showMessageDialog(null, "session non effective!");
    	}
	
    }
}
