class Volt{
    private int volts;
    public Volt(int v){
        this.volts=v;
    }
    public int getVolts(){
        return volts;
    }
    public void setVolts(int volts){
        this.volts=volts;
    }
}
class Socket{
    public  Volt getVolt(){
        return new Volt(120);
    }
}

interface SocketAdapter{
    public Volt get120Volt();
    public Volt get12Volt();
    public Volt get3Volt();
}

class SocketClassAdapter extends Socket implements SocketAdapter{
    @Override
    public Volt get120Volt() {
        return getVolt();
    }
    @Override
    public Volt get12Volt() {
        Volt v=getVolt();
        return convertVolt(v,10);
    }
    @Override
    public Volt get3Volt() {
        Volt v=getVolt();
        return convertVolt(v,40);

    }
    private Volt convertVolt(Volt v,int i){
        return new Volt(v.getVolts()/i);
    }
}


public class AdapterPatternDemo {
    public static void main(String[] args) {

        SocketAdapter sa=new SocketClassAdapter();
        Volt v120=sa.get120Volt();
        Volt v12=sa.get12Volt();
        Volt v3=sa.get3Volt();
        System.out.println(v120.getVolts());
        System.out.println(v12.getVolts());
        System.out.println(v3.getVolts());
        

        
    }
    
}
