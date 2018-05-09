import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomIO {
    public static void main(String[] args) {
        try{
            RandomAccessFile file = new RandomAccessFile("E:\\test.txt","rw");

            file.writeChars("X");
            file.writeInt(100);
            file.writeDouble(3.1224);
            file.seek(0);

            System.out.println(file.readChar());
            System.out.println(file.readInt());
            System.out.println(file.readDouble());
            file.seek(2);
            System.out.println(file.readInt());

            file.seek(file.length());
            file.writeBoolean(false);
            file.seek(4);
            System.out.println(file.readBoolean());
            file.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
