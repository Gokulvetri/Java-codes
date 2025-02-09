public class towerOfHanoi {
    static void solvehanoi(int n , char source, char axis, char destination){
        if(n == 1){
            System.out.println("Move from "+ source+" to "+ destination);
            return;
        }
        solvehanoi(n-1,source,axis,destination);
        System.out.println("Move "+ n+" from "+source+" to "+ destination);
        solvehanoi(n-1,axis,destination,source);
   }
   public static void main(String[] args) {
      int n= 3;
      solvehanoi(n, 'A', 'B', 'C');

   }
}
