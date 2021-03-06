package br.eleicao.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Voto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // == Pego ID do Eleitor ==
    @ManyToOne
    @JoinColumn(name = "EleitorId")
    private Eleitor eleitor;

    // == Pego ID do Candidato ==
    @ManyToOne
    @JoinColumn(name = "CandidatoId")
    private Candidato candidato;
    
    // PK Zona
 	@ManyToOne
 	@JoinColumn(name = "ZonaId")
 	private Zona zona;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Eleitor getEleitor() {
        return eleitor;
    }

    public void setEleitor(Eleitor eleitor) {
        this.eleitor = eleitor;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

}