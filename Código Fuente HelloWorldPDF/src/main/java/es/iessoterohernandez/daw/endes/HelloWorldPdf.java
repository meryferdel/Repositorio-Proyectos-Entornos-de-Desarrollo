package es.iessoterohernandez.daw.endes;

	import com.itextpdf.text.Document;
	import com.itextpdf.text.DocumentException;
	import com.itextpdf.text.Paragraph;
	import com.itextpdf.text.pdf.PdfWriter;
	
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;

public class HelloWorldPdf {

	public static void main(String[] args) {
		
		// Crear un objeto Documento
		Document doc = new Document();
		
		try {
			// Crear un archivo PDF en el disco
            PdfWriter.getInstance(doc, new FileOutputStream("HolaMundo.pdf"));
            
            // Abrir el documento para agregar contenido
            doc.open();

            // Agregar un párrafo al documento con el texto "Hola Mundo"
            doc.add(new Paragraph("¡Hola Mundo!"));

            // Cerrar el documento
            doc.close();

            System.out.println("Se ha generado el PDF correctamente.");
		
		} catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }

	}

}
