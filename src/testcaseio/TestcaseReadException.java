package testcaseio;

import java.io.IOException;

/**
 * Wraps the java.io.IOException class, and provides specific information, such as which testcase failed to read.
 */
public class TestcaseReadException extends IOException {
    private final int failedCase;

    public TestcaseReadException(int testNum) {
        super();
        failedCase = testNum;
    }

    public TestcaseReadException(String message, int testNum) {
        super(message);
        failedCase = testNum;
    }

    public TestcaseReadException(Throwable cause, int testNum) {
        super(cause);
        failedCase = testNum;
    }

    public TestcaseReadException(String message, Throwable cause, int testNum) {
        super(message, cause);
        failedCase = testNum;
    }

    public void printFailedCase() {
        System.out.printf("Failed to read testcase: %d\n", failedCase);
    }

}
