
package day38_exceptionsHandling.shapeTask;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException(String message){
        super(message);
    }
}
