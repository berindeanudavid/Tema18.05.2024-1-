public class Message {
    private String content;
    private Person Sender;
    private Person Receiver;
    public Message(Person Sender, Person Receiver, String content){
        this.Sender=Sender;
        this.Receiver=Receiver;
        this.content=content;
    }
    public Person getSender(){
        return this.Sender;
    }
    public Person getReceiver(){
        return this.Receiver;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content=content;
    }
}
