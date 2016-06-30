package quickstart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by fb on 16/3/19.
 */
public class SLF4JDemo {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(SLF4JDemo.class);
        logger.info("Hello World");
    }
}

