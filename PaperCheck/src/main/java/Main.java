public class Main {
    public static void main(String[] args) {

        ReadTxt r=new ReadTxt();

        String str0 = r.readTxt("C:/Users/Mashiro/Desktop/PaperCheck/src/main/resources/orig.txt");
        String str1 = r.readTxt("C:/Users/Mashiro/Desktop/PaperCheck/src/main/resources/orig_0.8_add.txt");
        String str2 = r.readTxt("C:/Users/Mashiro/Desktop/PaperCheck/src/main/resources/orig_0.8_del.txt");
        String str3 = r.readTxt("C:/Users/Mashiro/Desktop/PaperCheck/src/main/resources/orig_0.8_dis_1.txt");
        String str4 = r.readTxt("C:/Users/Mashiro/Desktop/PaperCheck/src/main/resources/orig_0.8_dis_10.txt");
        String str5 = r.readTxt("C:/Users/Mashiro/Desktop/PaperCheck/src/main/resources/orig_0.8_dis_15.txt");

        Simhash s = new Simhash();
        String result1 = s.compare(str0, str1);
        String result2 = s.compare(str0, str2);
        String result3 = s.compare(str0, str3);
        String result4 = s.compare(str0, str4);
        String result5 = s.compare(str0, str5);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
