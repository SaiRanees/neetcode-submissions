/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Integer, Node> h=new HashMap<>();
    public Node cloneGraph(Node node) {
        return clone(node);
    }
    public Node clone(Node n){
        if(n==null) return null;
        else if(h.containsKey(n.val)){
            return h.get(n.val);
        }
        Node newn=new Node(n.val, new ArrayList<>());
        h.put(newn.val, newn);
        for(Node nei: n.neighbors){
            newn.neighbors.add(clone(nei));
        }
        return newn;
    }
}