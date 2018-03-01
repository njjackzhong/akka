

import akka.actor.ActorRef;
import akka.actor.Props;
import com.jsc.akka.actor.SimpleActor;
import model.Command;


/**
 *
 * @author lcq
 *
 * 源码位置：http://blog.csdn.net/liuchangqing123/article/details/45796255
 * 其他参考：
 *
 */
public class ActorSystemTest {


    public static void main(String... args) throws Exception {

        final akka.actor.ActorSystem actorSystem = akka.actor.ActorSystem.create("actor-system");

        Thread.sleep(5000);

        final ActorRef actorRef = actorSystem.actorOf(Props.create(SimpleActor.class), "simple-actor");

        actorRef.tell( new Command("CMD 1" ), null);
        actorRef.tell( new Command("CMD 2" ), null);
        actorRef.tell( new Command("CMD 3" ), null);
        actorRef.tell( new Command("CMD 4" ), null);
        actorRef.tell( new Command("CMD 5" ), null);

        Thread.sleep(5000);

        System.out.println( "Actor ActorSystemTest Shutdown Starting..." );

        actorSystem.terminate();
        //actorSystem.shutdown();
    }
}

