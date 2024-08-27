public class Main
{
    
	public static void main(String[] args) {
	    Fila fila=new Fila(3);
	    fila.enfileirar(011);
		System.out.println("Elemento:"+fila.frente());
		System.out.println("Tamanho:"+fila.tamanho());
		fila.enfileirar(111);
		System.out.println("Tamanho:"+fila.tamanho());
		fila.enfileirar(211);
		System.out.println("Tamanho:"+fila.tamanho());
		fila.enfileirar(311);
		System.out.println("Tamanho:"+fila.tamanho());
		System.out.println("Elemento REMO:"+fila.desenfileirar());
		System.out.println("Elemento:"+fila.frente());
		System.out.println("Tamanho:"+fila.tamanho());
	}
}