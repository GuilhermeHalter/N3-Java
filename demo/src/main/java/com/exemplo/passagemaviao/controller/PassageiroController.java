package com.exemplo.passagemaviao.controller;

import com.exemplo.passagemaviao.model.Passageiro;
import com.exemplo.passagemaviao.repository.PassageiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passageiros")
public class PassageiroController {
    @Autowired
    private PassageiroRepository passageiroRepository;

    @GetMapping
    public List<Passageiro> listarPassageiros() {
 return passageiroRepository.findAll();
    }

    @PostMapping
    public Passageiro criarPassageiro(@RequestBody Passageiro passageiro) {
        return passageiroRepository.save(passageiro);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Passageiro> obterPassageiro(@PathVariable Long id) {
        return passageiroRepository.findById(id)
                .map(passageiro -> ResponseEntity.ok().body(passageiro))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Passageiro> atualizarPassageiro(@PathVariable Long id, @RequestBody Passageiro passageiroAtualizado) {
        return passageiroRepository.findById(id)
                .map(passageiro -> {
                    passageiro.setNome(passageiroAtualizado.getNome());
                    passageiro.setDocumentoIdentidade(passageiroAtualizado.getDocumentoIdentidade());
                    passageiro.setEmail(passageiroAtualizado.getEmail());
                    Passageiro passageiroSalvo = passageiroRepository.save(passageiro);
                    return ResponseEntity.ok().body(passageiroSalvo);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletarPassageiro(@PathVariable Long id) {
        return passageiroRepository.findById(id)
                .map(passageiro -> {
                    passageiroRepository.delete(passageiro);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}