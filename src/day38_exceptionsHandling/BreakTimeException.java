package day38_exceptionsHandling;

public class BreakTimeException  extends RuntimeException{

public BreakTimeException(){
    super("Its break time");
}

public BreakTimeException(String message){
    super(message);
}

}
