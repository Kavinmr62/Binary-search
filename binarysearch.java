import java.util.*;
public class binarysearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        int a[]=new int[100];
        int left=0;
        int right=n-1;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();        
        }
        while(left<=right){
            int mid=(left+right)/2;
            if(a[mid]==key){
                System.out.println("Index of the key: "+mid);
                break;
            }
            else if(a[mid]<key){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
            
        }
        if(left>right){
            System.out.println("Element not found");
        }
}}
