#include <stdio.h>

int main() {
	int x = 0, *xptr = &x;
	int y = 1, *yptr = &y;
	int z = 2, *zptr = &z;

	printf("x = %d, address of x = %lx\n", *xptr, (unsigned long)xptr);
	printf("y = %d, address of y = %lx\n", *yptr, (unsigned long)yptr);
	printf("z = %d, address of z = %lx\n", *zptr, (unsigned long)zptr);



}
