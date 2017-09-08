package br.com.andrelemos.airlinesflights.api.service;

import java.util.List;

import br.com.andrelemos.airlinesflights.api.model.Aereo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.andrelemos.airlinesflights.api.repository.AereoRepository;

@Service
public class AereoService {
	
	@Autowired
	private AereoRepository repository;

	public List<Aereo> buscarTodos() {
		return repository.findAll();
	}

	public Aereo buscarPorCodigo(Long codigo) {
		return repository.findOne(codigo);
	}
}
