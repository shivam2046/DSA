class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
class Implementations {
    
    private Node head;
    public int size;
    public void insertAtStart(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode ;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        size++;

    }
     void insertAtidx(int data,int idx){
        Node newNode=new Node(data);
        if(idx>size+1){
            System.out.println("List is not ofsufficient length");
        }
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head; 
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        size++;
    }
    public void insertAtend(int data){
        Node n=new Node(data);
        
        if(head==null){
            head=n;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
            n.next=null;
        }
        size++;
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
    }
    public void deletelast(){
         if(head==null){
            System.out.println("List is empty");
            return;
        }
        else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
        size--;
    }
    public void deleteidx(int idx){
        if(idx>size){
            System.out.println("ouofbound");
            return;
        }
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        else{
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        size--;
    }

    
    public void print(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
  public class Implementation{
    public static void main(String[] args) {
        Implementations ll=new Implementations();
        ll.insertAtStart(1);
        // ll.insertAtidx(2,1);
        // ll.insertAtidx(3,2);
        // ll.insertAtend(4);
        // ll.insertAtend(5);
        ll.print();
        
        
        System.out.println(ll.size);


        System.out.println();

        ll.deletefirst();
        ll.print();
        System.out.println(ll.size);
        // ll.deleteidx(2);
        // ll.print();
        // System.out.println(ll.size);

        // ll.deletelast();
        // ll.print();
        // System.out.println(ll.size);
    }
  }  
