package by.kharevich.app.controller.utils;

import java.io.File;

public class PathFinder {

    public PathFinder() {
    }

    public static final String USER_DIR = "user.dir";
    public static final String ROOT = "src/main/resources";
    public static final String FILENAME = "log.txt";
    
    public static String getFilename() {
        return System.getProperty(USER_DIR) +
                File.separator + ROOT +
                File.separator+FILENAME;
    }
}

  