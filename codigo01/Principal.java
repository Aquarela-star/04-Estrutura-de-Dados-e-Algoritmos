package codigo01;
public class Principal {

    public static void main(String[] args){
        No obj = new No("Rafael");

        //No obj1 = new No("Cecília")
        //obj.setNextNo(obj1);
        obj.setNextNo(new No("Cecília"));
        obj.getNextNo().setNextNo(new No("Joaquim"));        

        System.out.println(obj.getDado());
        System.out.println(obj.getNextNo().getDado());
        System.out.println(obj.getNextNo().getNextNo().getDado());
    }   
}