class MyHashSet {
  private Bucket[] bucketArray;
  private int keyRange;

  /** Initialize your data structure here. */
  public MyHashSet() {
    keyRange = 769;
    bucketArray = new Bucket[keyRange];
    for (int i = 0; i < this.keyRange; ++i)
      bucketArray[i] = new Bucket();
  }

  protected int _hash(int key) {
    return (key % keyRange);
  }

  public void add(int key) {
    int bucketIndex = _hash(key);
    bucketArray[bucketIndex].insert(key);
  }

  public void remove(int key) {
    int bucketIndex = _hash(key);
    bucketArray[bucketIndex].delete(key);
  }

  /** Returns true if this set contains the specified element */
  public boolean contains(int key) {
    int bucketIndex = _hash(key);
    return bucketArray[bucketIndex].exists(key);
  }
}


class Bucket {
  private LinkedList<Integer> container;

  public Bucket() {
    container = new LinkedList<Integer>();
  }

  public void insert(Integer key) {
    int index = container.indexOf(key);
    if (index == -1) {
      container.addFirst(key);
    }
  }

  public void delete(Integer key) {
    container.remove(key);
      
  }

  public boolean exists(Integer key) {
    int index = container.indexOf(key);
    return (index != -1);
  }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */