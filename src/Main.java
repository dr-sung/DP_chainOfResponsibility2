// Example: Chain of Responsibility design pattern
// (c) Dr. Hong K. Sung

// participant: Client

public class Main {
    
    public static void main(String[] args) {
        
        Student dumber = new Student("Dumber", "+");
        Student dumb = new Student("Dumb", "-");
        Student normal = new Student("Normal", "*");
        Student smart = new Student("Smart", "/");
        
        dumber.setSuccessor(dumb);
        dumb.setSuccessor(normal);
        normal.setSuccessor(smart);
        smart.setSuccessor(null);
        
        dumber.processRequest("2+3=?");
        dumber.processRequest("2-3=?");
        dumber.processRequest("2*3=?");
        dumber.processRequest("2/3=?");
    }
    
}
