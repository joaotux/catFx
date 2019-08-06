package br.com.umdesenvolvedor.catFx.utils;

import java.util.HashMap;
import java.util.Map;

public class Mensagens {
	private static Mensagens instancia;
	private static Map<Integer, String> mensagem = new HashMap<>();

	public Mensagens() {
		mensagem.put(001, "Dados de usuário incorretos, verifique!");
	}
	
	public static synchronized Mensagens getInstance() {
		if(instancia == null) {
			instancia = new Mensagens();
		}
		
		return instancia;
	}
	
	public String getMensager(Integer chave) {
		return mensagem.get(chave);
	}
}
