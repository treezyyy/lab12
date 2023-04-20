import java.util.regex.*;


public class Main {
    public static void main(String[] args) {
        String s = "240.7.97.185kkkkkk";
        String f = "Это тоже IP адрес 206.157.141.44 kkkkkk";
        System.out.println(True_IP(s));
        System.out.println(True_IP(f));
    }

    static String True_IP(String IP){
        Pattern p = Pattern.compile("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)");
        Matcher m = p.matcher(IP);
        if (m.find()){
            return IP.substring(m.start(), m.end());
        }
        return "Have not IP in this string";
    }
}