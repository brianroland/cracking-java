package main.java.com.br.cracking2017;

/**
 * Created by brianroland on 7/19/17.
 */
public class LruElement {

    public String key;
    public Integer priority;

    public LruElement(String key_, Integer priority_) {
        key = key_;
        priority = priority_;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof LruElement){
            LruElement c = (LruElement)o;
            return key == c.key;
        }
        return false;
    }


}
