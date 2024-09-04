package aula0309;

public class Main {
	public static void imprimirPai(Pessoa pai)
	{
		System.out.println("Pai:"+pai.nome);
		if(pai.Filho!=null)
			imprimirPai(pai.Filho);
	}
	public static Pessoa addFilho(Pessoa pai, Pessoa filho)
	{
		if(pai==null){
			pai = filho;     
			  
		}
		else{
			  pai.Filho=addFilho(pai.Filho,filho);
			   
		}
		return pai;

	}
	public static void main(String[] args) {
		Pessoa p1=new Pessoa("maria");
		Pessoa p2=new Pessoa("eliza");
		Pessoa p3=new Pessoa("pedro");
		Pessoa p4=new Pessoa("joao");


		Pessoa listaEncadeadaFilhos=null;
		/*p4.Filho=p1;
		p1.Filho=p2;
		p2.Filho=p3;

		p4.Filho=p1;
		p4.Filho.Filho=p2;
		p4.Filho.Filho.Filho=p3;
		p4.Filho.Filho.Filho.Filho=new Pessoa("Luiz");
		p4.Filho.Filho.Filho.Filho.Filho=new Pessoa("ORLANDO");*/
	 addFilho(p4,p1);
	 addFilho(p4,p2);
	 addFilho(p4,p1);
	 addFilho(p4,p2);
	  addFilho(p4,p3);
 
	 imprimirPai(p4);
	 imprimirPai(p4);

		/* System.out.println("1"+p4.nome);
		 System.out.println("2"+p4.Filho.nome);
		 System.out.println("3"+p4.Filho.Filho.nome);
		 System.out.println("4"+p4.Filho.Filho.Filho.nome);
		 System.out.println("5"+p4.Filho.Filho.Filho.Filho.nome);*/

	}

}
