package it.univaq.aycs.business.impl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import it.univaq.aycs.domain.Utente;

public interface UtenteRepository extends JpaRepository<Utente, Long> {

	Utente findByUsername(String username);

	Utente findByEmail(String email);	

	
}
