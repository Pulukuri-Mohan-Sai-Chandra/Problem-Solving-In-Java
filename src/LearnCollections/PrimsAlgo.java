package LearnCollections;
import java.util.*;
public class PrimsAlgo {


    // Return the Minimum Cost to Cover all Nodes
    class Node implements Comparable{
        int dest;
        int cost;
        Node(int dest,int cost){
            this.dest = dest;
            this.cost = cost;
        }



        public String toString(){

            return "Node Destination : " + this.dest + " Node Cost is :  " + this.cost;


        }
        public int compareTo(Object obj){
            Node node = (Node)obj;
            return this.cost - node.cost;
        }
    }
    public int  getMinCost(){

        Queue<Node> pq = new PriorityQueue<>(Comparator.reverseOrder());
        List<Node> list = new ArrayList<>();
        for(int index = 0;index <= 5;index++){
            Node node = new Node(index, 1 + index ^ 5);
            pq.add(node);
            list.add(node);

        }
        System.out.println("The Actual Nodes is : "+list);
        System.out.println("Starting the Polling of the Priority Queue");
        while(!pq.isEmpty()){
            System.out.println("The Node is " + pq.poll());
        }

        return 0;
    }

}

