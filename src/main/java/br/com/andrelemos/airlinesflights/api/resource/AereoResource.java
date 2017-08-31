package br.com.andrelemos.airlinesflights.api.resource;

import java.util.List;

import br.com.andrelemos.airlinesflights.api.model.Aereo;
import br.com.andrelemos.airlinesflights.api.service.AereoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aereos")
public class AereoResource {
	
	@Autowired
	private AereoService service;
	
	
	@GetMapping
	public List<Aereo> pesquisar() {
		return service.listarTodos();
	}

	@GetMapping("/{codigo}")
	public ResponseEntity<Aereo> buscarPeloCodigo(@PathVariable Long codigo) {
		Aereo aereo = service.pesquisarPorCodigo(codigo);
		return aereo != null ? ResponseEntity.ok(aereo) : ResponseEntity.notFound().build();
	}
}
