package gidDemo;

public class primeno {
public static void main(String[] args) {
	for(int start=3;start<=10000;start++) {
		int flag=0;

	for(int i=2;i<=start/2;i++) {
		if(start%i==0) {
			flag=1;
		}
	}
	if(flag==0) {
		System.out.println(start);
	}
}
}}
