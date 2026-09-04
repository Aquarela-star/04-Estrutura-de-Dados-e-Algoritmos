package codigo04;

public class Fila<T>{
    private String nomeFila;
    private No<T> primeiroNo;
    private No<T> ultimoNo;

    public Fila(){
        this("");
    }

    public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void enfileirar(T dado){
        No<T> novNo= new No<T> (dado);

        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        
        }else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo= novoNo;
        }
    }

    public void imprimefila(T dado){

        if (primeiroNo == null){
            System.out.println("Fila vazia");

        }
        No <T> aux = primeiroNo;
        while(aux != null){
            aux.getDado();
           System.out.println("Dado" + aux.toString());
           aux = aux.getNextNo();

        }

    }
     public T desenfileirar(){
        if (primeiroNo == null){
            System.out.println("Fila vazia");
            return null;
        }
        T dado = primeiroNo.getDado();
           primeiroNo=primeiroNo.getNextNo();

        if(primeiroNo == null){
            ultimoNo = primeiroNo;
        }
        return dado;
      }
    }
     public