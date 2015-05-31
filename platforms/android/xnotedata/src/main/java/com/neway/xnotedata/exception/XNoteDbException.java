package com.neway.xnotedata.exception;

/**
 * Created by Neway on 2015/5/31.
 */
public class XNoteDbException extends Exception {

    public XNoteDbException() {
        super();
    }

    public XNoteDbException(String detailMessage) {
       super(detailMessage);
    }

    public XNoteDbException(String detailMessage, Throwable throwable) {
       super(detailMessage,throwable);
    }
}
