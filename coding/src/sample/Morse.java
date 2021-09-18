package sample;
import java.util.*;

public class Morse {
    public  static void main(String[] args){
        HashMap<Character,String> map =new HashMap<Character,String>();
        map.put('a',".-");
        map.put('b',"-...");
        map.put('c',"-.-.");
        map.put('d',"-..");
        map.put('e',".");
        map.put('f',"..-.");
        map.put('g',"--.");
        map.put('h',"....");
        map.put('i',"..");
        map.put('j',".---");
        map.put('k',"-.-");
        map.put('l',".-..");
        map.put('m',"--");
        map.put('n',"-.");
        map.put('o',"---");
        map.put('p',".--.");
        map.put('q',"--.-");
        map.put('r',".-.");
        map.put('s',"...");
        map.put('t',"-");
        map.put('u',"..-");
        map.put('v',"...-");
        map.put('w',".--");
        map.put('x',"-..-");
        map.put('y',"-.--");
        map.put('z',"--..");
        map.put(' ',"***");


        String name="hello world";
        int i;
        for(i = 0; i<name.length(); i++){
            char code= name.charAt(i);
            System.out.print(map.get(code));
            if(i<name.length()-1){
                System.out.print(" ");
            }
            if (code=='\0'){
                System.out.print("   ");
            }

        }


    }

}
