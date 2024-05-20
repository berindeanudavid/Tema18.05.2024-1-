
public class NoMessageForThisPersonException extends Exception{
    public NoMessageForThisPersonException(){
        super("There is no message for this person in this storage");
    }
}
