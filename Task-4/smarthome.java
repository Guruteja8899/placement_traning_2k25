interface sensorinput {
    boolean readvalue(double value);

    String getsensortype(String sensor);
}

class temperaturesensor {
    public boolean readvalue(double value) {
        System.out.println("The value of temeperature sensor: " + value + "*C");
        return true;
    }

    public String getsensortype(String sensor) {
        return "The " + sensor + " in being used";
    }

}

class moisturesensor {
    public boolean readvalue(double value) {
        System.out.println("The value of moisture sensor: " + value + " %");
        return true;
    }

    public String getsensortype(String sensor) {
        return "The " + sensor + " in being used";
    }

}

class doorsensor {
    public boolean readvalue(double value) {
        System.out.println("The value of door sensor: " + value);
        return true;
    }

    public String getsensortype(String sensor) {
        return "The " + sensor + " in being used";
    }

}

public class smarthome {
    public static void main(String[] args) {
        temperaturesensor t = new temperaturesensor();
        t.readvalue(27.2);
        System.out.println(t.getsensortype("Temperature sensor"));
        moisturesensor m = new moisturesensor();
        m.readvalue(50);
        System.out.println(m.getsensortype("Moistrue sensor"));
        doorsensor d = new doorsensor();
        d.readvalue(0);
        System.out.println(d.getsensortype("Door sensor"));
    }
}
