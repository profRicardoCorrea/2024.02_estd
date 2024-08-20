
public class PilhaVetor {
	public static int [] pilha=new int[5];
	public static int topo=-1;
	
	public static boolean empty(int topo) {
		if(topo==0)
			return true;
		else
			return false;
	}
	
	public static  void push(int novoElemento)
	{
		pilha[++topo]=novoElemento;	
	}
	public static void main(String[] args) {
		
		
		
		if(empty(topo))
			System.out.println("PILHA VAZIA");
		
		push(34);
		System.out.println(">>"+pilha[0]);
			
	}

}
