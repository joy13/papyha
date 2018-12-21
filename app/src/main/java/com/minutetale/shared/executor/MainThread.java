package com.minutetale.shared.executor;

/**
 * This interface will define a class that will enable interactors to run certain operations on the main (UI) thread. For example,
 * if an interactor needs to show an object to the UI this can be used to make sure the show method is called on the UI
 * thread.
 *
 * Created by jbhattacharya on 16/03/17.
 */

public interface MainThread {
    /**
     * Make runnable operation run in the main thread.
     *
     * @param runnable The runnable to run.
     */
    void post(final Runnable runnable);
}
