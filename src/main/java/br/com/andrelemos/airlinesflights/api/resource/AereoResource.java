package br.com.andrelemos.airlinesflights.api.resource;

import java.util.List;

import br.com.andrelemos.airlinesflights.api.model.Aereo;
import br.com.andrelemos.airlinesflights.api.service.AereoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aereos")
public class AereoResource {
	
	@Autowired
	private AereoService service;

	@CrossOrigin
    @GetMapping
	public List<Aereo> pesquisar() {
		return service.buscarTodos();
	}

	@CrossOrigin
	@GetMapping("/{codigo}")
	public ResponseEntity<Aereo> buscarPeloCodigo(@PathVariable Long codigo) {
		Aereo aereo = service.buscarPorCodigo(codigo);
		return aereo != null ? ResponseEntity.ok(aereo) : ResponseEntity.notFound().build();
	}
}
