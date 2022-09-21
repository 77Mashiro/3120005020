import org.junit.Test;

public class TestReadTxt {

    @Test
    public void TestReadTxt() {
        String str = ReadTxt.readTxt("C:/Users/Mashiro/Desktop/PaperCheck/src/main/resources/orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}