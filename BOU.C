
#include<iostream>
#include<conio.h>
#include<graphics.h>
using namespace std;
void b_fill(int x, int y, int f, int b)
{
	int c;
	c = getpixel(x,y);
	if((c!=b)&&(c!=f))
	{
		putpixel(x,y,f);
		delay(5);
		b_fill(x+1,y,f,b);
		b_fill(x, y+1,f,b);
		b_fill(x-1,y,f,b);
		b_fill(x,y-1,f,b);
	}
}

void b_fill(int, int, int, int);

void d_fill(int x, int y, int f, int b)
{
	int d;
	d = getpixel(x,y);
	if ((d!=b)&&(d!=f))
	{
		putpixel(x,y,f);
		delay(5);
		d_fill(x,y,f,b);
		d_fill(x+1,y,f,b);
		d_fill(x, y+1,f,b);
		d_fill(x-1,y,f,b);
		d_fill(x,y-1,f,b);
		d_fill(x+1,y+1,f,b);
		d_fill(x-,y-1,f,b);
		d_fill(x+1,y-1,f,b);
		d_fill(x-1,y+1,f,b);
	}
}
void d_fill(int, int, int, int);
void main()
{
	int gd=DETECT, gm;
	initgraph(&gd, &gm,"c:\\tc\\bg:");
	rectangle(50,50,100,100);
	b_fill(55,55,4,15);
	rectangle(200,200,250,250);
	d_fill(210,210,4,15);
	getch();
}
