/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

    import clases.dado ;



public class cliente {
     int l1,l2 , sum  ;
   
    
  public cliente( ){
       jugar();
   
  }
  public void jugar (){
      int frec[] = new int [11] ;
    dado dado1 = new dado();  
   dado dado2 =new dado() ;
      for (int i = 0; i < 1000; i++) {
         l1 = dado1.lanzar  ; 
          l2=dado2.lanzar ;
          sum=l1+l2 ;
          for (int j = 1; j < 11; j++) {
              if (sum=frec[j]) {
                  
                  
                      
          }
          }
                  
          
  }
          
  
}
}
