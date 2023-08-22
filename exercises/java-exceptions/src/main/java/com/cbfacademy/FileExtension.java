package com.cbfacademy;

public class FileExtension {
    public Integer check(String fileName) throws NullEmpty {
        if ((fileName == null) || (fileName == "")) {
            throw new NullEmpty("Exception: File name cannot be null or empty");
        }

        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
}

//