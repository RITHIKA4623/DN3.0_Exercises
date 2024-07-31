public class SingletonPatternExample {

    public static void main(String[] args) {
        // Get the instance of the Logger class
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log some messages
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Verify that logger1 and logger2 are the same instance
        if (logger1 == logger2) {
            System.out.println("Logger is a singleton. Both instances are the same.");
        } else {
            System.out.println("Logger is not a singleton. Instances are different.");
        }
    }
}
