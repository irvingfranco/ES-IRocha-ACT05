/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.irocha.a05;

/**
 *irving Rocha 513382 Itic 4°semestre
 * @author casa
 */
public class algord {
    public void ordenamiento(int b){
        int a[] = new int[b];
        int t; // t va a ser el auxiliar
        for(int i = 0; i<a.length-1;i++){
            int m=i;// m va a ser el apuntador
                   for(int j =i+1;j<a.length;j++){
                       if (a[j]<a[m]){//j va a empezar en el lugar 1, si el dato de ja es menor al dato en m m va a ser igual a j(osea q va a ser 1)
                           m=j;
                       }
                   } 
                   t=a[i];//en t se va a guardar el dato que estaba en el lugar 0
                   a[i]=a[m];//ese guarda el valor donde m se encuentra
                   a[m]=t;// el dato t se va a guardar en el lugar 1
                  
        }
    }
    
}
