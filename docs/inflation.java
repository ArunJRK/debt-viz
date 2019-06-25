
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


class calc
{
    public void main()
    { double c=7300000;
   for(int i=0; i<8; i++)
   {
    System.out.println("test");
    c=c*0.96;
   }

   try {
    PrintStream out = new PrintStream(new FileOutputStream(
        "OutFile.txt"));
   
      out.println("Real Value: " + c);

    out.close();

  } catch (FileNotFoundException e) {
    e.printStackTrace();
  
  System.out.println("value="+e);
} 
}
}