//10.Java program to implement an applet.

Step1: typr the java code and save it as program10.java and comile it

import java.applet.Applet;

import java.awt.Graphics;

// Creating a simple applet by extending the Applet class

public class program10 extends Applet {

// Overriding the paint method to draw something on the applet window

@Override

public void paint(Graphics g) {

// Using the Graphics object to draw a string on the applet window

g.drawString("Hello, World!", 50, 50);

}

}

Step2: write the html code and save it as program10.html

<html>

<body>

<applet code=program10.class width=400

height=400>

</applet>

</body>
  </html>

Step3: Compile it using appletviewer program10.html.
