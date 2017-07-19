// participant: Handler
//      Hanlder defines an interface for handling requests
public abstract class HelpRequester {

    private HelpRequester successor;

    public void setSuccessor(HelpRequester successor) {
        this.successor = successor;
    }

    public HelpRequester getSuccessor() {
        return successor;
    }

    abstract void processRequest(String message);

}
