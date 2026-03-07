public class TvSet {

    private static volatile TvSet tvSetInstance = null;

    private TvSet(){
        System.out.println("Constructor is called");
    }

    public static TvSet getInstance(){
        if(tvSetInstance==null){ //opt
            synchronized(TvSet.class){ //T1 T2 waiting state 
                if(tvSetInstance == null)
                    return tvSetInstance = new TvSet();
            }
        }
        return tvSetInstance;
    }



}
