package app.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;

import app.models.Lance;

@Component
public class LanceRepositoryImpl extends Repository<Lance, Long> implements LanceRepository{

	public LanceRepositoryImpl(EntityManager em) {
		super(em);
	}

	public void salvar(Lance lance) {
		entityManager.persist(lance);
	}


	public Lance porId(Long id) {
		return entityManager.find(Lance.class, id);
	}

}
