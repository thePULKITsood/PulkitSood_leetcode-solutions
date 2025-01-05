class LRUCache {
    
class Node 
{
    int key ; 
    int value ;
    Node prev ;
    Node next ;
    
    Node (int k , int v ){
        this.key = k ;
        this .value = v;
        
    }
    Node (){
        this(0,0);
    }
}
    
//     head and tail are just pointers 
    private void addNode (Node temp){
//         add the new node to the right of the head;
        if(size==0){
            this.head.next=temp;
            temp.prev = this.head;
            
            this.tail.prev=temp;
            temp.next=this.tail;        
        }
        else{
            temp.next = this.head.next;
            this.head.next=temp;
            temp.prev = this.head;
            temp.next.prev =temp;    
        }
        this.size++;
    }
    private void removeNode(Node temp){
        if(size==0)return;
        if(size==1){
            this.head.next=null;
            temp.prev = null;
            
            this.tail.prev=null;
            temp.next=null; 
            
        }
        else{
            temp.next.prev =temp.prev;
            temp.prev.next = temp.next;

        }
        this.size--;
        
    }
    private void moveToHead(Node temp){
        this.removeNode(temp);
        this.addNode(temp);
    }
    private Node  popTail(){
        Node temp = tail.prev;
        this.removeNode (temp);
    
        return temp;
        
        
    }
    
    private HashMap<Integer,Node >map = new HashMap<>();
    private Node head,tail; 
    private int size ;
    private int capacity = 0 ;   
 
    public LRUCache(int capacity) {
        this.capacity = capacity ;
        this.size = 0;
        head = new Node ();
        tail = new Node ();
        
        
    }
    
    public int get(int key) {
//         1. map .get (key ) == > return node 
//         2. remove the node 
//         3. add the node at first 
//         4. return node . data 
        
        Node temp = map.get(key);
        if (temp==null)return -1;
        
        this.moveToHead(temp);
        return temp.value;
        
    }
    
    public void put(int key, int value) {
//     -- 2 cases - -- already present  or not present 
        
        // already present -- > map.get(key) // iw will return a node we are calling th emethod on the hashmap 
//            1. move to head and return value  
//      
//         if not present 
        
//     1. create a node  - key = key and value = value 
//     2. map.put (key , node )
//     3. remove the last node /tail if size > capacity 
//     4. remove the node from map also 
        
        
        Node temp = map.get(key);
        if (temp==null){
            Node node = new Node (key , value);
            this.map.put(key,node);
            this.addNode(node);
            if(this.size>this.capacity) 
            {
                Node tail = this.popTail();
                map.remove(tail.key);
//                 important step 
            }
            
        }
        else {
            temp.value = value;
            this.moveToHead(temp);
          
        }
        
    }
}

