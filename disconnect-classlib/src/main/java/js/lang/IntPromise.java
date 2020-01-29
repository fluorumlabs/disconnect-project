package js.lang;

import org.teavm.jso.JSBody;

/**
 * Represents the completion of an asynchronous operation
 */
public abstract class IntPromise extends IntPromiseLike {
    /**
     * Attaches callbacks for the resolution and/or rejection of the Promise.
     *
     * @param onfulfilled The callback to execute when the Promise is resolved.
     * @param onrejected  The callback to execute when the Promise is rejected.
     *
     * @returns A Promise for the completion of which ever callback is executed.
     */
    public native <R extends Any> Promise<R> then(FullfilledValueCallback<R> onfulfilled, RejectedValueCallback<R> onrejected);

    public native <R extends Any> Promise<R> then(FullfilledValueCallback<R> onfulfilled);

    public native VoidPromise then(FullfilledValueVoidCallback onfulfilled, RejectedValueVoidCallback onrejected);

    public native VoidPromise then(FullfilledValueVoidCallback onfulfilled);

    public native BooleanPromise then(FullfilledValueBooleanCallback onfulfilled, RejectedValueBooleanCallback onrejected);

    public native BooleanPromise then(FullfilledValueBooleanCallback onfulfilled);

    public native StringPromise then(FullfilledValueStringCallback onfulfilled, RejectedValueStringCallback onrejected);

    public native StringPromise then(FullfilledValueStringCallback onfulfilled);

    public native IntPromise then(FullfilledValueIntCallback onfulfilled, RejectedValueIntCallback onrejected);

    public native IntPromise then(FullfilledValueIntCallback onfulfilled);

    public native DoublePromise then(FullfilledValueDoubleCallback onfulfilled, RejectedValueDoubleCallback onrejected);

    public native DoublePromise then(FullfilledValueDoubleCallback onfulfilled);

    /**
     * Attaches a callback for only the rejection of the Promise.
     *
     * @param onrejected The callback to execute when the Promise is rejected.
     *
     * @returns A Promise for the completion of the callback.
     */
    @JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native <R extends Any> Promise<R> catchError(RejectedValueCallback<R> onrejected);

    @JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native VoidPromise catchError(RejectedValueVoidCallback onrejected);

    @JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native BooleanPromise catchError(RejectedValueBooleanCallback onrejected);

    @JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native StringPromise catchError(RejectedValueStringCallback onrejected);

    @JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native IntPromise catchError(RejectedValueIntCallback onrejected);

    @JSBody(params = "onrejected", script = "return this.catch(onrejected)")
    public native DoublePromise catchError(RejectedValueDoubleCallback onrejected);
}
