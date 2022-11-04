package ninja.hesketh.configuracao;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;

public class Configuracao {
    private static CachingConnectionFactory connectionFactory;

    public static CachingConnectionFactory getConnection(){

        if(connectionFactory == null){
            connectionFactory = new CachingConnectionFactory("jackal-01.rmq.cloudamqp.com");//TODO add hostname
            connectionFactory.setUsername("zjpsxieu");//TODO add username
            connectionFactory.setPassword("UnaEjIOe3ODAl8I8A_kGFRYf1caD-9RD");//TODO add password
            connectionFactory.setVirtualHost("zjpsxieu");//TODO add virtualhost

            //Recommended settings
            connectionFactory.setRequestedHeartBeat(30);
            connectionFactory.setConnectionTimeout(30000);
        }

        return connectionFactory;
    }
}
