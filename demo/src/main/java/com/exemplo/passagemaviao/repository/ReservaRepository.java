package com.exemplo.passagemaviao.repository;

import com.exemplo.passagemaviao.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    // Métodos personalizados podem ser adicionados aqui
}