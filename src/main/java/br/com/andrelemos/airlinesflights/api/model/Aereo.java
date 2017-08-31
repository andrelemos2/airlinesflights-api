package br.com.andrelemos.airlinesflights.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "aereo")
public class Aereo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "codigo_segmento")
	private Segmento segmento;
	
	@NotNull
	@Column(name = "cia_aerea")
	private String companhiaAerea;
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Segmento getSegmento() {
		return segmento;
	}

	public void setSegmento(Segmento segmento) {
		this.segmento = segmento;
	}
	
	public String getCompanhiaAerea() {
		return companhiaAerea;
	}

	public void setCompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aereo other = (Aereo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
}
