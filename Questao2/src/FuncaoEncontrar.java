
public class FuncaoEncontrar {
	
	Node maiorValor;
	
	
	public void preOrdem(Node no) {
		if(no != null) {
			if (no.valor > maiorValor.valor) {
				maiorValor = no;
			}
			preOrdem(no.esq);
			preOrdem(no.dir);
		}
	}		
}