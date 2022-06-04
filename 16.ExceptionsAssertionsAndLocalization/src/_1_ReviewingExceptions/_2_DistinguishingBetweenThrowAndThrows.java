package _1_ReviewingExceptions;

import java.sql.SQLException;

public class _2_DistinguishingBetweenThrowAndThrows {
    /*
    The throw keyword means an exception is actually being thrown,
    while the throws keyword indicates that the "method" merely has the potential to
    throw that exception
     */
    public String getDataFromDatabase() throws SQLException {
        throw new UnsupportedOperationException();
    }
    /*
    Line 10 declares that the method might or might not throw a
    SQLException. Since this is a checked exception, the caller needs to
    handle or declare it. Line 11 actually does throw an
    UnsupportedOperationException. Since this is a runtime exception, it
    does not need to be declared on line 10.
     */
}
