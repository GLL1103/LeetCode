```java
七大排序算法：插入排序，希尔排序，选择排序，堆排序，冒泡排序，快速排序，归并排序

public class Sort {

    //直接插入排序
    public void InsertSort(int[] arr) {
        if(null==arr || 0==arr.length) {
            return ;
        }

        int i = 1;
        for(;i<arr.length;++i) {
            int key = arr[i];
            int j = i-1;
            for(;j>=0;--j) {
                if(arr[j] > key) {
                    arr[j+1] = arr[j];
                }else{
                    arr[j+1] = key;
                    break;
                }
            }

            if(j==-1) {
                arr[0] = key;
            }
        }
    }
    //希尔排序
    public void ShellSort(int[] arr) {
        if(null==arr || 0==arr.length) {
            return ;
        }

        int len = arr.length;
        int gap = 3;
        while(gap > 0) {
            int i = 0;
            for(i=gap;i<len;++i) {
                int pre = i-gap;
                int key = arr[i];
                while(pre >= 0) {
                    if(arr[pre] > key) {
                        arr[pre+gap] = arr[pre];
                        pre -= gap;
                    }
                    else{
                        break;
                    }
                }
                arr[pre+gap] = key;
            }
            --gap;
        }
    }
    //选择排序
    public void chooseSort(int[] arr) {
        if(null==arr || 0==arr.length) {
            return ;
        }
        int min = 0;
        int max = 0;
        int left = 0;
        int right = arr.length-1;
        while(left < right) {
            min = max = left;
            for(int i = left;i<=right;++i) {
                if(arr[min] > arr[i]) {
                    min = i;
                }
                if(arr[max] < arr[i]) {
                    max = i;
                }
            }
            Swap(arr,left,min);
            if(max == left) {
                Swap(arr,right,min);
            }
            else{
                Swap(arr,right,max);
            }
            ++left;
            --right;
        }
    }
    public void Swap(int[] arr,int m,int n) {
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }
    //堆排序
    public void upAdjust(int[] arr,int len) {
        int parent = (len-1)>>1;
        while(parent >= 0) {
            int child = 2*parent+1;
            //找到较大孩子
            if(child+1 <= len && arr[child] < arr[child+1]) {
                child++;
            }
            if(arr[parent] < arr[child]) {
                Swap(arr,parent,child);
            }
            --parent;
        }
    }
    public void heapSort(int[] arr) {
        if(null==arr ||0==arr.length) {
            return ;
        }
        int len = arr.length;
        for(int i = 0;i<len-1;++i) {
            upAdjust(arr,len-i-1);
            Swap(arr,0,len-i-1);
        }
    }
    //冒泡排序
    public void BubbleSort(int[] arr) {
        if(null==arr || 0==arr.length) {
            return ;
        }
        for(int i = arr.length-1;i>0;--i) {
            boolean flag = false;
            for(int j = 0;j<i;++j) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;
                }
            }
            if(!flag) {
                break;
            }
        }
    }
    //快速排序
    public int partion(int[] arr,int left,int right) {
        int key = arr[right];
        int index = right;
        while(left < right) {
            while(left<right && arr[left] <= key) {
                ++left;
            }
            if(left >= right) {
                arr[index] = key;
                break;
            }else {
                arr[index] = arr[left];
                index = left;
            }

            while(left<right && arr[right]>key) {
                --right;
            }
            if(left >= right) {
                arr[index] = key;
                break;
            }else {
                arr[index] = arr[right];
                index = right;
            }
        }
        return index;
    }
    public int partion2(int[] arr,int left ,int right) {
        int key = arr[right];
        int index = right;
        while(left < right) {
            while(left<right && arr[left]<key) {
                ++left;
            }
            while(left<right && arr[right]>=key) {
                --right;
            }

            if(left == right) {
                arr[index] = arr[left];
                arr[left] = key;
                break;
            }else {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        return left;
    }
    public void QuickSort(int[] arr,int left,int right) {
        if(null==arr || 0==arr.length) {
            return;
        }

        if(left < right) {
            int index = partion2(arr,left,right);
            QuickSort(arr,left,index-1);
            QuickSort(arr,index+1,right);
        }
    }
    //归并排序
    public void MergeData(int[] arr,int left,int mid,int right,int[] tmp) {
        int i = left;
        int index = mid;
        while(left<index && mid<right) {
            if(arr[left] < arr[mid]) {
                tmp[i++] = arr[left++];
            }
            else{
                tmp[i++] = arr[mid++];
            }
        }
        while(left < index) {
            tmp[i++] = arr[left++];
        }
        while(mid < right) {
            tmp[i++] = arr[mid++];
        }
    }
    public void _MergeSort(int[] arr,int left,int right,int[] tmp) {
        if(right-left <= 1) {
            return;
        }

        int mid = left+((right-left)>>1);
        _MergeSort(arr,left,mid,tmp);
        _MergeSort(arr,mid,right,tmp);

        MergeData(arr,left,mid,right,tmp);
        for(int i = left;i<right;++i) {
            arr[i] = tmp[i];
        }
    }
    public void MergeSort(int[] arr) {
        if(null==arr || 0==arr.length) {
            return ;
        }

        int len = arr.length;
        int[] tmp = new int[len];
        _MergeSort(arr,0,len,tmp);
    }


    public static void main(String[] args) {
        int[] arr = {3,5,1,7,4,9,6,8,2,0};

        Sort s = new Sort();
        //s.InsertSort(arr);
        //s.chooseSort(arr);
        //s.BubbleSort(arr);
        //s.QuickSort(arr,0,arr.length-1);
        //s.ShellSort(arr);
        //s.heapSort(arr);
        s.MergeSort(arr);

        for(int i = 0;i<arr.length;++i) {
            System.out.print(arr[i]+" ");
        }
    }
}
```