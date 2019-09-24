package com.huochat.mediacache.sourcestorage;

import com.huochat.mediacache.SourceInfo;

/**
 * Storage for {@link SourceInfo}.
 *
 */
public interface SourceInfoStorage {

    SourceInfo get(String url);

    void put(String url, SourceInfo sourceInfo);

    void release();
}
