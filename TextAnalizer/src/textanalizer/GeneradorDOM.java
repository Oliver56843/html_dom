
package textanalizer;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import static jdk.nashorn.internal.objects.NativeRegExp.source;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class GeneradorDOM {


        private Document document;

public GeneradorDOM() throws ParserConfigurationException {
DocumentBuilderFactory factoria= DocumentBuilderFactory.newInstance();
DocumentBuilder builder = factoria.newDocumentBuilder();
document = builder.newDocument();
   
}
public void generarDocument(){
   Element productos= document.createElement("productos");
   document.appendChild(productos); 
   
   Element producto= document.createElement("producto");
   productos.appendChild(producto);
   producto.setAttribute("codigo", "1");
   
   Element nombre=document.createElement("nombre");
   nombre.appendChild(document.createTextNode("teclado"));
   producto.appendChild(nombre);
   
   

}
public void generarXml() throws TransformerConfigurationException, TransformerException, IOException{
TransformerFactory factoria = TransformerFactory.newInstance ();
Transformer transformer = factoria.newTransformer();

Source source = new DOMSource(document);
File file = new File ("index.xml");
//File file = new File ("index.html")
FileWriter fw = new FileWriter(file);
PrintWriter pw = new PrintWriter (fw);
Result result = new StreamResult (pw);

transformer.transform(source, result);
}
}
