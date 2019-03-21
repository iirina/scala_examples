// inspired from http://scalaplace.blogspot.com/2012/06/how-to-make-simple-server-and-client.html

import java.net._
import java.io._
import scala.io._

object Server extends App {
    try {
       val server = new ServerSocket(5005)
       println("Server initialized on port 5005")
       val client = server.accept
       var connected = true
       while (connected) {
         val in = new BufferedReader(new InputStreamReader(client.getInputStream)).readLine
         val out = new PrintStream(client.getOutputStream)
         
         println("Server received: " + in)
         out.println("Message received")
         out.flush
         
         if (in.equals("Disconnect")) {
            connected = false
           client.close 
           server.close 
           println("Server shutting down.")
         } 
       }
      
    } catch {
       case e: Exception => println(e.getStackTrace); System.exit(1)
    }
}