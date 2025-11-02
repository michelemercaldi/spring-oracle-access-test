package it.rada.controller;

import it.rada.model.PrenotazioneNoJpa;
import it.rada.repository.PrenotazioneNoJpaRepository;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;

@RestController
@RequestMapping("/api/prenotazioninojpa")
@Tag(name = "Prenotazioni API no JPA", description = "Manage Prenotazioni records without using spring-jpa")
public class PrenotazioneNoJpaController {

    private final PrenotazioneNoJpaRepository repository;

    public PrenotazioneNoJpaController(PrenotazioneNoJpaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<PrenotazioneNoJpa> getAllPrenotazioni() {
        return repository.getAllPrenotazioni();
    }

    @PostMapping
    public String addPrenotazione(@RequestBody PrenotazioneNoJpa prenotazione) {
        int result = repository.savePrenotazione(prenotazione);
        return result == 1 ? "Prenotazione added successfully!" : "Failed to add prenotazione.";
    }
}

