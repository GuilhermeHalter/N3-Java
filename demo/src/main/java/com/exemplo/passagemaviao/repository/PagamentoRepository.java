package com.exemplo.passagemaviao.repository;

import com.exemplo.passagemaviao.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    // Métodos personalizados podem ser adicionados aqui
}