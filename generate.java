public class RandomNumber {
public static void main(String[] args){

generateMyNumber();

//BY #ASIM_ALTAYB
}
public static void generateMyNumber()
{
String aNumber = "";
for(int i=0 ; i<1000 ; i++){
    aNumber+="096";//start with 
    int n=0;
n= (int)((Math.random() * 9000000)+1000000);//number of digits 7
aNumber+=Integer.toString(n); //start with + number of digits 7 = 10 digits 
System.out.println((aNumber));
aNumber="";// after all loop we need to be that is empty .
    
}
}

}
