package com.minutetale.shared;

/**
 * Created by jbhattacharya on 16/03/17.
 */

public interface Interactor {
    /**
     * This is the main method that starts an interactor. It will make sure that the interactor operation is done on a
     * background thread.
     */
    void execute();
}
