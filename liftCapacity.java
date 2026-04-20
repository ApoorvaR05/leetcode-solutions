// Cognizant
// Write a program that calculates the highest possible number of individuals who can use the lift together given a specific weight limit.

public int maxPeopleInLift(int input1, int input2, int[] input3) {
    int count = 0;
    int currentWeight = 0;

    // 1. Sort the weights from lightest to heaviest
    Arrays.sort(input3);

    for (int i = 0; i < input1; i++) {
        // 2. Check if adding the next lightest person exceeds capacity
        if (currentWeight + input3[i] <= input2) {
            currentWeight += input3[i];
            count++;
        } else {
            // 3. Since it's sorted, if this person doesn't fit, 
            // no one heavier will fit either. Break early.
            break;
        }
    }

    return count;
}

// sorting first so that maximum number of light people can be fitted
