import java.util.HashSet;

public class Person {
    private ITransmitter transmitter;
    private String name;
    private HashSet<Message> inbox=new HashSet<Message>();
    private HashSet<String> notifications=new HashSet<String>();
    public Person(String n){
        this.name=n;
    }
    public HashSet<Message> getInbox(){
        return this.inbox;
    }
    public HashSet<String> getNotifications(){
        return this.notifications;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name=n;
    }
    public ITransmitter getTransmitter(){
        return this.transmitter;
    }
    public void setTransmitter(ITransmitter transmitter){
        this.transmitter=transmitter;
    }
    public void send(Person p,String m){
        Message message=new Message(this,p,m);
        p.getTransmitter().store(message);
    }
    public void putMessageInInbox(Message m){
        this.inbox.add(m);
    }
    public void putNotification(String s){
        this.notifications.add(s);
    }
}
