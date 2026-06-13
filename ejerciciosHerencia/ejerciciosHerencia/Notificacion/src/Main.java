public static void main(String[] args) {


    System.out.println("====== CAMPAÑA DE NOTIFICACIONES ======\n");

// Instanciamos los diferentes tipos de envíos
    Notificacion notifCorreo = new Correo("¡Gran promoción de verano!", 5000);
    Notificacion notifSMS = new SMS("Tu código de verificación es 8492", 150);

// Push normal (menos de 1000)
    Notificacion notifPushNormal = new Push("Tienes un nuevo mensaje", 800);

// Push masivo (más de 1000) para probar el descuento
    Notificacion notifPushMasivo = new Push("¡Actualización disponible!", 2000);

// Agrupamos en un arreglo aplicando POLIMORFISMO
    Notificacion[] campana = {notifCorreo, notifSMS, notifPushNormal, notifPushMasivo};

// Recorremos el arreglo para procesar los envíos
    for (Notificacion n : campana) {
        n.enviar();
        System.out.println("----------------------------------------");
    }
}