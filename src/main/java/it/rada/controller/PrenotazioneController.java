package it.rada.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import it.rada.model.Prenotazione;
import it.rada.repository.PrenotazioneRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/prenotazioni")
@Tag(name = "Prenotazioni API", description = "Manage Prenotazioni records")
public class PrenotazioneController {

    private final PrenotazioneRepository repository;

    public PrenotazioneController(PrenotazioneRepository repository) {
        this.repository = repository;
    }

    // GET: Filter by materiale
    @GetMapping("/materiale/{materiale}")
    public List<Prenotazione> getByMateriale(@PathVariable String materiale) {
        return repository.findByMateriale(materiale);
    }

    // GET: Filter by quantity greater than
    @GetMapping("/quantity/{qta}")
    public List<Prenotazione> getByQtaGreaterThan(@PathVariable int qta) {
        return repository.findByQtaPrenotataGreaterThan(qta);
    }

    // GET: Filter by date range
    @GetMapping("/dates")
    public List<Prenotazione> getByDateRange(@RequestParam Date start, @RequestParam Date end) {
        return repository.findByDataPrenotazioneBetween(start, end);
    }

    // GET: Custom query (state and quantity)
    @GetMapping("/custom")
    public List<Prenotazione> getCustom(@RequestParam int stato, @RequestParam int qta) {
        return repository.findPrenotazioniByStatoAndQuantity(stato, qta);
    }
}
