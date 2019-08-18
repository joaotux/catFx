package br.com.umdesenvolvedor.catFx.utils;

import java.util.HashMap;
import java.util.Map;

public class Mensagens {
	private static Mensagens instancia;
	private static Map<Integer, String> mensagem = new HashMap<>();

	public Mensagens() {
		mensagem.put(001, "Dados incorretos, verifique!");
		mensagem.put(002, "Erro inesperado, chame o suporte!");
		mensagem.put(003, "Descrição é obrigatória!");
		mensagem.put(004, "Valor é obrigatório!");
		mensagem.put(005, "Nenhum registro selecionado!");
		
		mensagem.put(200, "Dados salvos com sucesso!");
		mensagem.put(201, "Operação realizada com sucesso!");
		
		mensagem.put(300, "Deseja mesmo remover este registro?");
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
