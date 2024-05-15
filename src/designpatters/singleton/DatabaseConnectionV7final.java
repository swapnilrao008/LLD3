package designpatters.singleton;



public class DatabaseConnectionV7final {
    private String url;
    private String username;
    private String password;
    private int port;

    private static DatabaseConnectionV7final dbc = null;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
    private DatabaseConnectionV7final(){

    };
    public static DatabaseConnectionV7final getInstance(){
        if(dbc==null) {
            synchronized (DatabaseConnectionV7final.class) {
                if (dbc == null) {
                    dbc = new DatabaseConnectionV7final();
                }
            }
        }
        return dbc;
    }



}
