package june_15_2026;

public class max_heap {
    int arr[];
    int capacity;
    int size;

    public max_heap(int c){
        arr = new int[c];
        size = 0;
        capacity = c;
    }

    int left(int i){
        return 2*i+1;
    }

    int right(int i){
        return 2*i+2;
    }

    int parent(int i){
        return (i-1)/2;
    }
    public void insert(int val){
        if(size==capacity){
            System.out.println("Heap Overflow");
            return;
        }

        int i= size;
        arr[size++] = val;

        while (i!=0 && arr[parent(i)]>arr[i]) {
            int temp = arr[i];
            arr[i]= arr[parent(i)];
            arr[parent(i)]= temp;

            i= parent(i);
        }
    }

    public int pop(){
        if(size==0){
            System.out.println("heap underflow");
            return -1;
        }

        int root= arr[0];
        arr[0]= arr[size-1];
        size--;

        heapify(0);

        return root;
    }

    public void heapify(int i){

    }

    public static void main (String[] args){

    }
}
