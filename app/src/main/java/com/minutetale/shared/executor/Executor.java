package com.minutetale.shared.executor;

import com.minutetale.shared.AbstractInteractor;

/**
 * This executor is responsible for running interactors on background threads.
 * Created by jbhattacharya on 16/03/17.
 */

public interface Executor {
    /**
     * This method should call the interactor's run method and thus start the interactor. This should be called
     * on a background thread as interactors might do lengthy operations.
     *
     * @param interactor The interactor to run.
     */
    void execute(final AbstractInteractor interactor);
}
