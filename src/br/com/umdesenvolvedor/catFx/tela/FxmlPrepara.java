package br.com.umdesenvolvedor.catFx.tela;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.util.Callback;

public class FxmlPrepara {
	private FXMLLoader fxmlLoader;
	private Parent parent;
	private Scene scene;
	private String estiloCss = "/css/estilo.css";

	public Scene preparaScene(String fxml, Callback<Class<?>, Object> controllerSpring) {

		try {
			parent = preparaFxml(fxml, controllerSpring).load();
		} catch (IOException e) {
			e.printStackTrace();
		}

		scene = new Scene(parent);
		scene.getStylesheets().add(estiloCss);

		return scene;
	}
	
	public FXMLLoader preparaFxml(String fxml, Callback<Class<?>, Object> controllerSpring) {
		fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
		fxmlLoader.setControllerFactory(controllerSpring);
		
		return fxmlLoader;
	}

}
