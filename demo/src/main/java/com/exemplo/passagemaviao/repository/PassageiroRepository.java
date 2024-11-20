package com.exemplo.passagemaviao.repository;

import com.exemplo.passagemaviao.model.Passageiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassageiroRepository extends JpaRepository<Passageiro, Long> {
    // Métodos personalizados podem ser adicionados aqui
}