// AppletDemo.java
// Demonstrates the use of Applets in Java
//
// NOTE: Applets are a very old part of Java (deprecated) and modern browsers
// no longer support running them. This program can be compiled, and viewed
// using the 'appletviewer' tool (if available in your JDK) with an HTML file.
//
// To run using appletviewer, create a file named AppletDemo.html with:
//
// <html>
// <applet code="AppletDemo.class" width="300" height="200"></applet>
// </html>
//
// Then run: appletviewer AppletDemo.html

import java.applet.Applet;
import java.awt.Graphics;

public class AppletDemo extends Applet {

    public void init() {
        // called once when the applet is first loaded
        System.out.println("Applet initialized");
    }

    public void paint(Graphics g) {
        // used to draw content on the applet's surface
        g.drawString("Hello, this is an Applet demo!", 20, 50);
    }
}
