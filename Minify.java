public class Minify{
/**
* Get's a string from a file
*/
public static String getFromFile(String fileName) throws Exception{
    java.io.File file = new java.io.File(fileName);
    java.util.Scanner sc = new java.util.Scanner(file);
    String out = "";
    while(sc.hasNextLine())
    out+=sc.nextLine()+"\n";
    return out;
}
/**
*Writes a string to a file
*/
public static void writeToFile(String output, String fileName) throws Exception{
 java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.File(fileName));
 writer.print(output);
 writer.flush();
 writer.close();
}
/**
* @param args: the command line arguments, argument one is a file to minify
*/
public static void main(String... args) throws Exception{
System.out.println(getFromFile(args[0]));
writeToFile(args[1], args[2]);
}
}