import java.util.HashMap;

public class MailTransmitter implements ITransmitter{
    private int bufferSize;
    private HashMap<String,Message> buffer=new HashMap<String,Message>();
    public MailTransmitter(int n){
        this.bufferSize=n;
    }
    public int getBufferSize(){
        return this.bufferSize;
    }
    public HashMap<String,Message> getBuffer(){
        return this.buffer;
    }
    public void store(Message message) {
        this.buffer.put(message.getReceiver().getName(), message);
        message.getReceiver().putNotification("Un mesaj pentru dumneavoastra va fi livrat in curand!");
        if(buffer.size()==bufferSize){
            for(String key:buffer.keySet()){
                buffer.get(key).getReceiver().putMessageInInbox(buffer.get(key));
            }
        }
        buffer.clear();
    }
    public Message retrieve(Person receiver) throws NoMessageForThisPersonException{
        if(this.buffer.containsKey(receiver.getName()))
            return buffer.get(receiver.getName());
        throw new NoMessageForThisPersonException();
    }
}
