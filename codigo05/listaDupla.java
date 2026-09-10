package codigo05;

public class listaDupla {
    private String nomeLista;
    private int tamanho;
    private NoDuplo<T>primeiroNo;
    private Noduplo<T>;



    public void addinicio (T dado){
        NoDuplo<T> novoNo= new NoDuplo<T>(dado);
        if (primeiro == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;


        }else{
            novoNo.setproximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo= novoNo;
        }
        atualizaIndice();

        tamanho++;

    }
    public void addFinal (T dado){
    NoDuplo<T> novoNo= new NoDuplo<T>(dado);
        if (primeiro == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;

       }else{
        novoNo.setproximoNo(ultimoNo);
            ultimoNo.setAnteriorNo(novoNo);
            ultimoNo= novoNo;

            atualizaIndice();

            tamanho++;
       }
}

  
