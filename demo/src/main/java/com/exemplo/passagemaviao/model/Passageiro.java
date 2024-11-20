package com.exemplo.passagemaviao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "passageiro")
public class Passageiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    // Construtores, Getters e Setters

    public void exibirDetalhes() {
        // Implementação
    }

	public Object getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getDocumentoIdentidade() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNome(Object nome2) {
		// TODO Auto-generated method stub
		
	}

	public void setDocumentoIdentidade(Object documentoIdentidade) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(Object email2) {
		// TODO Auto-generated method stub
		
	}
}