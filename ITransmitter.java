public interface ITransmitter {
    void store(Message message);
    Message retrieve(Person receiver) throws NoMessageForThisPersonException;
}