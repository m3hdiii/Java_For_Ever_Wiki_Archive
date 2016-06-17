package com.mehdi;

/**
 * @author Mehdi Afsari Kashi
 * @version 1.0.0
 * @since 1.0.0
 *          Creation Date: 2016/06/09
 */
public class NodeLauncher {

    public static void main(String[] args) {
        System.out.println("Java For Ever Updated WIKI");
        TreeNode rootNode = new TreeNodeArchitecture().get();

        rootNode.print();
//        System.out.println("\nLet's keep Wiki Update:\nhttps://github.com/m3hdiii/Java_For_Ever_Wiki_Archive\n");
        System.out.println("#Java_4_Ever_Big_Archive\n");

        System.out.println("\n===========================================\n");

        rootNode.printSimple();
//        System.out.println("\nLet's keep Wiki Update:\nhttps://github.com/m3hdiii/Java_For_Ever_Wiki_Archive\n");
        System.out.println("#Java_4_Ever_Big_Archive_Simple_View\n");
    }
}
