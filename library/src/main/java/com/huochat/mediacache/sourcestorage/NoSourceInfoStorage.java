package com.huochat.mediacache.sourcestorage;

import com.huochat.mediacache.SourceInfo;

/**
 * {@link SourceInfoStorage} that does nothing.
 *
 */
public class NoSourceInfoStorage implements SourceInfoStorage {

    @Override
    public SourceInfo get(String url) {
        return null;
    }

    @Override
    public void put(String url, SourceInfo sourceInfo) {
    }

    @Override
    public void release() {
    }
}
