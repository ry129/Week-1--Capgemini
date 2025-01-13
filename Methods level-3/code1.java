import java.util.Scanner;
	import java.util.Random;

public class Height{
	 public static void storeRandomHeights(int[] heights) {
        Random random = new Random();

        
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101); 
        }
    }

       //Create Method sum of all Players heights
       public static int add(int[] heights){
           int sum=0;
           for(int i=0;i<heights.length;i++){
              sum+=heights[i];
           }
           return sum;
       }
       
       //Create Method find mean.
        public static int findMean(int sumOfAllPlayers){
            return sumOfAllPlayers/11;
        }

        //Create Method find shortest height.
        public static int shortestHeight(int[] heights){
          int minHeight=heights[0];
             for(int i=1;i<heights.length;i++){
                if(minHeight>heights[i]){
                   minHeight=heights[i];
                }
            }
           return minHeight;
        }

         //Create Method find tallest height.
        public static int tallestHeight(int[] heights){
          int maxHeight=heights[0];
             for(int i=1;i<heights.length;i++){
                if(maxHeight<heights[i]){
                   maxHeight=heights[i];
                }
            }
           return maxHeight;
        }


       public static void main(String args[]){
		    int[] heights = new int[11];

       
        storeRandomHeights(heights);

        
        System.out.println("Heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

           int sumOfAllPlayers=add(heights);
		   System.out.println("Sum of players height is "+sumOfAllPlayers);
		   
           int meanHeight=findMean(sumOfAllPlayers);
           System.out.println("Mean height of players is "+meanHeight);

           int minHeight=shortestHeight(heights);
           System.out.println("shortest Height is :"+minHeight);

           int maxHeight=tallestHeight(heights);
           System.out.println("tallest Height is :"+maxHeight);
           
      }
}