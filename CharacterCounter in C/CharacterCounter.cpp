#define max 40
#include<stdio.h>
#include<string.h>
main(void)
{
  char ch[max],chs[max];
  int chcounter[max],i,j,counter,single_ch=0,e=0,flag;
  printf("Enter the string : ");
  gets(ch);
  //...........
  counter=strlen(ch);
  for(i=0;i<counter;i++)
  {
  	single_ch=0;
  	for(j=0;j<counter;j++)
  	{
  		if(ch[i]==ch[j]&&ch[i]!=' ')
  		{
  			single_ch++;
  		}
  	}
  	while(1)
  	{
  		if(i==0)
  		{
  			chs[0]=ch[i];
  			chcounter[0]=single_ch;
  			e++;
  			break;
  		}
		else
		{
			flag=0;
				for(j=0;j<e;j++)
				{
					if(ch[i]==chs[j])
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					chs[e]=ch[i];
					chcounter[e]=single_ch;
					e++;
				}	
				break;	
		}  	
}
  }
  for(i=0;i<e;i++)
  {
  	if(chs[i]==' ')
  	continue;
  	printf("\ncharacter %c: %d",chs[i],chcounter[i]);
  }
}
