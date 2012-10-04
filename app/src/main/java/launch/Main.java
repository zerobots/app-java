package launch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.ProtectionDomain;

import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.apache.tomcat.util.http.fileupload.IOUtils;


public class Main {
    public static void main(final String[] args) throws ServletException, LifecycleException, URISyntaxException, IOException {
        final Tomcat tomcat = new Tomcat();

        tomcat.setPort(8080);

        // Figure out the location of the war file
        final ProtectionDomain domain = Main.class.getProtectionDomain();
        final URL location = domain.getCodeSource().getLocation();

        System.out.println("Using webapp at " + location.toExternalForm());

        tomcat.addWebapp("/", location.toURI().getPath());
        tomcat.start();
        tomcat.getServer().await();
    }
}