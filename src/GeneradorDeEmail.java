public class GeneradorDeEmail {
    public static void main(String[] args) {
        System.out.println("**Generado de Emails**");
        var nombre = "Ubaldo Acosta Soto";
        var empresa = "Global Mentoring";
        var dominio = ".com.mx";
        System.out.println("Nombre Usuario: "+nombre);
        var enMinusculasNombre= nombre.toLowerCase();
        var quitarEspaciosNombre= enMinusculasNombre.replace(" ",".");
        System.out.println("Nombre Usuario personalizado´: "+ quitarEspaciosNombre);
        System.out.println("Nombre empresa: "+empresa);
        System.out.println("Extension de dominio "+ dominio);
        var minusculasEmpresa = empresa.toLowerCase();
        var quitarEspaciosEmpresa=minusculasEmpresa.replace(" ","");
        var partefinalemail = new StringBuilder();
        partefinalemail.append("@").append(quitarEspaciosEmpresa).append(dominio);
        var email = new StringBuilder();
        email.append("email: ").append(quitarEspaciosNombre).append("@").append(quitarEspaciosEmpresa).append(dominio);
        System.out.println("Dominio email normalizado: "+ partefinalemail );
        System.out.println("Email fianl generado:" + email);
    }
}
