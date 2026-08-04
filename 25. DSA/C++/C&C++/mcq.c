#include<Stdio.h>
int myshow();
void main()
{
	int a=10;
	myshow(a);
	myshow(&a);
}
int myshow(int b)
{
	printf("Recived %d, ",b );
}
