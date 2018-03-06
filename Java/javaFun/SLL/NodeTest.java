public class NodeTest{
    public static void main(String[] args){
        Node node1 = new Node(1);
        Node node2 = new Node(2);        
        Node node3 = new Node(3);
        SLL sll = new SLL();

        sll.add(node1);
        sll.add(node2);
        sll.add(node3);

        sll.showNodes();

        System.out.println("**********");
        
        sll.removeNode();
        sll.showNodes();
    }
}