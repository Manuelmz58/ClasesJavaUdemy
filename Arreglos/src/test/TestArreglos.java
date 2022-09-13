package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3]; //Para crear arreglos se define el tamaño del arreglo y asi no pueden crecer mas
        System.out.println("edades = " + edades);
    
        edades[0] = 1;
        edades[1] = 10;
        edades[2] = 20;
        
        System.out.println("edades 0 = " + edades[0]);
        System.out.println("edades 1 = " + edades[1]);
        System.out.println("edades 2 = " + edades[2]);
    
        for (int i = 0; i < edades.length; i++){
            System.out.println("Elemento de edad = " + i + " es " + edades[i]);
//            if (edades[i] == 1){
//                System.out.println("Esta es una i");          //Cuando el valor del arreglo edades valga 1 imprimira
//            }

        }
        String frutas[] = {"Manzana", "Pera", "Melon", "Platano", "Sandia"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("fruta = " + frutas[i] + " Posicion #"+ i);
        }
    
    }
    

}
