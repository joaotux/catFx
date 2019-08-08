package br.com.umdesenvolvedor.catFx.tela;

import java.util.ArrayList;
import java.util.List;

import br.com.umdesenvolvedor.catFx.interfaces.ITelaObservable;
import javafx.fxml.FXMLLoader;

public class TelaTransicaoObservable {
	private static List<ITelaObservable> listner = new ArrayList<>();
	
	public static void addObservableTela(ITelaObservable observable) {
		listner.add(observable);
	}
	
	public static void notificaTela(Object tela, FXMLLoader fxmlLoader) {
		for(ITelaObservable x : listner) {
			x.executa(tela, fxmlLoader);
		}
	}
	
}
