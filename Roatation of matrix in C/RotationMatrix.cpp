#define size_arr 10
#include<stdio.h>
#include<conio.h>
#define shivam m##a##i##n
shivam(void)
{
	int a[size_arr][size_arr],b[size_arr][size_arr];
	int i,j,value,size;
	int choice,m,n;
	int extLoop;
	printf("\nEnter the size of array: ");
	scanf("%d",&size);
	extLoop=size/2;
	printf("\nEnter Array Elements: \n");
	for(i=0;i<size;i++)
	{
		for(j=0;j<size;j++)
		{
			scanf("%d",&a[i][j]);
		}
	}
	printf("\nMatrix Elements are: \n");
	for(i=0;i<size;i++)
	{
		for(j=0;j<size;j++)
		{
			printf("%d\t",a[i][j]);
		}
		printf("\n");
	}
	//Rotation.........................................
	do
	{
	for(i=0;i<extLoop;i++)
	{
		value=0;
		//row
		for(j=i;j==i;j++)
		{
			for(m=i;m<size-(i);m++)
			{
			  value=a[j][m];
			  if(m+i<=size-(i+1))
			  {	
			  b[j][m+1]=value;		   
			  }
			  else
			  {
			  	break;
			  }
		    }
	    }
	//column
	for(j=size-(i+1);j==size-(i+1);j--)
	{               
		for(m=i;m<size-(i+1);m++)
		{
			if(m+i<=size-(i+1))
			{
				b[m+1][j]=value;
			}
			value=a[m+1][j];
		}
		break;
	}
	
	//row
	for(j=size-(i+1);j==size-(i+1);j++)
	{
		for(m=size-(i+1);m>=i;m--)
		{
			if(m-1>=i)
			{
			b[j][m-1]=value;
		    }	
		    else
		    {
		    	break;
			}
		value=a[j][m-1];
		}
	}
	//column
	for(j=i;j==i;j++)
	{
		for(m=size-(i+1);m>=i;m--)
		{
			if(m-i>=i)
			{
				b[m-1][j]=value;
			}
			value=a[m-1][j];
		}
		break;
	}
	if(size%2!=0)
	{
		b[size/2][size/2]=a[size/2][size/2];
	}
}
//show..
	printf("\nMatrix after rotation: \n");
	
	for(i=0;i<size;i++)
	{	
	 for(j=0;j<size;j++)
	 {
	 	printf("%d\t",b[i][j]);
	 }
	 printf("\n");
    }
    //......refreshing matrix.............
    for(i=0;i<size;i++)
    {
    	for(j=0;j<size;j++)
    	{
    		a[i][j]=b[i][j];
		}
	}
    printf("If you want to rotate the Matrix Again then press '1' otherwise press '0'\n");
    scanf("%d",&choice);
}while(choice==1);
// Done.
}
