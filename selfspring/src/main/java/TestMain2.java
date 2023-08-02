import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 14:45
 */
public class TestMain2 {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(TestMain2.class);
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
    }
}
