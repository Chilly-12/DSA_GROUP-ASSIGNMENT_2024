import java.util.ArrayList;
import java.util.List;

class Star {
    private Node centralNode;
    private List<Node> peripheralNodes;

    public Star() {
        this.centralNode = new Node();
        this.peripheralNodes = new ArrayList<>();
    }

    public void insertNode(Node node) {
        peripheralNodes.add(node);
    }

    public void deleteNode(Node node) {
        peripheralNodes.remove(node);
    }

    public static void main(String[] args) {
        Star star = new Star();
    
    }
}

class Node {
    private List<Object> dataValues;

    public Node() {
        this.dataValues = new ArrayList<>();
    }
}