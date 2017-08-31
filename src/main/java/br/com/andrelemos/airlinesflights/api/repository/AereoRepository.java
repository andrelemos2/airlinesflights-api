package br.com.andrelemos.airlinesflights.api.repository;

import br.com.andrelemos.airlinesflights.api.model.Aereo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AereoRepository extends JpaRepository<Aereo, Long>{

}
