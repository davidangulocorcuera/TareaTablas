package application;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class Controller  {
	@FXML
	private Button btnDerecha;
	@FXML
	private Button btnIzquierda;
	
	@FXML
	private ObservableList<Character> items =FXCollections.observableArrayList (
	    'A', 'B', 'C', 'D');
	
}
