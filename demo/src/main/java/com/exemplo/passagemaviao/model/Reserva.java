package com.exemplo.passagemaviao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "passageiro_id")
    private Passageiro passageiro;

    @ManyToOne
    @JoinColumn(name = "passagem_id ")
    private Passagem voo;

    private String numeroAssento;
    private double valorTotal;

    // Construtores, Getters e Setters

    public void confirmarReserva() {
        // Implementação
    }

    public void exibirReserva() {
        // Implementação
    }

	public Object getPassageiro() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPassageiro(Object passageiro2) {
		// TODO Auto-generated method stub
		
	}

	public Object getDataReserva() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPassagem() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPassagem(Object passagem) {
		// TODO Auto-generated method stub
		
	}

	public void setDataReserva(Object dataReserva) {
		// TODO Auto-generated method stub
		
	}
}