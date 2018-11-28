package com.wxappparser.model;

import java.util.ArrayList;

public class WXAPPPackage {

    private int mEdition;
    private int mIndexLength;
    private int mBodyLength;
    private int mFileCount;

    private ArrayList<WXAPPFile> mFiles;

    public WXAPPPackage() {
        mFiles = new ArrayList<WXAPPFile>();
    }


    public int getEdition() {
        return mEdition;
    }

    public void setEdition(int edition) {
        mEdition = edition;
    }

    public int getIndexLength() {
        return mIndexLength;
    }

    public void setIndexLength(int indexLength) {
        mIndexLength = indexLength;
    }

    public int getBodyLength() {
        return mBodyLength;
    }

    public void setBodyLength(int bodyLength) {
        mBodyLength = bodyLength;
    }

    public int getFileCount() {
        return mFileCount;
    }

    public void setFileCount(int fileCount) {
        mFileCount = fileCount;
    }

    public ArrayList<WXAPPFile> getFiles() {
        return mFiles;
    }

    public void setFiles(ArrayList<WXAPPFile> files) {
        mFiles = files;
    }
}
