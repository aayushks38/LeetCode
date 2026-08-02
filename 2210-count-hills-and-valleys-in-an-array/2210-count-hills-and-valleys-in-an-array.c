int countHillValley(int* nums, int numsSize) {
    int filtered[numsSize];
    int size = 0;

    filtered[size++] = nums[0];

    for (int i = 1; i < numsSize; i++) {
        if (nums[i] != nums[i - 1]) {
            filtered[size++] = nums[i];
        }
    }
    int count = 0;

    for (int i = 1; i < size - 1; i++) {
        int prev = filtered[i - 1];
        int curr = filtered[i];
        int next = filtered[i + 1];

        if ((curr > prev && curr > next) ||
            (curr < prev && curr < next)) {
            count++;
        }
    }

    return count;
}