package com.exemplo.passagemaviao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ou GenerationType.AUTO
    private Long id; // Campo de identificador

    private String origem;
    private String destino;
    private String data;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

	public Object getNumeroVoo() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getDataHoraPartida() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getDuracao() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPreco() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAssentosDisponiveis() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNumeroVoo(Object numeroVoo) {
		// TODO Auto-generated method stub
		
	}

	public void setDataHoraPartida(Object dataHoraPartida) {
		// TODO Auto-generated method stub
		
	}

	public void setDuracao(Object duracao) {
		// TODO Auto-generated method stub
		
	}

	public void setPreco(Object preco) {
		// TODO Auto-generated method stub
		
	}

	public void setAssentosDisponiveis(Object assentosDisponiveis) {
		// TODO Auto-generated method stub
		
	}
}