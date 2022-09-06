package javaFiles;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class  FileIoOper {
public static void main(String[] args) throws IOException {
	File file=new File("/home/shrikiran/Desktop/Document");
	 if (file.isHidden())
         System.out.println("File Hidden");
     else
         System.out.println("File Not Hidden");
	 Path path1=Paths.get("/home/shrikiran/Desktop/Document");
	 Path path2=Paths.get("/home/shrikiran/Desktop/");
	 if(Files.isSameFile(path1, path2))
	 System.out.println("same file");
	 else
	 System.out.println("not same file");
	 OutputStream out = new ByteArrayOutputStream();
	 
     // Try block to check for exceptions
     try {
         // Printing number of copied bytes
         System.out.println("Number of bytes copied: "
                            + Files.copy(path1, out));
     }

     // Catch block to handle the exception
     catch (IOException e) {

         // Print the line number where exception occurred
         e.printStackTrace();
     }
     Path temp = Files.move(path1,path2);
    	 
    	        if(temp != null)
    	        {
    	            System.out.println("File renamed and moved successfully");
    	        }
    	        else
    	        {
    	            System.out.println("Failed to move the file");
    	        }
}
}
