package model;

import java.io.Serializable;

/**
 * ${VERSION}
 * Created by jack on 2018/3/1
 */

public class Command implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String data ;

    public Command(String data) {
        this.data = data ;
    }

    public String getData() {
        return this .data ;
    }

    @Override
    public String toString() {
        return "Command{" + "data='" + data + '\'' + '}';
    }
}
