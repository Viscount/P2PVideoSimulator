package vedio.util;

import peersim.core.CommonState;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jaric Liao on 2015/11/2.
 */
public class RandomUtil {

    public static <T> List<T> randomPickFromArray(List<T> list, int count) {
        ArrayList<T> cloneArrayList = new ArrayList<T>(list);
        if (list.size() <= count) {
            return cloneArrayList;
        }
        ArrayList<T> resultList = new ArrayList<T>();
        while (count > 0) {
            int randomIndex = CommonState.r.nextInt(cloneArrayList.size());
            T obj = cloneArrayList.get(randomIndex);
            resultList.add(obj);
            cloneArrayList.remove(obj);
            count--;
        }
        return resultList;
    }
}
