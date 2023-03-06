package observer;

import java.util.UUID;

public class Run {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(UUID.randomUUID(), "Vietnamita", 2);
		
		FazPedido fazerPedido = new FazPedido();
		
		fazerPedido.executarAcao(pedido);

	}

}
