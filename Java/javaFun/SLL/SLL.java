public class SLL{
    private Node head;

    public SLL(){
        this.head = null; 
    }

    public void add(Node newNode){
        if(this.head == null){
            this.head = newNode;
        }else{
            Node runner = this.head;
            while(runner.next != null){
                runner=runner.next;
            }
            runner.next = newNode;
        }
    }

    public void showNodes(){
        Node runner = this.head;
        while(runner.next != null){
            System.out.println(runner.value); //prints first two nodes
            runner=runner.next;  
        }
        System.out.println(runner.value); //prints last node (after runner.next)   
    }

    public void removeNode(){
        Node walker = this.head;
        Node runner = this.head;
        while(runner.next != null){
            walker = runner;
            runner=runner.next;
        }
        walker.next = null;
    }
}