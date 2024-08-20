public class Carro {
    private String modelo;
    private int ano;
    private String marca;
    private Carro proximo;
    private double preco;

    // Construtor
    public Carro(String modelo,double preco) {
        this.modelo = modelo;
        this.proximo = null;
        this.preco=preco;
    }

    // Método para obter o modelo do carro
    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Carro getProximo() {
		return proximo;
	}

	public void setProximo(Carro proximo) {
		this.proximo = proximo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// Método para encadear outro carro
    public void encadear(Carro carro) {
        if (this.proximo == null) {
            this.proximo = carro;
        } else {
            this.proximo.encadear(carro);
        }
    }
    
    public double somarPreco(Carro carro,double total) {
        if (this.proximo == null) {           
        	return carro.preco;
        } else {
        	
        	return carro.preco+this.proximo.somarPreco(this.proximo,total);
        }
    	
            
        }
    public int contarCarros(int contar) {
        if (this.proximo != null) {
        	return 1+this.proximo.contarCarros(0);
        }else
        	return 1;
        
    }

    // Método para imprimir os carros encadeados
    public void imprimir() {
        System.out.println(modelo);
        if (proximo != null) {
            proximo.imprimir();
        }
    }
    //imprimir inverso
    public void imprimirInv() {
        
        if (proximo != null) {
        	this.proximo.imprimir();
        	System.out.println(this.modelo);
        }
        
    }
    
	public Carro inverterLista(Carro carro) {
		if (carro == null || carro.proximo == null) {
            return carro;
        }

        // Inverte recursivamente o restante da lista
        Carro reverso = inverterLista(carro.proximo);

        // Inverte o nó atual
        carro.proximo.proximo = carro;
        carro.proximo = null;

        return reverso;
	        
	        
	    }
}