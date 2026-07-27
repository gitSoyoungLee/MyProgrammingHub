import java.util.*;
import java.io.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) throws Exception
	{
				
		for(int test_case = 1; test_case <= 10; test_case++) {
			int N = sc.nextInt();	// 빌딩의 개수
			int[] heights = new int[N];
			for(int i=0; i<N; i++) 
				heights[i] = sc.nextInt();
			
			int answer = 0;
			
			for(int i=2; i<N-2; i++) {
				int[] neighbors = new int[4];
				neighbors[0] = heights[i-2];
				neighbors[1] = heights[i-1];
				neighbors[2] = heights[i+1];
				neighbors[3] = heights[i+2];
				
				Arrays.sort(neighbors);
				int houses = heights[i] - neighbors[3];
				if(houses > 0) answer += houses;			}

			
			System.out.println("#" + test_case +" " + answer);
		}
	}
}