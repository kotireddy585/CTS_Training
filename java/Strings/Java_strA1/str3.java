import java.util.StringTokenizer; 
 public class str3 {
    
		public static void main(String args[]) {
    String str=new String("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
		
     System.out.println("Drive:  " +str.substring(0, 3));
		
     String str2= str.substring(3,18);

     System.out.println("Folders:" + str2.replace("\\","||"));
		 
     System.out.println("File: " +str.substring(20));

		    }

}