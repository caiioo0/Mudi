package br.com.mvc.mudi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.mvc.mudi.Model.Pedido;
import br.com.mvc.mudi.Model.StatusPedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
	public List<Pedido> findAll();

	public List<Pedido> findByStatus(StatusPedido status);

}