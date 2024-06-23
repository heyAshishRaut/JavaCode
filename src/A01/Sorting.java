package A01;
import java.util.*;

public class Sorting{
    // Bubble sort
    public void bubbleSort(int []A){
        // at every iteration, smaller element are moved to their correct position
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length - 1 - i; j++){
                if(A[j] > A[j + 1]){
                    int replace = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = replace;
                }
            }
        }
        System.out.println(Arrays.toString(A));
    }

    // Selection sort
    public void selectionSort(int []A){
        // at every iteration, larger element are moved to their correct position
        for(int i = 0; i < A.length; i++){
            int minPos = i;
            for(int j = i + 1; j < A.length; j++){
                if(A[minPos] > A[j]){
                    minPos = j;
                }
            }
            int replace = A[minPos];
            A[minPos] = A[i];
            A[i] = replace;
        }
        System.out.println(Arrays.toString(A));
    }

    // Insertion sort
    public void insertionSort(int []A){
        // at every iteration, each element are moved to their correct position
        for(int i = 0; i < A.length; i++){
            int j = i;
            while(j > 0 && A[j] < A[j - 1]){
                int replace = A[j];
                A[j] = A[j - 1];
                A[j - 1] = replace;
                j--;
            }
        }
        System.out.println(Arrays.toString(A));
    }

    public int findMax(int []A){
        int max = A[0];
        for(int i = 1; i < A.length; i++){
            if(max < A[i]){
                max = A[i];
            }
        }
        return max;
    }

    // Count sort
    public void countSort(int []A){
        // Counting Sort is a non-comparison-based sorting algorithm that works well
        // when there is limited range of input values.
        int max = findMax(A);

        int []count = new int[max + 1];
        for(int i = 0; i < A.length; i++){
            count[A[i]]++;
        }
        int k = 0;
        for(int i = 0; i < count.length; i++){
            for(int j = 0; j < count[i]; j++){
                A[k++] = i;
            }
        }
        System.out.println(Arrays.toString(A));
    }

    // Radix sort
    public void radixSort(int []A){
        int max = findMax(A);
        for(int place = 1; max / place > 0; place = place * 10){
            countSort(A, place);
        }
    }
    public void countSort(int []A, int place){
        int size = A.length;
        int []output = new int[size];
        int []count = new int[10];

        for(int i = 0; i < A.length; i++){
            count[(A[i] / place) % 10]++;
        }
        // prefix sum array
        for(int i = 1; i < count.length; i++){
            count[i] = count[i] + count[i - 1];
        }
        for(int i = size - 1; i >= 0; i--){
            int idx = count[(A[i] / place) % 10] - 1;
            output[idx] = A[i];
            count[(A[i] / place) % 10]--;
        }
        for(int i = 0; i < size; i++){
            A[i] = output[i];
        }
    }

    // Bucket sort
    public void bucketSort(float []A){
        int size = A.length;
        ArrayList<Float> []buckets = new ArrayList[size];

        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<Float>();
        }
        for(int i = 0; i < size; i++){
            int idx = (int)A[i]*size;
            buckets[idx].add(A[i]);
        }
        for(int i = 0; i < buckets.length; i++){
            Collections.sort(buckets[i]);
        }
        int index = 0;
        for(int i = 0; i < buckets.length; i++){
            ArrayList<Float> traverse = buckets[i];
            for(int j = 0; j < traverse.size(); j++){
                A[index++] = traverse.get(j);
            }
        }
    }

    // Merge sort
    public void merge(int []A, int start, int mid, int end){
        int size01 = mid - start + 1;
        int size02 = end - mid;

        int []left = new int[size01];
        int []right = new int[size02];

        int i, j, k;
        for(i = 0; i < size01; i++){
            left[i] = A[start + i];
        }
        for(j = 0; j < size02; j++){
            right[j] = A[mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = start;

        while(i < size01 && j < size02){
            if(left[i] < right[j]){
                A[k++] = left[i++];
            }
            else{
                A[k++] = right[j++];
            }
        }
        while(i < size01){
            A[k++] = left[i++];
        }
        while(j < size02){
            A[k++] = right[j++];
        }
    }

    public void mergeSort(int []A, int start, int end){
        if(start >= end){
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(A, start, mid);
        mergeSort(A, mid + 1, end);

        merge(A, start, mid, end);
    }


    public void swap(int []A, int start, int end){
        int replace = A[start];
        A[start] = A[end];
        A[end] = replace;
    }

    public void quickSort(int []A, int start, int end){
        if(start >= end){
            return;
        }
        int pivot = partition(A, start, end);
        quickSort(A, start, pivot - 1);
        quickSort(A, pivot + 1, end);
    }

    public int partition(int []A, int start, int end){
        int pivot = A[start];
        int count = 0;
        for(int i = start + 1; i <= end; i++){
            if(A[i] <= pivot){
                count++;
            }
        }
        int pivot_index = start + count;
        swap(A, start, pivot_index);

        int i = start, j = end;
        while(i < pivot_index && j > pivot_index){
            while(A[i] <= pivot){
                i++;
            }
            while(A[j] > pivot){
                j--;
            }
            if(i < pivot_index && j > pivot_index){
                swap(A, i, j);
                i++;
                j--;
            }
        }
        return pivot_index;
    }

    public static void main(String[] args){
        Sorting obj = new Sorting();
        int []A = {4, 1, 7, 6, 3, 9, 2, 8, 5, 0};

//        obj.mergeSort(A, 0, A.length - 1);
//        for(int i = 0; i < A.length; i++){
//            System.out.print(A[i] + " ");
//        }
//        System.out.println( );

        obj.quickSort(A, 0, A.length - 1);
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println( );
    }
}

