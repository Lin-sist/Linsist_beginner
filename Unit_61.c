#include <stdio.h>//求出100以内的素数；
#include <math.h>
int main ()
{
	int i,j;
	int a[100];

	for (i = 0; i < 100; i++)
	{
		a[i] = 1;
	}

	a[0] = 0;
	a[1] = 0;

	for (i = 2; i < sqrt(100); i++)
	{
		if (a[i] == 1)
		{
			for (j = i * i; j < 100; j += i)
			{
				a[j] = 0;
			}
		}
	}

	for (i = 2; i < 100; i++)
	{
		if (a[i] == 1)
		{
			printf ("%4d",i);
		}
	}
	return 0;
}
