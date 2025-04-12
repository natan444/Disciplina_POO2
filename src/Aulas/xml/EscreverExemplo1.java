package Aulas.xml;

import java.io.FileOutputStream;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class EscreverExemplo1 {
    public static void main(String[] args) throws Exception  {
        
        // criar os objetos para a criacao do arquivo
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();
        
        // raiz é pai de "pai1"
        Element raiz = doc.createElement( "raiz" );
        doc.appendChild(raiz);
        
        // elements
        Element element1 = doc.createElement( "pai_1" );
        element1.setAttribute("atributo1", "valor");
        element1.setAttribute("atributo2", "valor");
//        element1.setTextContent( "conteudo" );
        
        Element element2 = doc.createElement( "filho" );
        element2.setAttribute("atributo1", "valor");
        element2.setAttribute("atributo2", "valor");
        element2.setTextContent( "conteudo" );
        
        element1.appendChild( element2 );        
        raiz.appendChild( element1 );
        
        // salva o arquivo no HD
        FileOutputStream output = new FileOutputStream("./Arquivo4.xml");
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource( doc );
        StreamResult result = new StreamResult( output );
        
        transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "yes" );
        transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
        transformer.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
//        transformer.setOutputProperty(OutputKeys.ENCODING,"ISO-8859-1");
        transformer.transform( source, result );
        
    }
}
