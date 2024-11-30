class Solution {
    void nextPermutation(int[] arr) {
        // Convert array to list
        List<Integer> A = new ArrayList<>();
        for (int i : arr) {
            A.add(i);
        }

        int n = A.size(); // Size of the array
        int ind = -1; // Index initialization

        // Step 1: Find the first descending element from the end
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                ind = i;
                break;
            }
        }

        // If no such element is found, reverse the list to get the smallest permutation
        if (ind == -1) {
            Collections.reverse(A);
            // Convert list back to array
            for (int i = 0; i < arr.length; i++) {
                arr[i] = A.get(i);
            }
            return;
        }

        // Step 2: Find the smallest element larger than A[ind] in the suffix and swap
        for (int i = n - 1; i > ind; i--) {
            if (A.get(i) > A.get(ind)) {
                int temp = A.get(i);
                A.set(i, A.get(ind));
                A.set(ind, temp);
                break;
            }
        }

        // Step 3: Reverse the right half
        List<Integer> sublist = A.subList(ind + 1, n);
        Collections.reverse(sublist);

        // Convert list back to array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = A.get(i);
        }
    }
}
