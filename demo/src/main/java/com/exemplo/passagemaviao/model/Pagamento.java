package com.exemplo.passagemaviao.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "reserva_id")
    private Reserva reserva;

    private String metodoPagamento;
    private Date dataPagamento;
    private double valorPago;

    // Construtores, Getters e Setters

    public void realizarPagamento() {
        // Implementação
    }

	public Object getValor() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setValor(Object valor) {
		// TODO Auto-generated method stub
		
	}

	public Object getDataPagamento() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDataPagamento(Object dataPagamento2) {
		// TODO Auto-generated method stub
		
	}





}