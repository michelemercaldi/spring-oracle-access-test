package it.rada.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RST_PRENOTAZIONI")
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String materiale;
    private String fornitore;
    private int qtaPrenotata;
    private Date dataPrenotazione;
    private Date dataIngresso;
    private Date dataConsegna;
    private int stato;
    @Column(name = "IDSLOT")
    private String idSlot;
    private String targa;
    private Date dataCaricamentoSap;
    @Column(name = "DATAREC")
    private Date dataRec;
    private Date dataStato;
    private Date oraStartSlot;
    private Date oraEndSlot;
    @Column(name = "IDDOCK")
    private Integer idDock;
    private String fornitoreDescrizione;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMateriale() { return materiale; }
    public void setMateriale(String materiale) { this.materiale = materiale; }

    public String getFornitore() { return fornitore; }
    public void setFornitore(String fornitore) { this.fornitore = fornitore; }

    public int getQtaPrenotata() { return qtaPrenotata; }
    public void setQtaPrenotata(int qtaPrenotata) { this.qtaPrenotata = qtaPrenotata; }

    public Date getDataPrenotazione() { return dataPrenotazione; }
    public void setDataPrenotazione(Date dataPrenotazione) { this.dataPrenotazione = dataPrenotazione; }

    public Date getDataIngresso() { return dataIngresso; }
    public void setDataIngresso(Date dataIngresso) { this.dataIngresso = dataIngresso; }

    public Date getDataConsegna() { return dataConsegna; }
    public void setDataConsegna(Date dataConsegna) { this.dataConsegna = dataConsegna; }

    public int getStato() { return stato; }
    public void setStato(int stato) { this.stato = stato; }

    public String getIdSlot() { return idSlot; }
    public void setIdSlot(String idSlot) { this.idSlot = idSlot; }

    public String getTarga() { return targa; }
    public void setTarga(String targa) { this.targa = targa; }

    public Date getDataCaricamentoSap() { return dataCaricamentoSap; }
    public void setDataCaricamentoSap(Date dataCaricamentoSap) { this.dataCaricamentoSap = dataCaricamentoSap; }

    public Date getDataRec() { return dataRec; }
    public void setDataRec(Date dataRec) { this.dataRec = dataRec; }

    public Date getDataStato() { return dataStato; }
    public void setDataStato(Date dataStato) { this.dataStato = dataStato; }

    public Date getOraStartSlot() { return oraStartSlot; }
    public void setOraStartSlot(Date oraStartSlot) { this.oraStartSlot = oraStartSlot; }

    public Date getOraEndSlot() { return oraEndSlot; }
    public void setOraEndSlot(Date oraEndSlot) { this.oraEndSlot = oraEndSlot; }

    public Integer getIdDock() { return idDock; }
    public void setIdDock(Integer idDock) { this.idDock = idDock; }

    public String getFornitoreDescrizione() { return fornitoreDescrizione; }
    public void setFornitoreDescrizione(String fornitoreDescrizione) { this.fornitoreDescrizione = fornitoreDescrizione; }
}
