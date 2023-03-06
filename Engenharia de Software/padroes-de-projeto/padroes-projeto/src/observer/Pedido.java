package observer;

import java.util.UUID;

public class Pedido {
	
	private UUID pedidoId;
	
	private String nomePedido;
	
	private Integer quantidade;
	
	public Pedido(UUID pedidoId, String nomePedido, Integer quantidade) {
		this.pedidoId = pedidoId;
		this.nomePedido = nomePedido;
		this.quantidade = quantidade;
	}

}
