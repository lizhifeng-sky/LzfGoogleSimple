package lzf.common.encrypt;

/**
 * Created by Administrator on 2017/8/15 0015.
 */
public class Test {
    public static void main(String[] args){
        String key = "@xgj2017";
        String text = "rQFr+gedwTC9HDJVykvd0ELBtHHmaZxHGgUKQOlUO8g6REDWY/6rBnq2+vpjF29wEgHlQAi46DUW7nN/RyDC9bTb+olR9CO/";
        try {
//            String result1 = DES.encryptDES(text,key);
            String result2 = DES.decryptDES(text);
//            System.out.println("DES encode text is "+result1);
            System.out.println("DES encode text is "+result2);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
