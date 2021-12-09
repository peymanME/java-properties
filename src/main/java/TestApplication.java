import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author peyman.ekhtiar on 2021-12-07
 *
 */
public class TestApplication {
    public static void main(String[] args) throws IOException {
        System.out.println("hello world!!");
        String resourceName = "config.properties";
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties props = new Properties();
        try(InputStream resourceStream = loader.getResourceAsStream(resourceName)) {
            props.load(resourceStream);
            System.out.println(props.getProperty("logger.active"));
        }
    }
}
