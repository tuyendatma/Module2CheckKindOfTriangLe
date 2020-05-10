public class checkTriangle {
    public static boolean isTriangle(int a,int b, int c){
        boolean conditionA= Math.abs(b-c)<a && a<b+c;
        boolean conditionB= Math.abs(a-c)<b && b<a+c;
        boolean conditionC= Math.abs(b-a)<c && c<b+a;
        boolean conditionD = (a>=0 && b>=0 && c>=0);
        boolean check =false;
        if(conditionD){
            if(conditionA || conditionB || conditionC){
                check =true;
            }
        }
        return check;
    }
    public static String kindOfTriangle(int a,int b,int c){
        String data ="";
        if(isTriangle(a, b, c)){
            if(a==b || a==c || b==c){
                if(a==b && a==c){
                    data = "tam giac deu";
                }else {
                    data = "tam giac can";
                }
            }else {
                data = "tam giac thuong";
            }
        }
        return data;
    }
}
