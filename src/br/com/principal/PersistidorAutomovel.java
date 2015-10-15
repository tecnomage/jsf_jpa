package br.com.principal;

import br.com.Automovel.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.Automovel.Automovel;

public class PersistidorAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jsf_jpa");
		EntityManager em = emf.createEntityManager();
		
		Automovel auto = new Automovel();
		auto.setAnoFabricacao(2015);
		auto.setMarca("Ford");
		auto.setAnoModelo(2015);
		auto.setModelo("fiesta");
		auto.setObservacoes("meu proximo carro");
		
		
		EntityTransaction tx= em.getTransaction();
		tx.begin();
		em.persist(auto);
		tx.commit();
		
		em.close();
		emf.close();
		
	}

}
