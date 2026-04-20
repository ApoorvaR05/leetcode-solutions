// cognizant
// Problem: Sequential Library Bookshelf ArrangementDescriptionA library is being organized with the help of a group of students. Each student arrives in a specific order, carrying a collection of books. The library has bookshelves that can hold a maximum of K books each.The shelves must be fully filled to be considered "decked." The arrangement follows these strict rules:Sequential Filling: Students must contribute their books in the order they arrive.Carry-over: If a student has more books than what is needed to fill the current shelf, the excess books carry over and are combined with the books of the next student in line.Shortfall: If a student (plus any carry-over from the previous student) has fewer books than the capacity $K$, all those books carry over to the next student’s turn.The Last Student Rule: Once the final student in the sequence has contributed their books and filled as many full shelves as possible, any remaining books that do not form a complete shelf are discarded.ObjectiveCalculate and return the total number of bookshelves that are completely filled (decked) by the end of the process.Input Specificationinput1: An integer representing the number of students ($N$).input2: An integer K, representing the maximum number of books a shelf can hold.input3: An integer array representing the number of books each student has in the order of their arrival.Output SpecificationReturn an integer value representing the total number of bookshelves that are completely filled.


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
