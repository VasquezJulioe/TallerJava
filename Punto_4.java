import java.util.Objects;
import java.util.Scanner;
public class Punto_4 {
    private static String anotacion,direccion,terminar;
    private static String nombreUsuario_0,nombreUsuario_1,nombreUsuario_2,nombreUsuario_3,nombreUsuario_4;
    private static double precio_peli_1,precio_peli_2,precio_peli_3,precio_peli_4,total_Dia,precio;
    private static int opcion,opcionPeliculas,opcionPeli,opcionRegresar,cantidadPeliculas,peli,cantPeliAlquilar,cantPeliRegresar;
    private static int usuario_0,usuario_1,usuario_2,usuario_3,usuario_4,identidad;
    private static int pelis_usuario_0,pelis_usuario_1,pelis_usuario_2,pelis_usuario_3,pelis_usuario_4;
    private static int disponiblePelis_1,disponiblePelis_2,disponiblePelis_3,disponiblePelis_4;
    private static boolean nuevoUsuario = true,finalizar = true;

    public static void main(String[] args) {
        // venta inicial del dia
        total_Dia = 100;
        // Nombre de Usuarios
        nombreUsuario_0 = "";
        nombreUsuario_1 = "Julio";
        nombreUsuario_2 = "Adriana";
        nombreUsuario_3 = "Yelenis";
        nombreUsuario_4 = "Juan";
        // Identicacion de Usuarios
        usuario_0 = 0;
        usuario_1 = 1;
        usuario_2 = 2;
        usuario_3 = 3;
        usuario_4 = 4;
        // pelis de los usuarios
        pelis_usuario_0 = 0;
        pelis_usuario_1 = 1;
        pelis_usuario_2 = 3;
        pelis_usuario_3 = 2;
        pelis_usuario_4 = 1;
        // precio de las peliculas
        precio_peli_1 = 20.5;
        precio_peli_2 = 30.1;
        precio_peli_3 = 25.7;
        precio_peli_4 = 15.9;
        // Peliculas disponibles
        disponiblePelis_1 = 2;
        disponiblePelis_2 = 3;
        disponiblePelis_3 = 4;
        disponiblePelis_4 = 2;
        cantidadPeliculas = disponiblePelis_1+disponiblePelis_2+disponiblePelis_3+disponiblePelis_4;
        do {
            System.out.println("Bienvenido a la tienda del barrio el Porvenir");
            System.out.print("Digite su Identificacion para iniciar: ");
            Scanner input = new Scanner(System.in);
            identidad = Integer.parseInt(input.next());
            if (identidad == usuario_1) {
                System.out.println(" ");
                System.out.println("Hola " + nombreUsuario_1 + " proceda a comprar en la tienda");
                if (pelis_usuario_1 > 0) {
                    System.out.print("Las peliculas que tienes son: " + pelis_usuario_1);
                    nuevoUsuario = true;
                }
            } else if (identidad == usuario_2) {
                System.out.println(" ");
                System.out.println("Hola " + nombreUsuario_2 + " proceda a comprar en la tienda");
                if (pelis_usuario_2 > 0) {
                    System.out.print("Las peliculas que tienes son: " + pelis_usuario_2);
                    nuevoUsuario = true;
                }
            } else if (identidad == usuario_3) {
                System.out.println(" ");
                System.out.println("Hola " + nombreUsuario_3 + " proceda a comprar en la tienda");
                if (pelis_usuario_3 > 0) {
                    System.out.print("Las peliculas que tienes son: " + pelis_usuario_3);
                    nuevoUsuario = true;
                }
            } else if (identidad == usuario_4) {
                System.out.println(" ");
                System.out.println("Hola " + nombreUsuario_4 + " proceda a comprar en la tienda");
                if (pelis_usuario_4 > 0) {
                    System.out.print("Las peliculas que tienes son: " + pelis_usuario_4);
                    nuevoUsuario = true;
                }
            } else {
                System.out.println("No se encuentra registrado, por favor registrese");
                nuevoUsuario = false;
            }

            if (!nuevoUsuario) {
                System.out.println("Ingrese sus datos");
                System.out.print("Ingrese su nombre completo: ");
                Scanner inputN = new Scanner(System.in);
                nombreUsuario_0 = inputN.nextLine();
                do {
                    System.out.print("Ingrese identificación: ");
                    Scanner inputNid = new Scanner(System.in);
                    usuario_0 = inputNid.nextInt();
                    if (usuario_0>0 & usuario_0<5) {
                        System.out.println("El usuario ya existe, digite una identificacion diferente");
                    }
                }while(usuario_0 >= 0 & usuario_0 < 5);
                identidad = usuario_0;
                System.out.print("Ingrese dirección: ");
                Scanner inputDir = new Scanner(System.in);
                direccion = inputDir.nextLine();
                System.out.println(" ");
                System.out.println("__________Datos del usuario registrado__________");
                System.out.println("Nombre: "+nombreUsuario_0);
                System.out.println("Identificación: "+usuario_0);
                System.out.println("Dirección: "+direccion);
                System.out.println("Gracias por su registro proceda a comprar en la tienda");
            }

            System.out.println(" ");
            System.out.println("Menu de opciones");
            System.out.println("1. Alquilar pelicula");
            System.out.println("2. Consultar peliculas disponibles");
            System.out.println("3. Regresar pelicula");
            System.out.println("4. Usuarios registrados");
            System.out.println("5. Ventas del Día");
            Scanner inputOpc = new Scanner(System.in);
            opcion = inputOpc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Elegir el tema de las peliculas disponibles");
                    System.out.println("1. Acción");
                    System.out.println("2. Misterio");
                    Scanner inputPelis = new Scanner(System.in);
                    opcionPeliculas = inputPelis.nextInt();
                    switch (opcionPeliculas) {
                        case 1 -> {
                            System.out.println("Elegir una de las siguientes peliculas de Acción");
                            System.out.println(" ");
                            System.out.println("___________________________");
                            System.out.println("1. Duro de matar 7");
                            System.out.println("Tema: Acción");
                            System.out.println("Edad mínima: 18+");
                            System.out.println("Duracion: 1:35:20");
                            System.out.println("Precuelas: 6");
                            System.out.println("Precio: " + precio_peli_1 + " pesos");
                            System.out.println("Disponibles: " + disponiblePelis_1);
                            System.out.println(" ");
                            System.out.println("___________________________");
                            System.out.println("2. John Wick 4");
                            System.out.println("Tema: Acción");
                            System.out.println("Edad mínima: 18+");
                            System.out.println("Duracion: 1:53:30");
                            System.out.println("Precuelas: 3");
                            System.out.println("Precio: " + precio_peli_2 + " pesos");
                            System.out.println("Disponibles: " + disponiblePelis_2);
                            System.out.println("___________________________");
                            Scanner inOpcionPeli = new Scanner(System.in);
                            opcionPeli = inOpcionPeli.nextInt();
                            switch (opcionPeli) {
                                case 1 -> {
                                    peli = 1;
                                    precio = precio_peli_1;
                                }
                                case 2 -> {
                                    peli = 2;
                                    precio = precio_peli_2;
                                }
                                default -> System.out.println("La opción elegida NO existe");
                            }
                        }
                        case 2 -> {
                            System.out.println("Elegir una de las siguientes peliculas de Misterio");
                            System.out.println(" ");
                            System.out.println("____________________________");
                            System.out.println("1. La Causa Perdida");
                            System.out.println("Tema: Misterio");
                            System.out.println("Edad mínima: 10+");
                            System.out.println("Duracion: 1:15:40");
                            System.out.println("Precuelas: 0");
                            System.out.println("Precio: " + precio_peli_3 + " pesos");
                            System.out.println("Disponibles: " + disponiblePelis_3);
                            System.out.println(" ");
                            System.out.println("____________________________");
                            System.out.println("2. En busca de la respuesta 2");
                            System.out.println("Tema: Misterio");
                            System.out.println("Edad mínima: 12+");
                            System.out.println("Duracion: 1:27:55");
                            System.out.println("Precuelas: 1");
                            System.out.println("Precio: " + precio_peli_4 + " pesos");
                            System.out.println("Disponibles: " + disponiblePelis_4);
                            System.out.println("____________________________");
                            System.out.println(" ");
                            Scanner inOpcionPeli2 = new Scanner(System.in);
                            opcionPeli = inOpcionPeli2.nextInt();
                            switch (opcionPeli) {
                                case 1 -> {
                                    peli = 3;
                                    precio = precio_peli_3;
                                }
                                case 2 -> {
                                    peli = 4;
                                    precio = precio_peli_4;
                                }
                                default -> System.out.println("La opción elegida NO existe");
                            }
                        }
                        default -> System.out.println("La opción elegida NO existe");
                    }
                    do {
                        System.out.print("Ingrese la cantidad que desee ordenar: ");
                        Scanner inputPeliAlq = new Scanner(System.in);
                        cantPeliAlquilar = inputPeliAlq.nextInt();
                    } while (cantPeliAlquilar < 0);
                    if (peli == 1) {
                        if (disponiblePelis_1 >= cantPeliAlquilar & disponiblePelis_1 > 0) {
                            disponiblePelis_1 = disponiblePelis_1 - cantPeliAlquilar;
                            if (identidad == usuario_1) {
                                pelis_usuario_1 = pelis_usuario_1 + cantPeliAlquilar;
                            }
                            if (identidad == usuario_2) {
                                pelis_usuario_2 = pelis_usuario_2 + cantPeliAlquilar;
                            }
                            if (identidad == usuario_3) {
                                pelis_usuario_3 = pelis_usuario_3 + cantPeliAlquilar;
                            }
                            if (identidad == usuario_4) {
                                pelis_usuario_4 = pelis_usuario_4 + cantPeliAlquilar;
                            }
                            if (identidad == usuario_0) {
                                pelis_usuario_0 = pelis_usuario_0 + cantPeliAlquilar;
                            }
                            total_Dia = total_Dia + precio * cantPeliAlquilar;
                            System.out.println(cantPeliAlquilar + " und. Duro de matar 7 Alquilada");
                            System.out.println("Valor total del servicio: " + precio * cantPeliAlquilar);
                        } else {
                            System.out.println("No hay esa cantidad, por favor revisar disponibilidad.");
                        }
                    }
                    if (peli == 2) {
                        if (disponiblePelis_2 >= cantPeliAlquilar & disponiblePelis_2 > 0) {
                            disponiblePelis_2 = disponiblePelis_2 - cantPeliAlquilar;
                            if (identidad == 1) {
                                pelis_usuario_1 = pelis_usuario_1 + cantPeliAlquilar;
                            }
                            if (identidad == 2) {
                                pelis_usuario_2 = pelis_usuario_2 + cantPeliAlquilar;
                            }
                            if (identidad == 3) {
                                pelis_usuario_3 = pelis_usuario_3 + cantPeliAlquilar;
                            }
                            if (identidad == 4) {
                                pelis_usuario_4 = pelis_usuario_4 + cantPeliAlquilar;
                            }
                            if (identidad < 1 | identidad > 4) {
                                pelis_usuario_0 = pelis_usuario_0 + cantPeliAlquilar;
                            }
                            total_Dia = total_Dia + precio * cantPeliAlquilar;
                            System.out.println("Valor total del servicio: " + precio * cantPeliAlquilar);
                            System.out.println(cantPeliAlquilar + " und. John Wick 4 Alquilada");
                        } else {
                            System.out.println("No hay esa cantidad, por favor revisar disponibilidad.");
                        }
                    }
                    if (peli == 3) {
                        if (disponiblePelis_3 >= cantPeliAlquilar & disponiblePelis_3 > 0) {
                            disponiblePelis_3 = disponiblePelis_3 - cantPeliAlquilar;
                            if (identidad == 1) {
                                pelis_usuario_1 = pelis_usuario_1 + cantPeliAlquilar;
                            }
                            if (identidad == 2) {
                                pelis_usuario_2 = pelis_usuario_2 + cantPeliAlquilar;
                            }
                            if (identidad == 3) {
                                pelis_usuario_3 = pelis_usuario_3 + cantPeliAlquilar;
                            }
                            if (identidad == 4) {
                                pelis_usuario_4 = pelis_usuario_4 + cantPeliAlquilar;
                            }
                            if (identidad < 1 | identidad > 4) {
                                pelis_usuario_0 = pelis_usuario_0 + cantPeliAlquilar;
                            }
                            total_Dia = total_Dia + precio * cantPeliAlquilar;
                            System.out.println("Valor total del servicio: " + precio * cantPeliAlquilar);
                            System.out.println(cantPeliAlquilar + " und. La Causa Perdida Alquilada");
                        } else {
                            System.out.println("No hay esa cantidad, por favor revisar disponibilidad.");
                        }
                    }
                    if (peli == 4) {
                        if (disponiblePelis_4 >= cantPeliAlquilar & disponiblePelis_4 > 0) {
                            disponiblePelis_4 = disponiblePelis_4 - cantPeliAlquilar;
                            if (identidad == 1) {
                                pelis_usuario_1 = pelis_usuario_1 + cantPeliAlquilar;
                            }
                            if (identidad == 2) {
                                pelis_usuario_2 = pelis_usuario_2 + cantPeliAlquilar;
                            }
                            if (identidad == 3) {
                                pelis_usuario_3 = pelis_usuario_3 + cantPeliAlquilar;
                            }
                            if (identidad == 4) {
                                pelis_usuario_4 = pelis_usuario_4 + cantPeliAlquilar;
                            }
                            if (identidad < 1 | identidad > 4) {
                                pelis_usuario_0 = pelis_usuario_0 + cantPeliAlquilar;
                            }
                            total_Dia = total_Dia + precio * cantPeliAlquilar;
                            System.out.println("Valor total del servicio: " + precio * cantPeliAlquilar);
                            System.out.println(cantPeliAlquilar + " und. En busca de la respuesta 2 Alquilada");
                        } else {
                            System.out.println("No hay esa cantidad, por favor revisar disponibilidad.");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("         Peliculas disponibles");
                    if (disponiblePelis_1 > 0) {
                        System.out.println(disponiblePelis_1 + " und. Duro de matar 7 " + "-Precio: " + precio_peli_1 + " pesos");
                    }
                    if (disponiblePelis_2 > 0) {
                        System.out.println(disponiblePelis_2 + " und. John Wick 4 " + "-Precio: " + precio_peli_2 + " pesos");
                    }
                    if (disponiblePelis_3 > 0) {
                        System.out.println(disponiblePelis_3 + " und. La Causa Perdida " + "-Precio: " + precio_peli_3 + " pesos");
                    }
                    if (disponiblePelis_4 > 0) {
                        System.out.println(disponiblePelis_4 + " und. En busca de la respuesta 2 " + "-Precio: " + precio_peli_4 + " pesos");
                    }
                    cantidadPeliculas = disponiblePelis_1+disponiblePelis_2+disponiblePelis_3+disponiblePelis_4;
                    System.out.println("Total peliculas disponibles: " + cantidadPeliculas);
                }
                case 3 -> {
                    System.out.println("          Peliculas para regresar");
                    System.out.println("1." + " Duro de matar 7 " + "-Precio: " + precio_peli_1 + " pesos");
                    System.out.println("2." + " John Wick 4 " + "-Precio: " + precio_peli_2 + " pesos");
                    System.out.println("3." + " La Causa Perdida " + "-Precio: " + precio_peli_3 + " pesos");
                    System.out.println("4." + " En busca de la respuesta 2 " + "-Precio: " + precio_peli_4 + " pesos");
                    System.out.print("Qué pelicula desea entregar?: ");
                    Scanner inputRe = new Scanner(System.in);
                    opcionRegresar = inputRe.nextInt();
                    switch (identidad) {
                        case 1 -> {
                            do {
                                System.out.print("Cuantas peliculas desea entregar: ");
                                cantPeliRegresar = inputRe.nextInt();
                            } while (cantPeliRegresar > pelis_usuario_1);
                            pelis_usuario_1 = pelis_usuario_1 - cantPeliRegresar;
                        }
                        case 2 -> {
                            do {
                                System.out.print("Cuantas peliculas desea entregar: ");
                                cantPeliRegresar = inputRe.nextInt();
                            } while (cantPeliRegresar > pelis_usuario_2);
                            pelis_usuario_2 = pelis_usuario_2 - cantPeliRegresar;
                        }
                        case 3 -> {
                            do {
                                System.out.print("Cuantas peliculas desea entregar: ");
                                cantPeliRegresar = inputRe.nextInt();
                            } while (cantPeliRegresar > pelis_usuario_3);
                            pelis_usuario_3 = pelis_usuario_3 - cantPeliRegresar;
                        }
                        case 4 -> {
                            do {
                                System.out.print("Cuantas peliculas desea entregar: ");
                                cantPeliRegresar = inputRe.nextInt();
                            } while (cantPeliRegresar > pelis_usuario_4);
                            pelis_usuario_4 = pelis_usuario_4 - cantPeliRegresar;
                        }
                        case 5 -> {
                            do {
                                System.out.print("Cuantas peliculas desea entregar: ");
                                cantPeliRegresar = inputRe.nextInt();
                            } while (cantPeliRegresar > pelis_usuario_0);
                            pelis_usuario_0 = pelis_usuario_0 - cantPeliRegresar;
                        }
                        default -> System.out.print("Usuario no existe por la tanto, nunca llegara aquí");
                    }
                    switch (opcionRegresar) {
                        case 1 -> {
                            disponiblePelis_1 = disponiblePelis_1 + cantPeliRegresar;
                            System.out.println(disponiblePelis_1 + " und. Duro de matar 7 " + "-Precio: " + precio_peli_1 + " pesos");
                        }
                        case 2 -> {
                            disponiblePelis_2 = disponiblePelis_2 + cantPeliRegresar;
                            System.out.println(disponiblePelis_2 + " und. John Wick 4 " + "-Precio: " + precio_peli_2 + " pesos");
                        }
                        case 3 -> {
                            disponiblePelis_3 = disponiblePelis_3 + cantPeliRegresar;
                            System.out.println(disponiblePelis_3 + " und. La Causa Perdida " + "-Precio: " + precio_peli_3 + " pesos");
                        }
                        case 4 -> {
                            disponiblePelis_4 = disponiblePelis_4 + cantPeliRegresar;
                            System.out.println(disponiblePelis_4 + " und. En busca de la respuesta 2 " + "-Precio: " + precio_peli_4 + " pesos");
                        }
                        default -> System.out.println("La opción elegida NO existe");
                    }
                    cantidadPeliculas = cantidadPeliculas + cantPeliRegresar;
                    System.out.print("Desea hacer una nota: ");
                    Scanner inputn = new Scanner(System.in);
                    anotacion = inputn.nextLine();
                }
                case 4 -> {
                    System.out.println("   Usuarios registrados");
                    System.out.println(" ___________________________");
                    System.out.println("Usuario 1");
                    System.out.println("Nombre: " + nombreUsuario_1);
                    System.out.println("Identificion: " + usuario_1);
                    System.out.println("Peliculas que tiene: " + pelis_usuario_1);
                    System.out.println(" ___________________________");
                    System.out.println("Usuario 2");
                    System.out.println("Nombre: " + nombreUsuario_2);
                    System.out.println("Identificion: " + usuario_2);
                    System.out.println("Peliculas que tiene: " + pelis_usuario_2);
                    System.out.println(" ___________________________");
                    System.out.println("Usuario 3");
                    System.out.println("Nombre: " + nombreUsuario_3);
                    System.out.println("Identificion: " + usuario_3);
                    System.out.println("Peliculas que tiene: " + pelis_usuario_3);
                    System.out.println(" ___________________________");
                    System.out.println("Usuario 4");
                    System.out.println("Nombre: " + nombreUsuario_4);
                    System.out.println("Identificion: " + usuario_4);
                    System.out.println("Peliculas que tiene: " + pelis_usuario_4);
                    if (usuario_0 != 0) {
                        System.out.println(" ___________________________");
                        System.out.println("Usuario Nuevo");
                        System.out.println("Nombre: " + nombreUsuario_0);
                        System.out.println("Identificion: " + usuario_0);
                        System.out.println("Peliculas que tiene: " + pelis_usuario_0);
                    }
                    System.out.println(" ");
                }
                case 5 -> {
                    System.out.println("Venta Total del día");
                    System.out.println(total_Dia + " pesos");
                }
                default -> System.out.println("La opción elegida NO existe");
            }


            System.out.println(" ");
            System.out.print("Deseas terminar el dia? (S/N): ");
            Scanner inputT = new Scanner(System.in);
            terminar = inputT.nextLine();
            if ((Objects.equals(terminar, "s")) || (Objects.equals(terminar, "S"))) {
                finalizar = false;
                System.out.println (" ");
                System.out.println ("Total ventas del día");
                System.out.println (total_Dia+ " pesos");
                System.out.print ("Gracias! Por utilizar este programa!");
            } else{
                System.out.println("Nueva operacion:");
            }
        } while (finalizar);
    }
}
