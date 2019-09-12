package ch19Compositepattern.Compositefirstcode;

import java.util.Collections;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("不能给叶子节点添加后代");
    }

    @Override
    public void remove(Component c) {
        System.out.println("不能从叶子节点删除后代");
    }

    @Override
    public void display(int depth) {
        System.out.printf("\n" +
                String.join("", Collections.nCopies(depth, "-")) + getName());
    }

}
