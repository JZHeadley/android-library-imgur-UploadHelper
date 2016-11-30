package com.sakebook.android.uploadhelper;

public interface UploadTaskCallback {

    void success(String url);

    void cancel(String message);

    void fail(String message);

}
