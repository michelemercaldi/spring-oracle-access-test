package it.rada.repository;

import it.rada.model.PrenotazioneNoJpa;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PrenotazioneNoJpaRepository {

    private final JdbcTemplate jdbcTemplate;

    public PrenotazioneNoJpaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // RowMapper to map database rows to Prenotazione objects
    private RowMapper<PrenotazioneNoJpa> rowMapper = (rs, rowNum) -> {
        PrenotazioneNoJpa prenotazione = new PrenotazioneNoJpa();
        prenotazione.setId(rs.getInt("ID"));
        prenotazione.setMateriale(rs.getString("MATERIALE"));
        prenotazione.setFornitore(rs.getString("FORNITORE"));
        prenotazione.setQtaPrenotata(rs.getInt("QTA_PRENOTATA"));
        prenotazione.setDataPrenotazione(rs.getDate("DATA_PRENOTAZIONE"));
        prenotazione.setDataIngresso(rs.getDate("DATA_INGRESSO"));
        prenotazione.setDataConsegna(rs.getDate("DATA_CONSEGNA"));
        prenotazione.setStato(rs.getInt("STATO"));
        prenotazione.setIdSlot(rs.getString("IDSLOT"));
        prenotazione.setTarga(rs.getString("TARGA"));
        prenotazione.setDataCaricamentoSap(rs.getDate("DATA_CARICAMENTO_SAP"));
        prenotazione.setDataRec(rs.getDate("DATAREC"));
        prenotazione.setDataStato(rs.getDate("DATA_STATO"));
        prenotazione.setOraStartSlot(rs.getDate("ORA_START_SLOT"));
        prenotazione.setOraEndSlot(rs.getDate("ORA_END_SLOT"));
        prenotazione.setIdDock(rs.getInt("IDDOCK"));
        prenotazione.setFornitoreDescrizione(rs.getString("FORNITORE_DESCRIZIONE"));
        return prenotazione;
    };

    // Get all records
    public List<PrenotazioneNoJpa> getAllPrenotazioni() {
        String sql = "SELECT * FROM RST_PRENOTAZIONI";
        return jdbcTemplate.query(sql, rowMapper);
    }

    // Insert record
    public int savePrenotazione(PrenotazioneNoJpa prenotazione) {
        String sql = "INSERT INTO RST_PRENOTAZIONI (ID, MATERIALE, FORNITORE, QTA_PRENOTATA, DATA_PRENOTAZIONE) VALUES (?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql,
                prenotazione.getId(),
                prenotazione.getMateriale(),
                prenotazione.getFornitore(),
                prenotazione.getQtaPrenotata(),
                prenotazione.getDataPrenotazione());
    }
}

