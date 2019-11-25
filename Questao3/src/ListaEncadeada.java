
public class ListaEncadeada {

	private Carrinho inicio;

	public ListaEncadeada(Carrinho inicio) {
		super();
		this.inicio = null;
	}

	public void inserir(String item, Carrinho proximo) {
		if (this.inicio == null) {
			this.inicio = new Carrinho(item, proximo);
		} else {
			Carrinho temp = new Carrinho(item, proximo);
			temp.proximo = proximo;
			inicio = temp.proximo;
		}

	}

	public Carrinho dequeue() {
		Carrinho front = null;
		if (inicio != null) {
			front = inicio;
			inicio = inicio.proximo;
		}
		return front;
	}

	public Carrinho getInicio() {
		return inicio;
	}

}