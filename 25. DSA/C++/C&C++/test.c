#include<stdio.h>
#include<stdlib.h>
#include<string.h> 

int
main()
{ 

int n,i;

printf("Enter the size or the number of chracters that you want to enter inside the string.\n");
scanf("%d",&n);

char *p = (char*)malloc((n+1)*sizeof(char));
if(p==NULL)
 {
 printf("Memory allocation fails..");
 exit(0);
 }
 
puts("Enter string");
for(i=0;i<(n+1);i++)
scanf("%c",p+i);

*(p+i)= '\0';

printf("String entered %s",p);

fflush(stdin);

printf("\nEnter new size\n");
scanf(" %d",&n); 

p = realloc(p,(n+1)*sizeof(char));

puts("Enter new string");
scanf("%d", &n);

 for(i=0;i<(n+1);i++)
 scanf("%c",p+i);
 
 *(p+i)= '\0'; 
 
 printf("New string \n%s",p);
 
 free(p);
 
return 0;
}

