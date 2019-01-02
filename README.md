# Source code as Art

Every year, the IOCCC (https://www.ioccc.org/) serves as a form for monstrous C code, like the following snippet (not mine, from https://www.ioccc.org/2018/algmyr/prog.c).

<pre>
"\0";                            int s,p,e,c,t,r,a,l;   /* l e a k a g e */
 
                                                     int
                                                   F(int o
                                                ,int n, int t
                                             ){char*p=(o*(136-o)
                                           >=1260)*7*(o-9)+G; for(
                                          n=!(o=-1); n=*p+++64*n-*G
                                        ,(o+=3)>>2<5-t; ); return 255
                                       &n>>2*o%8; } float L[0x400];int
                                     T(float a,float b,float l,float*e)
                                    {return L[0x3ff]||!(e[1]=b*a+l**e)||
                                   !T(l*a-b**e,b,l,e+1); } float f(int x)
                                  {int w=s<<!!T(1,6.135885e-3,-1.882472e-5
                                 +1,L); x=(x%w+w)%w<<9; return(L[x/s]*(s-x%
                                s)+L[x/s+1]*(x%s))/s; } int C(float*h,float*
                               i,int r,int P){ int x,y,c; for(y=0; h<i; ++y,h
                               +=r){ c=P<1; for(*h=x=0; x<8; c+=(1&P>>x&&P+(*
                              h+=f(e*(l+a*(2*x+1))*y)*f(s/2-e*a*y+e*a*y*y*(t/p
                             )/(s/p)))),++x); float z=f(y*t)*f(y*t); *h=z*(1+3*
                             z+2*z*z)/6**h/c; } return h-i-r+1; } void d(int w,
                            int n,FILE*f){int Z=s/t; int S[5]; float**P=M float*
                            )*c);for(r=0;r<c;++r){ P[r]=M float)*Z); C(P[r],P[r]
                           +Z,1,r); } float*x=M float)*Z*w); for (; ; ){ for(r=0;
                r<5        ; ++r){ int o=1; for(R,a=256; o&&--a; )for(o=t=0; t<Z;        o+=
               P[a][       t]!=x[w*t+n],++t); S[r]=a; } if(R-Z*w)break; for(r=a= -      12;r<
              5&&(a+=     a<11?22:1)<127; )for(r=-1; ++r<5&&F(a,1,r)==S[r]; );if(a     <127&&r
    ==5      )putchar(    a); } for(; --c; E P[c])); E P); fclose(f);}int main(int    q,char**v)      {s=
   44100     ;p=25; e=    55;c=256; t=75; r=q>1?v[1][0]*c+v[1][1]:0; a=7;l=16;if(r    ==11620){d     (atoi
  (v[2]),   atoi(v[3]),  q<5?stdin:fopen(v[4],"r")); return 0; } char*H=malloc(c),*  h=H; sprintf   (H,"\0"
 "Usage\n"  "    %s [-"  "h] [-d #c cid] file1 file2 ... (or stdin)"+(q-1&&r==11624  ),v[0]);if(*  H)q=1;int
 w=2>q?1:q -1; FILE**f=M FILE*)*w); f[0]=stdin; if(q>1)for(r=0; r<w; f[r]=fopen(v[r +1],"r"),++r); int l=s/t
 *w; float *b=M float)*l ),*t=b+l; int*i=M int)*w); for(; ; ){ int x=*h&&1>ungetc(* H++,*f); for(r =w; r--;)
{ i[r]=getc (f[r]); if(i[r]<0)i[r]=!++x; } if(x==w)break; while(++r<6){ while(C(b++,t,w,F(*i++,r< 5,r))); i-=
w; fwrite(b-=w,sizeof(float),l,stdout); } fflush(stdout); } while(fclose(f[--w]),w); E f); E b); E i); E h);}

</pre>

This repo strives to increase accessibility to such horrors, by providing open source tools to do the following, in Java, and Python.

<ul>
<li>minify source, by truncating names, and removing all whitespace</li>
<li>Reformatting into an arbitrary image, ascii art shape.</li>
<li>Creating source that outputs an image, but itself looks like the image (a psuedo-quine if you will)</li>
</ul>
