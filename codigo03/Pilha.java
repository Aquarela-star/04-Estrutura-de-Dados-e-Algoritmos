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
    
    public void push(T dado){
        No <T> novoNo = new No<T> (dado);
        if (topo == null){
            topo=novoNo;
        }else{
            novoNo.setNextNo(topo);
            topo = novoNo;

        }
    }
    public void imprimePilha(T dado){
     No <T> aux = topo;
     while (aux != null) {
        System.out.println(aux.toString());
        aux = aux.getNextNo();
     }
    }

     public T pop(){
        if (topo== null){
            System.out.println("Pilha vazia");
            return null;
        }else{
        T dado = topo.getDado();  
        topo = topo.getNextNo();
        return dado;
        }
     }
     public T peek(){
        if(topo == null){
            System.out.println("Pilha vazia");
        }else{
            
            return dado;
        }

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


