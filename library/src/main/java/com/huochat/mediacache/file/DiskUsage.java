package com.huochat.mediacache.file;

import java.io.File;
import java.io.IOException;

/**
 * Declares how {@link FileCache} will use disc space.
 *
 */
public interface DiskUsage {

    void touch(File file) throws IOException;

}
