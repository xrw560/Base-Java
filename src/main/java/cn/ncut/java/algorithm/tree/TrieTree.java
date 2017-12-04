package cn.ncut.java.algorithm.tree;

import java.util.HashMap;

/**
 * Created by zhouning on 2017/12/4.
 * desc: Trie树，字典树
 * ref: http://blog.csdn.net/abcd_d_/article/details/40116485
 */
public class TrieTree {

    /**
     * 内部节点类
     */
    private class Node {
        private int dumpliNum; //字串的重复数目，该属性统计重复次数的时候有用，取值为0，1，2，3，4...

        private int prefixNum;//以该字串为前缀的字串数，应该包括该字串本身
        private Node childs[];//此处用数组实现，当然也可以用map或list实现以节省空间
        private boolean leaf;//是否是单词节点

        public Node() {
            dumpliNum = 0;
            prefixNum = 0;
            leaf = false;
            childs = new Node[26];
        }
    }

    private Node root;//树根

    public TrieTree() {
        //初始化trie树
        root = new Node();
    }

    /**
     * 插入字串，用循环迭代实现
     *
     * @param words
     */
    public void insert(String words) {
        insert(this.root, words);
    }

    /**
     * 插入字串，用循环迭代实现
     *
     * @param root
     * @param words
     */
    private void insert(Node root, String words) {
        words = words.toLowerCase();//转化为小写
        char[] chrs = words.toCharArray();

        for (int i = 0, length = chrs.length; i < length; i++) {
            //用相对于字母的值作为下标索引，也隐式地记录了该字母的值
            int index = chrs[i] - 'a';
            if (root.childs[index] != null) {
                //已经存在，该子节点prefixNum++
                root.childs[index].prefixNum++;
            } else {
                //如果不存在
                root.childs[index] = new Node();
                root.childs[index].prefixNum++;
            }

            //如果到了字串结尾，则做标记
            if (i == length - 1) {
                root.childs[index].leaf = true;
                root.childs[index].dumpliNum++;
            }
            //root执行子节点，继续处理
            root = root.childs[index];
        }
    }

    /**
     * 遍历trie树，查找所有的words以及出现次数
     *
     * @return
     */
    public HashMap<String, Integer> getAllWords() {
        return preTraversal(this.root, "");
    }

    /**
     * 前序遍历
     *
     * @param root    子树根节点
     * @param prefixs 查询到该节点前所遍历过的前缀
     * @return
     */
    private HashMap<String, Integer> preTraversal(Node root, String prefixs) {

        HashMap<String, Integer> map = new HashMap<>();
        if (root != null) {
            if (root.leaf) {
                //当前即为一个单词
                map.put(prefixs, root.dumpliNum);
            }

            for (int i = 0, length = root.childs.length; i < length; i++) {
                if (root.childs[i] != null) {
                    char ch = (char) (i + 'a');
                    //递归调用前序遍历
                    String tempStr = prefixs + ch;
                    map.putAll(preTraversal(root.childs[i], tempStr));
                }
            }
        }
        return map;
    }

    /**
     * 判断某字串是否在字典树中
     *
     * @param word
     * @return
     */
    public boolean isExist(String word) {
        return search(this.root, word);
    }

    /**
     * 查询某字串是否在字典树中
     *
     * @param root
     * @param word
     * @return
     */
    private boolean search(Node root, String word) {
        char[] chs = word.toLowerCase().toCharArray();
        for (int i = 0, length = chs.length; i < length; i++) {
            int index = chs[i] - 'a';
            if (root.childs[index] == null) {
                //如果不存在，则查找失败
                return false;
            }
            root = root.childs[index];
        }
        return true;
    }


    /**
     * 得到以某字串为前缀的字串集，包括字串本身！类似单词输入法的联想功能
     *
     * @param prefix 字串前缀
     * @return 字串集以及出现次数，如果不存在则返回Null
     */
    public HashMap<String, Integer> getWordsForPrefix(String prefix) {
        return getWordsForPrefix(this.root, prefix);
    }

    /**
     * 得到以某字串为前缀的字串集，包括字串本身
     *
     * @param root
     * @param prefix
     * @return 字串集及出现次数
     */
    private HashMap<String, Integer> getWordsForPrefix(Node root, String prefix) {
        HashMap<String, Integer> map = new HashMap<>();
        char[] chrs = prefix.toLowerCase().toCharArray();

        for (int i = 0, length = chrs.length; i < length; i++) {
            int index = chrs[i] - 'a';
            if (root.childs[index] == null) {
                return null;
            }
            root = root.childs[index];
        }

        //结果包括该前缀本身
        //此处利用之前的前序搜索方法进行搜索
        return preTraversal(root, prefix);
    }

}
