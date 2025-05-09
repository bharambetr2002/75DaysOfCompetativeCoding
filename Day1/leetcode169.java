public class leetcode169 {
    public static void main(String[] args) {
        // using Moore's Voting Algorithm
        // created 2 variable keeping track of majority element and no. of votes
        // takes majority as first element and its occurance as vote = 1
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        int majority = nums[0];
        int votes = 1;

        // traversing the array
        for (int i = 1; i < nums.length; i++) {
            if (votes == 0) {
                votes++;
                majority = nums[i];
            } else if (majority == nums[i]) {
                votes++;
            } else {
                votes--;
            }
        }
        System.out.println("Majority Element: " + majority);
    }
}
