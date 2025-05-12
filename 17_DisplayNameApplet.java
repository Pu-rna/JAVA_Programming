import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="DisplayNameApplet.class" width="300" height="100"></applet>
*/

 class DisplayNameApplet extends Applet {
    public void paint(Graphics g) {
        // Display name at (20, 50)
        g.drawString("Your Name", 20, 50);
    }
}


//<!DOCTYPE html>
//<html>
//    <head>
//        <meta charset="utf-8">
//        <title>Date Applet</title>
//    </head>
//    <body>
//        <applet code="DisplayNameApplet.class" width="300" height="100">
            
//        </applet>
//    </body>
//</html>
