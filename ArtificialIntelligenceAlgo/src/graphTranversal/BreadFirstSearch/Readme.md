# Breadth First Search

1.  Visit each node 
2.  Visit every VERTEX once
3.  Visit neighbours then the neighbours of these and so on
4.  Time : O(V+E)
5.  Memory : Not good we have to store lots of reference
6.  That's why DFS is preferred
7.  BUT it constructs the SHORTES Path : Djikstra Algo does BFS if all the edge weights are equal to 1

8.  We only use FIFO structure
```
bfs(vertex)
        Queue queue                 
        vertex set visited true
        queue.enqueue(vertex)

        while queue not empty
            actual = queue.dequeue()

            for v in actual neighbours
                if v is not visited 
                    v set visited true
                    queue.enqueue(v)
```

         _______ A_________
        |        |         |
        B        F          G
________|_______            |___
|               |               |
C               D               H
|        _______|
        |
        E
```

Queue : { } is empty
Started Vertex : A : visited

Queue : { A } dequeue node A to be able to process its neighbours --> visit all the children, if a Node is unvisited then enqueu it.

Queue : { B } node B is not visited  -- > put it to the queue
Queue : { B F } node f is not Visited --> put it to the queueu
Queue : { G B F } node G is not visited --> put it to the queue

Dequeu B
Queue { G F *B*} : dequeue the next node -- > it is B and visits its children + put them into the queue if necessary

Enqueu B children  
Queue { D C G F } : dequeue the next node -- > it is G and visits its children + put them into the queue if necessary

denqueu F children  
Queue { D C G  } : dequeue the next node -- > it is F and visits its children + put them into the queue if necessary

denqueu G children  
Queue { H D C   } : dequeue the next node -- > it is G and visits its children + put them into the queue if necessary

denqueu H children -- it is a Leaf node  
Queue { H D} : dequeue the next node -- > it is G and visits its children + put them into the queue if necessary

denqueu D children -- Enqueue D children  
Queue { E H } : dequeue the next node -- > it is D and visits its children + put them into the queue if necessary

Queue { E} -- same

Qeue { } : now the queue is empty


```

# Visit the node Row by row 

## Cheyens algo in garbage collection

