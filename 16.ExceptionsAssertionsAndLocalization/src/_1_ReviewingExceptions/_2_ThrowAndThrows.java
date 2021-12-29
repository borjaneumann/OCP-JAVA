package _1_ReviewingExceptions;

import java.sql.SQLException;

public class _2_ThrowAndThrows {
    /*
    The throw keyword means an exception is actually being thrown,
    while the throws keyword indicates that the method merely has the potential to
    throw that exception
     */
    public String getDataFromDatabase() throws SQLException {
        throw new UnsupportedOperationException();
    }
}
