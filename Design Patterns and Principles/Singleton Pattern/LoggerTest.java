public class LoggerTest {

    public static void main(String[] args) {
        // Get the instance of the Logger class
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log some messages
        logger1.log("Test log message 1.");
        logger2.log("Test log message 2.");

        // Verify that logger1 and logger2 are the same instance
        if (logger1 == logger2) {
            System.out.println("Test passed: Logger is a singleton. Both instances are the same.");
        } else {
            System.out.println("Test failed: Logger is not a singleton. Instances are different.");
        }
    }
}
