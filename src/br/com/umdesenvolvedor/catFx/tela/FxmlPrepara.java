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
	private String estiloCss = "/estilo.css";

	public Scene preparaScene(String fxml, Callback<Class<?>, Object> controllerSpring, int largura, int altura) {

		try {
			parent = preparaFxml(fxml, controllerSpring).load();
		} catch (IOException e) {
			e.printStackTrace();
		}

		scene = new Scene(parent, largura, altura);
		scene.getStylesheets().add(estiloCss);

		return scene;
	}
	
	public Scene preparaScene(String fxml, Callback<Class<?>, Object> controllerSpring) {
		return preparaScene(fxml, controllerSpring, -1, -1);
	}
	
	public FXMLLoader preparaFxml(String fxml, Callback<Class<?>, Object> controllerSpring) {
		fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
		fxmlLoader.setControllerFactory(controllerSpring);
		
		return fxmlLoader;
	}

}
