
public class MainCarro {
	public static void main(String[] args) {
		Carro c1=new Carro("A",2);
		Carro c2=new Carro("B",4);
		Carro c3=new Carro("C",5);
		c1.encadear(c3);
		c1.encadear(c2);
		System.out.println("--------------------------");
		c1.imprimir();
		System.out.println("--------------------------");
		System.out.println(c1.contarCarros( 0));
		System.out.println("--------------------------");
		System.out.println(c1.somarPreco(c1, 0));
		System.out.println("--------------------------");
		c1.imprimirInv();
		System.out.println("--------------------------");
		c1=c1.inverterLista(c1);
		System.out.println("--------------------------");
		c1.imprimir();
	}
}
