package com.minutetale.shared;

import com.minutetale.shared.executor.Executor;
import com.minutetale.shared.executor.MainThread;

/**
 * Created by jbhattacharya on 16/03/17.
 */

public abstract class AbstractInteractor implements Interactor {

    protected Executor threadExecutor;
    protected MainThread mainThread;

    protected volatile boolean isCanceled;
    protected volatile boolean isRunning;

    public AbstractInteractor(Executor threadExecutor, MainThread mainThread) {
        this.threadExecutor = threadExecutor;
        this.mainThread = mainThread;
    }

    /**
     * This method contains the actual business logic of the interactor. It SHOULD NOT BE USED DIRECTLY but, instead, a
     * developer should call the execute() method of an interactor to make sure the operation is done on a background thread.
     * <p/>
     * This method should only be called directly while doing unit/integration tests. That is the only reason it is declared
     * public as to help with easier testing.
     */
    public abstract void run();

    public void cancel() {
        isCanceled = true;
        isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void onFinished() {
        isRunning = false;
        isCanceled = false;
    }

    public void execute() {

        // mark this interactor as running
        this.isRunning = true;

        // start running this interactor in a background thread
        threadExecutor.execute(this);
    }
}
