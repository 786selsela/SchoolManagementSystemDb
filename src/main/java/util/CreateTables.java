package util;

public class CreateTables {


    public void createTables() {
        ConnectionFactory connectionFactory = ConnectionFactory.GET_SESSION.getInstance();
        connectionFactory.commit();
        connectionFactory.closeSession();
    }


}
