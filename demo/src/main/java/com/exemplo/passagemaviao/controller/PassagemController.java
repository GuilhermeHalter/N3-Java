package com.exemplo.passagemaviao.controller;

import com.exemplo.passagemaviao.model.Passagem;
import com.exemplo.passagemaviao.repository.PassagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passagens")
public class PassagemController {
    @Autowired
    private PassagemRepository passagemRepository;

    @GetMapping
    public List<Passagem> listarPassagens() {
        return passagemRepository.findAll();
    }

    @PostMapping
    public Passagem criarPassagem(@RequestBody Passagem passagem) {
        return passagemRepository.save(passagem);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Passagem> obterPassagem(@PathVariable Long id) {
        return passagemRepository.findById(id)
                .map(passagem -> ResponseEntity.ok().body(passagem))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Passagem> atualizarPassagem(@PathVariable Long id, @RequestBody Passagem passagemAtualizada) {
        return passagemRepository.findById(id)
                .map(passagem -> {
                    passagem.setNumeroVoo(passagemAtualizada.getNumeroVoo());
                    passagem.setOrigem(passagemAtualizada.getOrigem());
                    passagem.setDestino(passagemAtualizada.getDestino());
                    passagem.setDataHoraPartida(passagemAtualizada.getDataHoraPartida());
                    passagem.setDuracao(passagemAtualizada.getDuracao());
                    passagem.setPreco(passagemAtualizada.getPreco());
                    passagem.setAssentosDisponiveis(passagemAtualizada.getAssentosDisponiveis());
                    Passagem passagemSalva = passagemRepository.save(passagem);
                    return ResponseEntity.ok().body(passagemSalva);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletarPassagem(@PathVariable Long id) {
        return passagemRepository.findById(id)
                .map(passagem -> {
                    passagemRepository.delete(passagem);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}