package codigo03;

public class Pilha<T> {
    private String nomePilha;
    private No<T> topo;
    
    
    
    public Pilha(){
        this("");
    }

    public Pilha( String nomePilha){
        this.nomePilha = nomePilha;
        this.topo = null;
    }
    


/****************************************************** */
    public String getNomePilha() {
        return nomePilha;
    }
    public No<T> getTopo() {
        return this.topo;
    }

    public void setNomePilha(String nomePilha) {
        this.nomePilha = nomePilha;
    }

    public void setTopo(No<T> topo) {
        this.topo = topo;
    }
}

/***************************************************************** */