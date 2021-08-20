import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Empresa
        Empresa SAMSUNG = new Empresa("XIAOMI","Calle falsa 123",34,"21",3421312,"75931857","C/AVE DEÑ PARAISO N°203",Calendar.getInstance().getTime());

        //Proveedores
        Proveedores hanzu = new Proveedores("8989832","BERGAMO",Calendar.getInstance().getTime(),927432);

        //Compras
        Monitores DAITSU = new Monitores(4321,"XIAOMI CURVED 24",1440,Calendar.getInstance().getTime());
        Impresora kia = new Impresora(53321,"xiaomi run",30,Calendar.getInstance().getTime());
        Otros Repetidor = new Otros(3223,"XIAOMI MI WIFI AMPLIFIER",Calendar.getInstance().getTime());

        //LO MAS CARO
        Cpus Apple = new Cpus("Xiaomi titan",2213,"12 terabytes", Calendar.getInstance().getTime(),"hong Kong");

        //Alquiler
        Alquiler sotano = new Alquiler(8783,3000,9473345);





        //imprimimos
        System.out.println("*****NOMBRE DE LA EMPRESA:*****");
        System.out.println(SAMSUNG.getNombre());

        System.out.println("*****DIRECCION DE LA EMPRESA:*****");
        System.out.println(SAMSUNG.getDireccion());
        System.out.println(SAMSUNG.getDomicilio());

        System.out.println("*****NUMERO DE EMPLEADOS DE LA EMPRESA:*****");
        System.out.println(SAMSUNG.getNumeroempleados());

        System.out.println("*****PERSONAS DEL SOPORTE:*****");
        System.out.println(SAMSUNG.getSoporte());

        System.out.println("*****TELEFONO DE LA EMPRESA:*****");
        System.out.println(SAMSUNG.getTelefono());

        System.out.println("*****DIA QUE FUE COMPRADA LA EMPRESA:*****");
        System.out.println(SAMSUNG.getFechaComprada());

        System.out.println("*****PROVEEDORES:*****");
        System.out.println(hanzu.getNit());
        System.out.println(hanzu.getDireccion());
        System.out.println(hanzu.getFechaAdquirida());
        System.out.println(hanzu.getCantidadProductos());

        System.out.println("**********");
        System.out.println("**********");

        System.out.println("*****COMPRAS:*****");
        System.out.println("*****MONITORES:*****");
        System.out.println(DAITSU.getModelo());
        System.out.println(DAITSU.getCodigo());
        System.out.println(DAITSU.getResolucion());
        System.out.println(DAITSU.getFechaCreada());

        System.out.println("*****iMPRESORA:*****");
        System.out.println(kia.getModelo());
        System.out.println(kia.getCodigo());
        System.out.println(kia.getVelocidad());
        System.out.println(kia.getFechacreada());
        System.out.println("*****OTROS:*****");
        System.out.println(Repetidor.getModelo());
        System.out.println(Repetidor.getCodigo());
        System.out.println(Repetidor.getFechaCreada());

        System.out.println("*****CPUS:*****");
        System.out.println(Apple.getModelo());
        System.out.println(Apple.getCodigo());
        System.out.println(Apple.getMemoriaPrincipal());
        System.out.println(Apple.getFechaCreada());
        System.out.println(Apple.getPaisOrigen());

        System.out.println("-----Alquiler----");
        System.out.println(sotano.getCodigo());
        System.out.println("-----PRECIO----");
        System.out.println(sotano.getPrecio());
        System.out.println("-----CAPACIDAD----");
        System.out.println(sotano.getCapacidad());

    }
}
