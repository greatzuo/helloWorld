import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
public static final int asd=12;
private int age=12;
//年龄
private int size=12;
//尺寸大小
private String name;
//名字



public static final int DEFAULT_AGE=15;
    public static void main(String[] args) {
      String s="asdjavahjjajavavavajassad";
      //  Pattern p=Pattern.compile("java");
       // Matcher m=p.matcher(s);
        while (s.contains("java")){
            s= s.replaceAll("java","");
            System.out.println(s);
        }

    }
}
