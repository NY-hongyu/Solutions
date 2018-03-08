package Chapter3;

/**
 * Created by NY on 2018/3/8.
 */
public class PrintNodeEdge {
    public void printNodeEdge(Node head){
        int h = getHeight(head,0);
        Node[][] nodeMap = new Node[h][2];
        setNodeMap(head,0,nodeMap);


    }

    private void setNodeMap(Node head, int l, Node[][] nodeMap) {
        if(head==null){
            return;
        }
        nodeMap[l][0] = nodeMap[l][0] == null ? head : nodeMap[l][0];
        nodeMap[l][1] = head;
        setNodeMap(head.left,l+1,nodeMap);
        setNodeMap(head.right,l+1,nodeMap);
    }

    public int getHeight(Node head,int l){
        if(head==null){
            return l;
        }
        return Math.max(getHeight(head.left,l+1),getHeight(head.right,l+1));
    }

}
