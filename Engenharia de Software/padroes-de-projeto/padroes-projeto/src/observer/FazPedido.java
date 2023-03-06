package observer;

public class FazPedido implements PosPedido{

	@Override
	public void executarAcao(Pedido pedido) {
		
		System.out.println("Pedido foi enviado");
		
		
		
	}

}
