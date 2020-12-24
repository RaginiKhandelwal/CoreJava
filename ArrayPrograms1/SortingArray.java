public class SortingArray{
	public static void main(String[] args) {
		int []a={9,2,7,6,4,8,3,1,5};
		int hi=0;
		int lo=a.length-1;
		int mid=(hi+lo)/2;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
         }


       // sorting array first then printing half array in asc order
         //and half in desc order
		 for(int i=0;i<a[mid];i++)
		 { System.out.println(a[i]); }

	for(int i=a.length-1;i>a[mid]-1;i--)
		{ System.out.println(a[i]); }
	}
}