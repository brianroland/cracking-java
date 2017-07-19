package main.java.com.br.cracking2017;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 *
 *
 * Surprised that PriorityQueue does an increase-key functionality
 *
 * I interpret the problem to mean that if numElements reaches maxElements,
 * then the least recently used element must be deleted
 *
 *
 * Created by brianroland on 7/19/17.
 */
public class Cracking16o25 {

    Integer maxElements;
    Integer numElements;
    Integer iGet;
    private HashMap<String, String> map;
    private PriorityQueue<LruElement> queue;

    public Cracking16o25(Integer maxElements_) {
        maxElements = maxElements_;
        map = new HashMap<String, String>();
        queue = new PriorityQueue<LruElement>(maxElements, new LruComparator());
        numElements = 0;
        iGet = 0;
    }

    public void put(String key, String value) {

        if (numElements == maxElements-1){
            LruElement el = queue.poll();       //remove least-recently-sued key
            map.remove(el.key);
            numElements -= 1;
        }

        map.put(key,value);
        queue.add(new LruElement(key,-1));
        numElements += 1;
    }

    public String get(String key) {

        if ( map.containsKey(key)) {
            queue.remove(new LruElement(key,-100));         //remove element from queue with this key
            iGet += 1;
            queue.add(new LruElement(key, iGet));        //put element back in queue with new value of iGet
            return map.get(key);
        }

        return null;
    }
}
