public class MainDegrau {
    
    public static void main(String[] args) {
        Degrau d1=new Degrau("A", 0);
        Degrau d2= new Degrau("B", 1);
        Degrau d3= new Degrau("C", 2);
        Degrau d4= new Degrau("D", 3);
        Degrau d5= new Degrau("E", 4);
        Degrau d6= new Degrau("F", 5);
        Degrau escada=null;
        escada=d3.add(escada, d3);
        escada=d3.add(escada, d4);
        d3.imprimir(escada);

        // d3.proximo=d4;
        // d4.proximo=d5;
        // d5.proximo=d6;
        // d6.proximo=d1;
        // d1.proximo=d2;
        // d3.imprimir(d1);
        // System.out.println(d3.nome);
        // System.out.println(d3.proximo.nome);
        // System.out.println(d3.proximo.proximo.nome);
        // System.out.println(d3.proximo.proximo.proximo.nome);
        // System.out.println(d3.proximo.proximo.proximo.proximo.nome);
        // System.out.println(d3.proximo.proximo.proximo.proximo.proximo.nome);        
    }
    
}
