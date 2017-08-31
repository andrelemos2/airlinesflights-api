package br.com.andrelemos.airlinesflights.api.service;

import java.util.List;

import br.com.andrelemos.airlinesflights.api.model.Aereo;
import br.com.andrelemos.airlinesflights.api.model.Segmento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.andrelemos.airlinesflights.api.repository.AereoRepository;

@Service
public class AereoService {
	
	@Autowired
	private AereoRepository repository;

	public List<Aereo> listarTodos() {
		return repository.findAll();
	}

	public Aereo pesquisarPorCodigo(Long codigo) {
		return repository.findOne(codigo);
	}
	
	public Segmento pesquisaPorSegmento(Long aereoId, Long segmentoId) {
		
		Aereo aereo = repository.findOne(aereoId);

		if (aereo == null) {
			return null;
		}
		
		Segmento segmento = aereo.getSegmento();

		
			if (segmento.getCodigo().equals(segmentoId)) {
				return segmento;
			}
		

		return null;
	}

}
