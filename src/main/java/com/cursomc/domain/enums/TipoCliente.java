package com.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1,"Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	/*Construtor de um enum é private*/
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	/*Buscar o enum pelo id*/
	public static TipoCliente toEnum(Integer id) {
		if(id == null) {
			return null;
		}
		for(TipoCliente x : TipoCliente.values()) {
			if(id.equals(x.getCod())) {
				return x;
		}
	}
		throw new IllegalArgumentException("Id inválido " + id);
		
	}
}
