// time & space: O(n^2)

#include<stdio.h>

#define MAX 10
#define INF 9999

int main() {
    
    int n, source;
    int graph[MAX][MAX];
    int distance[MAX], visited[MAX] = {0};
    
    printf("Enter number of routers: ");
    scanf("%d", &n);
    
    printf("Enter %d routers: ", n);
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf("%d", &graph[i][j]);
            if (graph[i][j] == 0 && i != j)
                graph[i][j] = INF;
        }
    }
    
    printf("Enter source: ");
    scanf("%d", &source);
    
    for (int i = 0; i < n; i++) {
        distance[i] = graph[source][i];
    }
    
    visited[source] = 1;
    distance[source] = 0;
    
    for (int  count = 1; count < n - 1; count++) {
       int min = INF, nextNode;
       for (int i = 0; i < n; i++) {
           if (!visited[i] && distance[i] < min) {
               min = distance[i];
               nextNode = i;
           }
       }
       visited[nextNode] = 1;
       
       for (int i = 0; i < n; i++) {
           if (!visited[i] && min + graph[nextNode][i] < distance[i])
            distance[i] = min + graph[nextNode][i];
       }
    }
    
    for (int i = 0; i < n; i++) {
        printf("To router %c -> %d\n", 65 + i, distance[i]);
    }
    
}

/* sample input
Enter number of routers: 4
Enter 4 routers: 0 2 5 0
2 0 1 4
5 1  0 3
0 4 3 0
Enter source: 0
  */
/*
theory

Link State Routing Algorithm

The Link State Routing Algorithm is a routing method used in computer networks where each router:

learns the complete network topology
calculates the shortest path to every destination

It is used in routing protocols like:

OSPF (Open Shortest Path First)
IS-IS
Basic Idea

Every router:

discovers its neighbors
measures link cost to neighbors
shares this information with all routers
builds a complete network map
computes shortest paths using Dijkstra’s Algorithm
Important Terms
1. Link

Connection between two routers.

2. Cost

Weight assigned to a link based on:

bandwidth
delay
congestion
reliability
3. Topology Database

A complete map of the network stored by every router.

Steps in Link State Routing
Step 1: Discover Neighbors

Router identifies directly connected routers.

Step 2: Measure Link Cost

Router calculates cost to each neighbor.

Example:

A → B = 2
A → C = 5
Step 3: Create Link State Packet (LSP)

Each router creates a packet containing:

router ID
neighbors
link costs
Step 4: Flooding

LSP is broadcast to all routers in the network.

Every router eventually receives all LSPs.

Step 5: Build Topology Database

Using received LSPs, each router constructs the same network graph.

Step 6: Run Shortest Path Algorithm

Routers use:

f(x)=Shortest Path using Dijkstra’s Algorithm

Usually implemented using Dijkstra’s Algorithm to compute shortest paths.
*/
