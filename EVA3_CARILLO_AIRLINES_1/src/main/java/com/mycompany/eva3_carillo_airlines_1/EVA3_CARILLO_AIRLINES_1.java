/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_carillo_airlines_1;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA3_CARILLO_AIRLINES_1 {
       //GENERATE A GLOBAL SCANNER
    public final static Scanner cap = new Scanner(System.in);
    
    //DESTINE VARIABLES  (USER1)
    public static String DESTINO;
    public static String ORIGEN;
    public static int CLASE; 
    public static String CLASE2;          //CLASS TYPE
    public static int TIPOVUEL;           //FLIGHT TYPE
    public static String TIPOVUEL2;       //FLIGHT TYPE 2
    public static int TIPOBOL;            //TICKET TYPE
    public static String TIPOBOL2;        //TICKET TYPE 2
        // ARRAY OF COUNTRYES 
    public static final String[] PAISES1 = {
        "Alemania", "Argentina", "Australia", "Austria", "Belgica", 
        "Canada", "Chile", "China", "Colombia", "Corea del Sur", 
        "Croacia", "Dinamarca", "Ecuador", "Egipto", "España", 
        "Estados Unidos", "Filipinas", "Finlandia", "Francia", "Grecia",
        "Holanda", "Hungria", "India", "Indonesia", "Irlanda", 
        "Israel", "Italia", "Japon", "Brasil", "Mexico" };
    public static final String[] PAISES2 = {
        "Alemania", "Argentina", "Australia", "Austria", "Belgica", 
        "Canada", "Chile", "China", "Colombia", "Corea del Sur", 
        "Croacia", "Dinamarca", "Ecuador", "Egipto", "España", 
        "Estados Unidos", "Filipinas", "Finlandia", "Francia", "Grecia",
        "Holanda", "Hungria", "India", "Indonesia", "Irlanda", 
        "Israel", "Italia", "Japon", "Brasil", "Mexico" };
    
    //we start making statements (USER2)
    //Integer type variable declaration "Number passengers"
    //string type variables email and phone number
    public static int numps;
      //Statement of arrays
    //Array one:  "DATA" with a size is four
    //Array two: it's last name
    //Array three: is name
    public static String[] DATOS = new String[4];
    public static String[] APELL;
    public static String[] NOMBR;
    public static String EMAIL;
    public static String TELEF;
    //Now we move on to the method

    public static void main(String[] args) {
    //declare start menu
        int inicio = 0;
        
        System.out.println("============================BIENVENIDO A CARRILLO AIRLINES============================");

        int k = -1; //Deaclare ANY NUMBER THAT IS NOT 1 AND 0
        while((k<0) || (k>1)){ //The while loop sets the only 2 numbers which are 1 and 0
            System.out.println("");
            System.out.println("Iniciar (Presione 1)");
            System.out.println("");
            System.out.println("Salir   (Presione 0)");
            inicio = cap.nextInt(); //CAPTURE THE NUMBER FOR ENTER OF EXIT THE CODE
            cap.nextLine(); //CHANGE THE INICIO VARIABLE 
            switch(inicio){ //DEPENDS ON THE NUMBER ASSIGNED TO YOU, CHOOSE AN OPTION
                case 1: 
                    k=1; //CHANGE TO NUMBER 1 (START)
                    break;
                case 0:
                    k=0; //CHANGE TO NUMBER 2 (EXIT)
                    break;  
                default: //IF THE CAPTURE DOES NOT MATCH THE CORRESPONDING NUMBERS, REPEAT THE QUESTION
                    System.out.println("NUMERO INVALIDO");
                    break;  
            }
        }
        String capusu,cappws;
        //DECLARE TO CAPTURE USERNAME AND PASSWORD
        //START A LOOP TO ASK FOR USERNAME AND PASSWORD
        //YOU HAVE THREE ATTEMPTS TO ENTER EACH DATA CORRECTLY
        while(k==1){ //IF K WAS DECLARED AS 1 IN THE PREVIOUS CYCLE. THE PROGRAM STARTS
            System.out.println("=======================================USUARIOS=======================================");
            System.out.println("MOSTRAR LISTA DE USUARIOS   (Escriba 3)");
            System.out.println("MOSTRAR BOLETO/S            (Escriba 4)");
            System.out.println("IMPRIMIR BOLETO/S           (Escriba 5)");
            System.out.println("SALIR                       (Escriba 0)");
            System.out.println("");
            System.out.println("USUARIO:");//CAPTURE USER
            capusu=cap.nextLine();
            if(!(capusu.equals("3"))&&!(capusu.equals("4"))&&!(capusu.equals("5"))&&!(capusu.equals("0"))){ //EVALUATE THAT THE FIRST DATA CAPTURED IS NOT EQUAL TO 3, 4, 5, 0
                System.out.println("CONTRASEÑA:");//CAPTURE PASSWORD AFTER USER IS ANYTHING OTHER THAN 3, 4, 5 and 0
                cappws=cap.nextLine();
                
                if(capusu.equals("USER1")&&cappws.equals("1234")) {         //EVALUATE THE INPUT TO VALIDATE IF IT IS CORRECT
                    eleccionDestino("BIENVENIDO!!");                         //IN .EQUALS DECLARE TE USERS AND PASSWORDS
                }else if(capusu.equals("USER2")&&cappws.equals("1234")) {
                    capturaDatos("BIENVENIDO!!");                            //WITHIN THIS, WE CALL THE METHODS OF USERS
                }else if(capusu.equals("USER3")&&cappws.equals("1234")) {
                    
                }else if(capusu.equals("USER4")&&cappws.equals("1234")) {
                    
                }else if(capusu.equals("USER5")&&cappws.equals("1234")) {
                    
                }else{ //SI LAS 2 CAPTURAS NO SON IGUALES A UN DATO ASIGNADO
                    System.out.println("ACESSO DENEGADO");
                }
            }else if(capusu.equals("0")) { //EVALUATE THAT THE FIRST DATA CAPTURED IS 0 BREAK THE SYSTEM.
                System.out.println("Ah Salido del sistema CARRILLO AIRLINES");
                break;
            }else if(capusu.equals("3")) { //EVALUATE THAT THE FIRST DATA CAPTURED IS 3 
                                           //SHOWS THE LIST OF USERS
            }else if(capusu.equals("4")){ //EVALUATE THAT THE FIRST DATA CAPTURED IS 4
                                        //SHOWS THE TICKET DEPENDING ON THE CAPTURE PROGRESS
            }else{ //EVALUATE THAT THE FIRST DATA CAPTURED IS 5
                                     //PRINT THE COMPLETE TICKET ONLY IF ALL DATA WAS ALREADY CAPTURED
            }
        }
    }
    
    //METHOD FOR USER1
    public static String eleccionDestino(String mensaje){//THIS IS A METHOD TO ACESS USER1
        System.out.println(mensaje);
        System.out.println("USER1:=================================ROL:Tomar el viaje del pasajero");
        ORIGEN = tomarLugOrg("Lugar de origen: ");
        int ciclo = 0; //A VARIABLE IS CREATED TO START THE LOOP
        while(ciclo == 0){
            DESTINO = tomarDestino("A que destino se dirige el pasajero?");
            if(!(DESTINO.equals(ORIGEN))){
                do{
                    tomarClase("Que tipo de clase tomara ?");
                    tomarVuelo("Que tipo de vuelo tomara ?");
                    tomarBoleto("Que tipo de viaje quiere ?");
            
                    //CHANGE THE NUMERIC VALUES OF THE CLASS TO TEXT
                    if(CLASE == 3){
                        CLASE2 = "Turista";
                    }else if(CLASE == 2){
                        CLASE2 = "Ejecutivo";
                    }else{
                        CLASE2 = "Primera Clase";
                    }
                    //CHANGE THE NUMERIC VALUES OF THE FLIGHT TYPE TO TEXT
                    if(TIPOVUEL == 1){
                        TIPOVUEL2 = "Directo";  
                    }else{
                        TIPOVUEL2 = "Con conexion";
                    }//CHANGE THE NUMERIC VALUES OF THE TICKET TYPE TO TEXT
                    if(TIPOBOL == 1){
                        TIPOBOL2 = "Ida";
                    }else{
                        TIPOBOL2 = "Ida y vuelta";
                    }
                    System.out.println("Mostrar datos (Escriba 1)");
                    System.out.println("Salir         (Cualquiera)");
                    int resp = cap.nextInt();
                    cap.nextLine();
                    if(resp == 1){
                        System.out.println("================VIAJE================");
                        System.out.print("Origen:" + ORIGEN + "- ");
                        System.out.print("Destino:" + DESTINO + "- ");
                        System.out.println("Clase:" + CLASE2 + "- ");
                        System.out.print("Vuelo:" + TIPOVUEL2 + "- ");
                        System.out.print("Boleto(s):" + TIPOBOL2);
                        System.out.println("");
                        System.out.println("=====================================");
                        ciclo = 1;
                    }else{ 
                        ciclo = 1;
                    }    
                }while(false);
            }else{
                System.out.println("El pais de Destino no puede ser el mismo que el de Origen");
            }
        }  
        return mensaje;
    }
    
    public static String tomarLugOrg(String mensaje){
        while(true){
            System.out.println(mensaje);
            System.out.println("Mostrar lista de paises (Escriba 1)");
            ORIGEN = cap.nextLine();
            if(!(ORIGEN.equals("1"))){
                for(String pais : PAISES1){
                    if(ORIGEN.equals(pais)){
                        return ORIGEN;
                    }else{
                    }
                }
                System.out.println("No Existe ese pais en el sistema!!!");
            }else{
                mostrarLista1();
            }
        }
    }
    
    public static String tomarDestino(String mensaje){//THIS METHOD IS FOR DESTINATIONSELECTION
        while(true){
            System.out.println(mensaje);
            System.out.println("Mostrar lista de paises (Escriba 1)");
            DESTINO = cap.nextLine();
            if(!(DESTINO.equals("1"))){
                for(String pais : PAISES2){
                    if(DESTINO.equals(pais)){
                        return DESTINO;
                    }else{
                    }
                }
                System.out.println("No Existe ese pais en el sistema!!!");
            }else{
                mostrarLista2();
            }
        }
    }
    
    public static int tomarClase(String mensaje){//THIS METHOD IS FOR DESTINATIONSELECTION
        do{//THE DO-WHILE LOOP IS USED TO REPEAT THE QUESTION IF AN INCORRECT NUMBER IS ENTERED
            System.out.println(mensaje);
            System.out.println("1=Primera Clase, 2=Ejecutivo, 3=turista");
            CLASE = cap.nextInt();
            switch(CLASE){
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                default:
                    System.out.println("Tipo de clase NO Valida!!!");
                    break;
            }
        }while(!(CLASE == 1) || (CLASE == 2) || (CLASE == 3));
        return -1;
    }   
    
    public static int tomarVuelo(String mensaje){//THIS METHOD IS FOR DESTINATIONSELECTION
        do{
            System.out.println(mensaje);
            System.out.println("1=Directo, 2=Con conexion");
            TIPOVUEL = cap.nextInt();
            switch(TIPOVUEL){
                case 1:
                    return 1;
                case 2:
                    return 2;
                default:
                    System.out.println("Tipo de vuelo NO Valido!!!");
                    break;
            }
        }while(!(TIPOVUEL == 1) || (TIPOVUEL == 2));
            return -1;
    }
    
    public static int tomarBoleto(String mensaje){//THIS METHOD IS FOR DESTINATION SELECTION
        do{
            System.out.println(mensaje);
            System.out.println("1=Ida, 2=Ida y Vuelta");
            TIPOBOL = cap.nextInt();
            cap.nextLine();
            switch(TIPOBOL){
                case 1:
                    return 1;
                case 2:
                    return 2;
                default:
                    System.out.println("Tipo de boleto NO Valido!!!");
                    break;
            }
        }while(!(TIPOBOL == 1) || (TIPOBOL == 2));
            return -1;
    }
    public static void mostrarLista1(){//RETURN THE COUNTRY LIST 1
        System.out.println("======================PAISES======================");
        for(int i = 0; i < PAISES1.length; i++){
            System.out.print(" -" + PAISES1[i]);
            if((i  + 1) % 5 == 0){
                System.out.println();
            }
        }
        System.out.println("");
    }
    public static void mostrarLista2(){//RETURN THE COUNTRY LIST 2
        System.out.println("======================PAISES======================");
        for(int i = 0; i < PAISES2.length; i++){
            System.out.print(" -" + PAISES2[i]);
            if((i  + 1) % 5 == 0){
                System.out.println();
            }
        }
        System.out.println("");
    }
    
    //METHOD FOR USER2
    public static String capturaDatos(String mensaje){//THIS IS A METHOD TO ACESS USER2
        String respuesta, respuest;
        int ciclo = 0;
        int cicle = 0;
        //We declare 4 other variables: responses and cycles
        
        System.out.println(mensaje);
        System.out.println("USER2:==========================ROL:TOMAR DATOS DEL PASAJERO");
        System.out.println("Cuantos pasajeros viajaran?");
        numps=cap.nextInt();
        cap.nextLine();
        //We capture the number of passengers
        
        APELL = new String[numps +1];
        NOMBR = new String[numps +1];
        //Initialize the arrays in position 1

        while(ciclo == 0){
        //The while repeats while cycle is equal to zero
            
            for(int i = 1; i <= numps;i++) {
        //This for will be repeated for the number of passengers

                System.out.println("Capturando datos para pasajero #" + i);
                System.out.print("Capture los Apellidos: ");
                APELL[i] = cap.nextLine();
                System.out.print("Capture Nombre/s: ");
                NOMBR[i] = cap.nextLine();
         //The first and last name is captured and displayed on the screen
                
                System.out.println("SUS DATOS SON: ");
                System.out.println("============REGISTRO============");
                System.out.println("SUS APELLIDOS SON: " + APELL[i]);
                System.out.println("SU NOMBRE ES: " + NOMBR[i]);
                System.out.println("================================");
                System.out.println("SON CORRECTOS SUS DATOS? (SI/NO)");
                respuesta = cap.nextLine();
          //Response one is captured
                
                if((respuesta.equals("SI"))||(respuesta.equals("si"))||(respuesta.equals("Si"))){
                    ciclo = 1;
          //If the data is correct the cycle one ends
          
                    if(i==numps){
          //If the passenger's position is equal to the amount
          //Capture email and phone number
                        
                        while(cicle == 0) {
                            System.out.print("Capture el correo:" );
                            EMAIL = cap.nextLine();
                            System.out.print("Capture el Num telefonico:" );
                            TELEF = cap.nextLine();
                            System.out.println("SON CORRECTOS SUS DATOS? (SI/NO)");
                            respuest = cap.nextLine();
          //Response two is captured

                            if((respuest.equals("SI"))||(respuest.equals("si"))||(respuest.equals("Si"))){
                                cicle = 1;
         //If the data is correct the cycle two ends

         //If you don't ask again
                            }else if((respuest.equals("NO"))||(respuest.equals("no"))||(respuest.equals("No"))) {
                                System.out.println("VOLVAMOS A CAPTURAR SUS DATOS.");
                            }else{ 
         //If it is not a valid answer, ask again
                                System.out.println("Respuesta no valida");
                            }   
                        }
                    }

          //If the data is not correct
         //it requests it again without changing the passenger's position
                }else if((respuesta.equals("NO"))||(respuesta.equals("no"))||(respuesta.equals("No"))) {
                    System.out.println("VOLVAMOS A CAPTURAR SUS DATOS.");
                    i--;
                }else{
                    System.out.println("Respuesta no valida");
                }
            }
        }
        //Finally, if the passenger selects 1, the captured data is displayed
        //If not, it won't print them.
        System.out.println("Mostrar datos (Escriba 1)");
        System.out.println("Salir         (Cualquiera)");
        int resp = cap.nextInt();
        cap.nextLine();
        if(resp == 1){
            System.out.println("Datos del pasajero al que se le enviaran los boletos: ");
            System.out.println("================================");
            System.out.println("SUS APELLIDOS SON: " + APELL[1]);
            System.out.println("EL NOMBRE ES: " + NOMBR[1]);
            System.out.println("EL CORREO ES:" + EMAIL);
            System.out.println("EL TELEFONO:" + TELEF);
            System.out.println("================================");
        }else{ 
        }
        return mensaje;
    }
}
    