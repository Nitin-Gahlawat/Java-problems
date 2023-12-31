//Question
    //WAP to show use of Final keyword in java.
//Answer
package staticAndFinal;
class Moon{
    final private String surface;

    Moon() {
        surface = "Rough";
    }

    final String getSurface(){
//        surface="Smooth";                                      //<-Not able to change the value
        return surface;
    }
}
final class Sun extends  Moon{
    int surfaceTemperature =200;
    int getTemperature(){
        return surfaceTemperature;
    }

//                                                              //<-Not allowed to override as the method is final
//          @override
//        String getSurface(){
//            return "gas";
//        }

}
//public class FinalKeyword extends Sun{                         // <-Error
public class FinalKeyword {
    public static void main(String[] args) {
        Moon ob=new Moon();
        System.out.println(ob.getSurface());

        Sun obj=new Sun();
        System.out.println(obj.getTemperature());
    }

}
