package com.mehdi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mehdi Afsari Kashi
 * @version 1.0.0
 * @since 1.0.0
 *          Creation Date: 2016/06/09
 */
public class TreeNode {

    private final String name;
    private List<TreeNode> children;

    public TreeNode(String name, List<TreeNode> children) {
        this.name = name;
        this.children = children;
    }

    public void print() {
        print("", true);
    }

    public void add(TreeNode node) {
        if (children == null) {
            children = new ArrayList<TreeNode>();
        }

        children.add(node);
    }


    private void print(String prefix, boolean isTail) {
        System.out.println(prefix + (isTail ? "└── " : "├── ") + name);
        for (int i = 0; i < children.size() - 1; i++) {
            children.get(i).print(prefix + (isTail ? "    " : "│   "), false);
        }
        if (children.size() > 0) {
            children.get(children.size() - 1).print(prefix + (isTail ? "    " : "│   "), true);
        }
    }

    public void printSimple(){
        printSimple("", true);
    }

    private void printSimple(String prefix, boolean isTail) {
        System.out.println(prefix + (isTail ? "" : " ") + name);
        for (int i = 0; i < children.size() - 1; i++) {
            children.get(i).printSimple(prefix + (isTail ? "" : " "), false);
        }
        if (children != null && !children.isEmpty()) {
            children.get(children.size() - 1).printSimple(prefix + (isTail ? " " : "  "), true);
        }
    }
}
