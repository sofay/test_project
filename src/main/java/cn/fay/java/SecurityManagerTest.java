package cn.fay.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.AccessController;
import java.security.PrivilegedAction;

/**
 * Created by fay on 2017/10/9.
 */
public class SecurityManagerTest {
    public static void main(String[] args) throws FileNotFoundException {
        SecurityManager securityManager = System.getSecurityManager();
        System.out.println(securityManager);
        File file = new File("/Users/fay/monitor.sh");
        FileReader reader = new FileReader(file);
//        System.out.println(System.getProperty("file.encoding"));
    }
}
