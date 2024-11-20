package com.exemplo.passagemaviao.controller;

import com.exemplo.passagemaviao.model.Pagamento;
import com.exemplo.passagemaviao.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {
    @Autowired
    private PagamentoRepository pagamentoRepository;

    @GetMapping
    public List<Pagamento> listarPagamentos() {
        return pagamentoRepository.findAll();
    }

    @PostMapping
    public Pagamento criarPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pagamento> obterPagamento(@PathVariable Long id) {
        return pagamentoRepository.findById(id)
                .map(pagamento -> ResponseEntity.ok().body(pagamento))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pagamento> atualizarPagamento(@PathVariable Long id, @RequestBody Pagamento pagamentoAtualizado) {
        return pagamentoRepository.findById(id)
                .map (pagamento -> {
                    pagamento.setValor(pagamentoAtualizado.getValor());
                    pagamento.setDataPagamento(pagamentoAtualizado.getDataPagamento());
                    pagamento.setDataPagamento(pagamentoAtualizado.getDataPagamento());
                    Pagamento pagamentoSalvo = pagamentoRepository.save(pagamento);
                    return ResponseEntity.ok().body(pagamentoSalvo);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletarPagamento(@PathVariable Long id) {
        return pagamentoRepository.findById(id)
                .map(pagamento -> {
                    pagamentoRepository.delete(pagamento);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}