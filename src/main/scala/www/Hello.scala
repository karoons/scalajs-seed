package www

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document
import org.scalajs.jquery.jQuery
import scala.scalajs.js.annotation.JSExport

/**
  * Created by nuboat on 2016-10-21.
  */
object Hello extends JSApp {

  override def main(): Unit = {
    jQuery(setupUI _)
  }

  private[www] def setupUI(): Unit = {
    jQuery("body")
      .append("""<p>Hello World 2</p>""")
      .append("""<button type="button" id="click-me-button">Click me!</button>""")
    jQuery("#click-me-button").click(addClickedMessage _)
  }

  @JSExport
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }

}
