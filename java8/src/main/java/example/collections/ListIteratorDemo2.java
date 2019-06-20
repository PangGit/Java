package example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo2 {

    public static void main(String[] args) {
        // 创建List集合对象
        List<String> list = new ArrayList<String>();
        // 添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        // 迭代器遍历
		/*Iterator<String> it = list.iterator();
		while (it.hasNext()){
			String s = (String) it.next();
			if ("world".equals(s)){
				list.add("javae0");
			}
		}*/

        // 方式1：迭代器迭代元素，迭代器修改元素，元素是跟在刚才迭代的元素后面的。
        // Iterator迭代器却没有添加功能，所以我们使用其子接口ListIterator。
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String s = (String) lit.next();
            if ("world".equals(s)) {
                lit.add("javae1");
            }
        }

        // 方式2：集合遍历元素，集合修改元素(普通for)，元素在最后添加的。
        for (int x = 0; x < list.size(); x++) {
            String s = (String) list.get(x);
            if ("world".equals(s)) {
                list.add("javae2");
            }
        }

        System.out.println("list:" + list);
    }

}
