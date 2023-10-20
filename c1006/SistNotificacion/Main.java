package c1006.SistNotificacion;

public class Main {
    public static void main(String[] args) {
        System.out.println("asd");

        CorreoElectronico correoElectronico = new CorreoElectronico();
        correoElectronico.enviarNotificacion();

        SMS sms = new SMS();
        sms.enviarNotificacion();

        PushNotification pushNotification = new PushNotification();
        pushNotification.enviarNotificacion();
    }
}

interface INotificacion {
    void enviarNotificacion();
}
