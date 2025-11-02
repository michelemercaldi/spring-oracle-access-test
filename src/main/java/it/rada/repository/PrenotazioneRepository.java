package it.rada.repository;

import it.rada.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Integer> {

    // LINQ-like query: Find by materiale
    List<Prenotazione> findByMateriale(String materiale);

    // LINQ-like query: Find prenotazioni with quantity greater than given value
    List<Prenotazione> findByQtaPrenotataGreaterThan(int qta);

    // LINQ-like query: Find prenotazioni by date range
    List<Prenotazione> findByDataPrenotazioneBetween(Date startDate, Date endDate);

    // Custom JPQL query for more complex scenarios
    @Query("SELECT p FROM Prenotazione p WHERE p.stato = :stato AND p.qtaPrenotata > :qta")
    List<Prenotazione> findPrenotazioniByStatoAndQuantity(@Param("stato") int stato, @Param("qta") int qta);
}
