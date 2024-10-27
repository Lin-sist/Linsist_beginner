#include <stdio.h>
int main(){
    int h,r,n;
    float pi=3.14f,v,s;
    scanf("%d%d",&h,&r);
    s = pi*r*r;
    v = s*h;
    n = (20000/v);
    if (20000-v !=0)
    {
        n +=1;
    }
    printf("%d",n);
    return 0;
}