package db;

public class DbException extends RuntimeException{

    private static final long serialVersionuid = 1l;

    public DbException(String msg){
        super(msg);
    }

}
