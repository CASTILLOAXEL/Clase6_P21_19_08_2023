package PKG.Ejercicio;

import java.util.ArrayList;
import java.util.List;
public class CLSEjercicio6 {

    private String nombre;
    private double suedo_base;
    private double descuento;
    private double sueldo_liquido;
//getter and setter de los atributos de la clase CLSEjercicio6
//    public CLSEjercicio6(String nombre, double suedo_base, double descuento, double sueldo_liquido) {
//        this.nombre = nombre;
//        this.suedo_base = suedo_base;
//        this.descuento = descuento;
//        this.sueldo_liquido = sueldo_liquido;
  //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSuedo_base() {
        return suedo_base;
    }

    public void setSuedo_base(double suedo_base) {
        this.suedo_base = suedo_base;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getSueldo_liquido(int i) {
        return sueldo_liquido;
    }

    public void setSueldo_liquido(double sueldo_liquido) {
        this.sueldo_liquido = sueldo_liquido;
    }

    public void ejercicio() {
        CLSEjercicio6 empleado1 = new CLSEjercicio6();
        List<CLSEjercicio6> empleados = new ArrayList<>();
        empleado1.setNombre("Juan");
        empleado1.setSuedo_base(3500);
        empleado1.setDescuento(500);
        empleado1.setSueldo_liquido(3000);
        empleados.add(empleado1);

        CLSEjercicio6 empleado2 = new CLSEjercicio6();
        empleado2.setNombre("Maria");
        empleado2.setSuedo_base(2000);
        empleado2.setDescuento(300);
        empleado2.setSueldo_liquido(1700);
        empleados.add(empleado2);

        CLSEjercicio6 empleado3 = new CLSEjercicio6();
        empleado3.setNombre("Pedro");
        empleado3.setSuedo_base(1500);
        empleado3.setDescuento(200);
        empleado3.setSueldo_liquido(1300);
        empleados.add(empleado3);

        CLSEjercicio6 empleado4 = new CLSEjercicio6();
        empleado4.setNombre("Jose");
        empleado4.setSuedo_base(1000);
        empleado4.setDescuento(100);
        empleado4.setSueldo_liquido(900);
        empleados.add(empleado4);

        for ( CLSEjercicio6 empleado: empleados) {
            System.out.println("Nombre del empleado: "+empleado.getNombre());
            System.out.println("Sueldo base: "+empleado.getSuedo_base());
            System.out.println("Descuento: "+empleado.getDescuento());
            System.out.println("Sueldo liquido: "+empleado.getSueldo_liquido(3000));
        }
    }




}

