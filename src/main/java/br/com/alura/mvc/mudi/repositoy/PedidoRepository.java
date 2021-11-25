package br.com.alura.mvc.mudi.repositoy;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;

@Repository 
public class PedidoRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Pedido> recuperaTodosOsPedidos(){
		TypedQuery<Pedido> query = entityManager.createQuery("select p from Pedido p", Pedido.class);
		return query.getResultList();
	}
}