package javaOOPAdvanced_V2.handlingException;

public class Main {
    public static void main(String[] args) {
        Double score;
        try{
            checkScore (2.15);
            checkScore(50.0);
            checkScore(95.02);
            checkScore(100.01);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }

  public static void checkScore (Double score){
        if ( score > 0 && score <=50 ){
            System.out.println("Average score");
        } else if (score > 50 && score <=100) {
            System.out.println("Very good score!");
        }else{
            throw new ArithmeticException("Score is out of scale!");
        }
  }
}


