package com.exemplo.passagemaviao.repository;

import com.exemplo.passagemaviao.model.Passagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassagemRepository extends JpaRepository<Passagem, Long> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}