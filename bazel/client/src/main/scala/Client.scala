// inspired from http://scalaplace.blogspot.com/2012/06/how-to-make-simple-server-and-client.html

import java.net._
import java.io._
import scala.io._
import scala.Proxy
import swing._

object Client extends MainFrame with App {
    title = "Simple Client"
    
    preferredSize = new Dimension(200, 200)
    
    val socket = new Socket(InetAddress.getByName("localhost"), 5005)
    var in = new BufferedSource(socket.getInputStream).getLines
    val out = new PrintStream(socket.getOutputStream)
    println("Client initialized.")
    
    contents = new BorderPanel
    {
       add(new FlowPanel
          {
              contents += new Button(new Action("Send")
              {
                 def apply
                 {
                   out.println("Button 'Send' pressed.")
                   out.flush
                   println("Client received: " + in.next)
                 }
              })
              
              contents += new Button(new Action("Close")
              {
                 def apply
                 {
                   out.println("Disconnect")
                   out.flush
                   socket.close
                 }
              })
          }, BorderPanel.Position.Center)
    }
    
    pack
    visible = true
}
