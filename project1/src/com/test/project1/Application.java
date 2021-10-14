package com.test.project1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.test.util.UtilString;

public class Application {

    private static final Logger LOGGER = LogManager.getLogger(Application.class);
    public static final String TEXT = "any text";

    public static void main(String[] args) {
        LOGGER.info("Starting main()");
        logText(TEXT);
        LOGGER.info("Ending main()");
    }

    public static void logText(String text){
        LOGGER.info("Starting logText()");
        String textUppper = UtilString.uppercase(text);
        LOGGER.debug("textUppper = {}",textUppper);
        LOGGER.info("Ending logText()");
    }
    
}
