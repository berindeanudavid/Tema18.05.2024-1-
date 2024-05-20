import java.util.HashMap;

public class EmailTransmitter implements ITransmitter{
    public HashMap<String,Message> buffer=new HashMap<String,Message>();
    public void store(Message message){
        message.getReceiver().putMessageInInbox(message);
        buffer.put(message.getReceiver().getName(), message);
    }
    public Message retrieve(Person receiver) throws NoMessageForThisPersonException{
        if(this.buffer.containsKey(receiver.getName()))
            return buffer.get(receiver.getName());
        throw new NoMessageForThisPersonException();
    }
}
