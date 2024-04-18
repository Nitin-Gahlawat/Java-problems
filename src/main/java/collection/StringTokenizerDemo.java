//Question 
    //Tokenizer a string using various delimiters.
//Answer
package collection;

import java.util.StringTokenizer;
import java.util.TreeMap;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String Data="Name:Vijay;Address:India;Dept:Cse;City:New York";
        StringTokenizer st=new StringTokenizer(Data,":;");
        TreeMap<String,String> tm=new TreeMap<>();
        String key="";
        for (int i = 0; st.hasMoreTokens(); i++) {
                if(i%2==0)
                    key=st.nextToken();
                else{
                    tm.put(key,st.nextToken());
                }
        }
        System.out.println(tm);
    }
}
