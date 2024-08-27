public class Degrau {
    public String nome;
    public int numero;
    public Degrau proximo;
    public Degrau(String nome,int numero){
        this.nome=nome;
        this.numero=numero;
        
    }
    public Degrau add(Degrau d, Degrau novo){
        if(d==null){
            d=novo;
            //System.out.println(">>>"+novo.nome);
            return d;
        }
            
        else
           return add(d.proximo,novo);

    }
    public void imprimir(Degrau d){
        if(d!=null){
            System.out.println("Degrau:"+d.nome);
            this.imprimir(d.proximo);
        }else{
            System.out.println("FIM");
        }

    }

}
