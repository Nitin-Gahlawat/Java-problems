//Question
    //Show the Directory Structure using the JTree Component.
//Answer
package graphics.swing;

import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo extends JFrame implements TreeSelectionListener {
    JLabel l;

    JTree jt;

    private DefaultMutableTreeNode getTreeStructure(String s) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(s);
        File f = new File(s);
        File[] list = f.listFiles();
        for (File x : list) {
            if (x.isDirectory()) {
                DefaultMutableTreeNode temp = getTreeStructure(x.toString());
                root.add(temp);
            } else {
                root.add(new DefaultMutableTreeNode(x.getName()));
            }
        }
        return root;
    }

    JTreeDemo() {

        l = new JLabel("No file Selected");
        add(l);

        DefaultMutableTreeNode root = getTreeStructure(System.getProperty("user.dir"));
        jt = new JTree(root);
        jt.addTreeSelectionListener(this);
        JScrollPane s = new JScrollPane(jt);

        add(s, BorderLayout.CENTER);
        add(l, BorderLayout.SOUTH);
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        // Showing the dir path else showing the file name.
        String[] str = e.getPath().toString().split(",");
        l.setText(str[str.length - 1].replace(']', ' '));
    }

    public static void main(String[] args) {
        JTreeDemo n = new JTreeDemo();
        n.setVisible(true);
        n.setSize(450, 450);
        n.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
