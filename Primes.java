public class Primes {
    public static void main(String[] args) {

      int n = Integer.parseInt(args[0]);
      int counter = 0;
        
      System.out.println("Prime numbers up to " + n + ":");
        for(int i = 2 ; i <= n ; i ++){
            int p = 0;
      
                for(int j = 2 ; j < i ; j++){
                    if(i % j == 0){
                        p = 1;
                    }
                }
            if(p == 0){
                System.out.println(i);
                counter++;
            }
            
        }
        System.out.print("There are " + counter + " primes between 2 and " + n + " (" + (100*counter / (n)) + "% are primes)" );
    }
}