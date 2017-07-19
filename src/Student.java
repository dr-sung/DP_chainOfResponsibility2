
// participant: ConcreteHandler
public class Student extends HelpRequester {

    private final String name;
    private final String responsibility;

    public Student(String name, String responsibility) {
        this.name = name;
        this.responsibility = responsibility;
    }

    @Override
    public void processRequest(String message) {
        if (message.contains(responsibility)) {
            System.out.println(name + ": Here is the solution for " + message);
        } else {
            if (getSuccessor() != null) {
                getSuccessor().processRequest(message);
            }
        }
    }
}
