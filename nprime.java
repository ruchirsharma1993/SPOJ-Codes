class nprime{static boolean P(long n){if(n<2)return false;for (long i=2;i*i<=n;i++){if (n%i==0)return false;}return true;}public static void main(String a[])throws Exception{java.io.BufferedReader in=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));String s=in.readLine();while(true){int u=Integer.parseInt(s);int c=0;for(int i=1;;i++){if(P(i))c++;if(c==u){System.out.println(i);break;}}s=in.readLine();if(s.isEmpty())break;}}}