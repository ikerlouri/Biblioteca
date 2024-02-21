package biblioteca;


public class Menu {

	
	

		public static final int GESTIONAR_LIBROS = 1;
		public static final int GESTIONAR_SOCIOS = 2;
		public static final int GESTIONAR_PRESTAMOS = 3;
		public static final int SALIR = 0;
		
		public static final int SACAR_LIBRO = 1;
		public static final int INSERTAR_LIBRO = 2;
		public static final int ELIMINAR_LIBRO = 3; 
		public static final int MODIFICAR_LIBRO = 4; 
		public static final int VOLVER = 5; 
		
		public static final int SACAR_SOCIO = 1;
		public static final int INSERTAR_SOCIO = 2;
		public static final int ELIMINAR_SOCIO = 3; 
		public static final int MODIFICAR_SOCIO = 4; 
		
		public static final int SACAR_PRESTAMO = 1;
		public static final int INSERTAR_PRESTAMO = 2;
		public static final int ELIMINAR_PRESTAMO = 3; 
		public static final int MODIFICAR_PRESTAMO = 4; 
			
		
		
	
		public static void mostrarMenuPrincipal() {
			
			System.out.println("------MENU------");
			System.out.println(SALIR + " SALIR" );
			System.out.println(GESTIONAR_LIBROS + " GESTIONAR LIBROS");
			System.out.println(GESTIONAR_SOCIOS + " GESTIONNAR SOCIOS") ;
			System.out.println(GESTIONAR_PRESTAMOS + " GESTIONAR PRESTAMOS");
			
			
		}
					
		
		public static void mostrarMenuLibros() {
			System.out.println("------MENU_LIBRO------");
			System.out.println(SACAR_LIBRO + " VER LIBRO");
			System.out.println(INSERTAR_LIBRO + " INSERTAR LIBRO");
			System.out.println(ELIMINAR_LIBRO + " ELIMINAR LIBRO") ;
			System.out.println(MODIFICAR_LIBRO + " MODIFICAR LIBRO");
			System.out.println(VOLVER + " Volver al menu principal" );
		
		}
		
		static void mostrarMenuSocios() {
			System.out.println("------MENU_SOCIO------");
			System.out.println(SACAR_SOCIO + " VER LIBRO");
			System.out.println(INSERTAR_SOCIO + " INSERTAR SOCIO");
			System.out.println(ELIMINAR_SOCIO + " ELIMINAR SOCIO") ;
			System.out.println(MODIFICAR_SOCIO + " MODIFICAR SOCIO");
			System.out.println(VOLVER + " Volver al menu principal" );
		}
		
		static void mostrarMenuPrestamo() {
			System.out.println("------MENU_PRESTAMO------");
			System.out.println(SACAR_PRESTAMO + " VER PRESTAMO" );
			System.out.println(INSERTAR_PRESTAMO + " INSERTAR PRESTAMO");
			System.out.println(ELIMINAR_PRESTAMO + " ELIMINAR PRESTAMO");
			System.out.println(MODIFICAR_PRESTAMO + " MODIFICAR PRESTAMO");
			System.out.println(VOLVER + " Volver al menu principal" );
		}
		
		
	}
		

		


			