// package Exercise1_SingletonPattern;

public class SingletonPatternExample {

    // Singleton Logger class inside the main class
    static class Logger {
        // Holds the single instance
        private static Logger instance;

        // Private constructor - cannot create from outside
        private Logger() {
            System.out.println("Logger instance created.");
        }

        // Returns the single instance (creates if not exists)
        public static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }
        //Simple Method to print log message
        public void log(String message) {
            System.out.println("Log: " + message);
        }
    }

    // Main method to test Singleton
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First log from logger1");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second log from logger2");

        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("Different instances were created (singleton failed).");
        }
    }
}