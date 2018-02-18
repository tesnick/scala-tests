import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}
import scala.xml.NodeSeq

class SimpleServlet extends HttpServlet {

  override def doGet(request: HttpServletRequest, response: HttpServletResponse) {

    response.setContentType("text/html")
    response.setCharacterEncoding("UTF-8")

    val responseBody: NodeSeq = <html><body><h1>Hello, world!</h1></body></html>

    response.getWriter.write(responseBody.toString)
  }
}
