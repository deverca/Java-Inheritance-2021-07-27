import animal.Tiger;

public class Main {


public  static void main(String[] args){

    Tiger tiger = new Tiger(12,310, true,true);

    tiger.setMeowing(true);

    if(tiger.getMeowing()){
        System.out.println("Tigers can meow");
    }

}



}
