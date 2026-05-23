// time & space: O(n)

#include <stdio.h>

int main() {
    int bucketSize, outputRate, n;
    int packets[50];
    int bucketContent = 0;

    printf("Enter bucket size: ");
    scanf("%d", &bucketSize);

    printf("Enter output rate: ");
    scanf("%d", &outputRate);

    printf("Enter number of packets: ");
    scanf("%d", &n);

    printf("Enter packet sizes:\n");
    for(int i = 0; i < n; i++) {
        scanf("%d", &packets[i]);
    }

    printf("\nClock\tPacket Size\tBucket Content\tStatus\n");

    for(int i = 0; i < n; i++) {

        printf("%d\t%d\t\t", i + 1, packets[i]);

        // Check overflow
        if((bucketContent + packets[i]) > bucketSize) {

            printf("%d\t\tPacket Dropped\n", bucketContent);

        } else {

            bucketContent += packets[i];

            printf("%d\t\tPacket Added\n", bucketContent);
        }

        // Leak packets at constant rate
        if(bucketContent >= outputRate) {
            bucketContent -= outputRate;
        } else {
            bucketContent = 0;
        }
    }

    // Remaining packets leakage
    while(bucketContent > 0) {

        printf("%d\t0\t\t%d\t\tLeaking\n",
               n + 1, bucketContent);

        if(bucketContent >= outputRate) {
            bucketContent -= outputRate;
        } else {
            bucketContent = 0;
        }

        n++;
    }

    return 0;
}

/*
Enter bucket size: 10
Enter output rate: 3
Enter number of packets: 5
Enter packet sizes:
4
5
6
2
3
  */
